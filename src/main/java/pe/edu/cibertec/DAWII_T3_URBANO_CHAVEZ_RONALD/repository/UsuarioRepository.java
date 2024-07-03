package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.model.bd.Usuario;

@Repository
public interface UsuarioRepository
        extends JpaRepository<Usuario, Integer> {


    Usuario findByNomusuario(String nomusuario);

    Usuario findByNombres(String nombres);

}
