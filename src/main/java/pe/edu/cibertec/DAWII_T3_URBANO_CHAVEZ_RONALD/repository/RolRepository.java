package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.model.bd.Rol;

@Repository
public interface RolRepository extends
        JpaRepository<Rol, Integer> {

    Rol findByNomrol(String nomrol);
}
