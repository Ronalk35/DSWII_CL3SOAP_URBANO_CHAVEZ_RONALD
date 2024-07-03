package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.model.bd;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotasId implements java.io.Serializable {
    @Column(name = "idalumno")
    private String idAlumno;

    @Column(name = "idcurso")
    private String idCurso;
}