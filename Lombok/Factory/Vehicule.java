@UtilityClass
public class VehiculeFactory
{
    @Builder(builderClassName="SmallBuilder", builderMethodName="smallBuilder")
    public static Vehicule newVehicule(String numeroChassis, String numeroMoteur)
    {
        return Vehicule.builder().numeroChassis(numeroChassis)
                     .numeroMoteur(numeroMoteur)
                     .dateMiseEnCirculation(LocalDate.now())
                     .numeroImmatriculation("XX-XXX-XX")
                     .build();
    }

    @Builder(builderClassName="FullBuilder", builderMethodName="fullBuilder")
    public static Vehicule newVehicule(String numeroChassis,
                       String numeroMoteur,
                       LocalDate dateMiseEnCirculation,
                       String numeroImmatriculation)
    {
        return Vehicule.builder().numeroChassis(numeroChassis)
                     .numeroMoteur(numeroMoteur)
                     .dateMiseEnCirculation(dateMiseEnCirculation)
                     .numeroImmatriculation(numeroImmatriculation)
                     .build();
    }
}