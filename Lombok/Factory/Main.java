Vehicule v1 = VehiculeFactory.smallBuilder()
              .numeroChassis("AAABB123")
              .numeroMoteur("123ABCD")
              .build();

Vehicule v2 = VehiculeFactory.fullBuilder()
              .numeroChassis("AAABB578")
              .numeroMoteur("458AAA")
              .dateMiseEnCirculation(LocalDate.now())
              .numeroImmatriculation("789-AAA-987")
              .build();

System.out.println(v1);
// Vehicule(numeroMoteur=123ABCD, numeroChassis=AAABB123, dateMiseEnCirculation=2018-03-06, numeroImmatriculation=XX-XXX-XX)
System.out.println(v2);
// Vehicule(numeroMoteur=458AAA, numeroChassis=AAABB578, dateMiseEnCirculation=2018-03-06, numeroImmatriculation=789-AAA-987)
