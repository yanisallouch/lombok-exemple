@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of= {"numeroMoteur","numeroChassis"})
@ToString(of= {"numeroMoteur","numeroChassis","numeroImmatriculation","dateMiseEnCirculation"})
public class Vehicule implements Serializable
{
    // champs métier
    String numeroMoteur;
    String numeroChassis;
    String numeroImmatriculation;
    LocalDate dateMiseEnCirculation;

    // champs de relation
    List<Intervention> interventions = new ArrayList<>();
}