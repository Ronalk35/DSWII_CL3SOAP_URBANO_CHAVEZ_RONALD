package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@PreAuthorize("hasRole('Administrador')")
@RestController
@RequestMapping("api/v1/files")
public class FileController {

    private static final String DIRECTORY = System.getProperty("user.dir") + "/Documentos";

    @PostMapping("/filesdoc")
    public ResponseEntity<String> uploadFile(MultipartFile file) {

        if (!file.getOriginalFilename().endsWith(".doc")) {
            return new ResponseEntity<>("Solo se permiten archivos .doc", HttpStatus.BAD_REQUEST);
        }

        if (file.getSize() > 2 * 1024 * 1024) { // 2MB
            return new ResponseEntity<>("El archivo excede el tamaño máximo permitido de 2MB", HttpStatus.BAD_REQUEST);
        }


        File directory = new File(DIRECTORY);
        if (!directory.exists()) {
            directory.mkdirs();
        }


        try {
            File dest = new File(directory, file.getOriginalFilename());
            file.transferTo(dest);
            return new ResponseEntity<>("Archivo subido exitosamente", HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error al subir el archivo", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
