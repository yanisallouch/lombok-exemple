@FieldDefaults(level=AccessLevel.PROTECTED) // le constructeur avec tous les arguments est nécessaire au Builder, mais pour le rendre inaccessible depuis un autre package, mais toujours depuis le Builder, je le place ici en protected
@EqualsAndHashCode(of= {"numeroMoteur","numeroChassis"})
@ToString(of= {"numeroMoteur","numeroChassis","numeroImmatriculation","dateMiseEnCirculation"})
@Builder // génère une classe interne de type « Builder » capable de construire au moyen de « method chaining » une instance de la classe. L'opération terminale sera build() ;
public class Vehicule implements Serializable
{
    @Getter
    @NonNull // indique au Builder tous les champs obligatoires
    String numeroMoteur;

    @Getter
    @NonNull
    String numeroChassis;

    @Getter
    @NonNull
    LocalDate dateMiseEnCirculation;

    @Getter    @Setter
    String numeroImmatriculation;

    // champs de relation
    @Getter
    @Singular // indique au Builder que l'on pourra ajouter des occurrences à la liste toujours grâce à du method chaining.
    List<Intervention> interventions = new ArrayList<>();
}