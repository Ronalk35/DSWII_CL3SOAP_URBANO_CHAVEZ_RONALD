package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.model.bd;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pagos")
@IdClass(PagosId.class)
public class Pagos {
    @Id
    @Column(name = "idalumno")
    private String idAlumno;

    @Id
    @Column(name = "ciclo")
    private String ciclo;

    @Id
    @Column(name = "ncuota")
    private Integer ncuota;

    @Column(name = "monto")
    private Double monto;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fecha;
}