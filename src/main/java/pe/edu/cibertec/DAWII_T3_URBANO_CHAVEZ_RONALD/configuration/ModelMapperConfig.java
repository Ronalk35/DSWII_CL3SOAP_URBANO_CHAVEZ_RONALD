package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}


// Configuracion de mapper //