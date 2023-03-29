@FieldDefaults(level=AccessLevel.PRIVATE)
@RequiredArgsConstructor(staticName="of")
@EqualsAndHashCode(of= {"numeroMoteur","numeroChassis"})
@ToString(of= {"numeroMoteur","numeroChassis","numeroImmatriculation","dateMiseEnCirculation"})
public class Vehicule implements Serializable
{
    @Getter
    final String numeroMoteur;

    @Getter
    final String numeroChassis;

    @Getter
    final LocalDate dateMiseEnCirculation;

    @Getter     @Setter
    String numeroImmatriculation;

    // champs de relation
    @Getter
    List<Intervention> interventions = new ArrayList<>();
}