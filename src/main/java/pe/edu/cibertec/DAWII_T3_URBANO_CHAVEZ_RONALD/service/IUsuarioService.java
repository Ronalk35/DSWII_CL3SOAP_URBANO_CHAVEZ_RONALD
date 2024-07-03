package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.service;

import pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario);
}
