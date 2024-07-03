package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.model.bd;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @Column(name = "idesp")
    private String idEsp;

    @Column(name = "nomesp")
    private String nomEsp;

    @Column(name = "costo")
    private Double costo;
}

