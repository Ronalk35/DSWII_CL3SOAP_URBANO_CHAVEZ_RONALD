package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.model.dto;

import lombok.Data;

@Data
public class NotasPublicacionDto implements DtoEntity {
    private Float exaParcial;
    private Float exaFinal;
    private String nombreCurso;
    private String apellidoAlumno;
    private String nombreAlumno;
}
