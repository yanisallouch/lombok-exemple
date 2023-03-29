@FieldDefaults(level=AccessLevel.PRIVATE)
@AllArgsConstructor(staticName="of")
@EqualsAndHashCode(of="dateIntervention")
@ToString
@Getter
public class Intervention implements Serializable, Comparable<Intervention>
{
    final LocalDate dateIntervention;

    final Long kilometrage;

    @Setter
    String libelle;

    @Setter
    BigDecimal prix;

    @Override
    public int compareTo(Intervention o)
    {
        return this.dateIntervention.compareTo(o.getDateIntervention());
    }
}