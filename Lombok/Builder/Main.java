Vehicule.VehiculeBuilder builder = Vehicule.builder();

Vehicule v = builder.numeroChassis("AABBCC123")
        .numeroMoteur("X06123")
        .dateMiseEnCirculation(LocalDate.of(1989, 01, 18))
        .numeroImmatriculation("AA-123-BB")
        .intervention(Intervention.of(LocalDate.of(2018, 03, 05), 1850000L, "Vidange", new BigDecimal("175.0")))
        .intervention(Intervention.of(LocalDate.of(2018, 02, 03), 1840000L, "Freins", new BigDecimal("210.0")))
        .intervention(Intervention.of(LocalDate.of(2018, 01, 15), 1830000L, "Embrayage", new BigDecimal("350.0")))
        .intervention(Intervention.of(LocalDate.of(2017, 12, 10), 1820000L, "Pneus", new BigDecimal("450.0")))
        .build();

System.out.println(v);
v.getInterventions().forEach(System.out::println);

/*
Vehicule(numeroMoteur=X06123, numeroChassis=AABBCC123, dateMiseEnCirculation=1989-01-18, numeroImmatriculation=AA-123-BB)
Intervention(dateIntervention=2018-03-05, kilometrage=1850000, libelle=Vidange, prix=175.0)
Intervention(dateIntervention=2018-02-03, kilometrage=1840000, libelle=Freins, prix=210.0)
Intervention(dateIntervention=2018-01-15, kilometrage=1830000, libelle=Embrayage, prix=350.0)
Intervention(dateIntervention=2017-12-10, kilometrage=1820000, libelle=Pneus, prix=450.0)
*/