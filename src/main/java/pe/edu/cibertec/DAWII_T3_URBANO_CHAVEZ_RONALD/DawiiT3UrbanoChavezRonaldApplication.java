package pe.edu.cibertec.DAWII_T3_URBANO_CHAVEZ_RONALD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DawiiT3UrbanoChavezRonaldApplication {

	public static void main(String[] args) {
		SpringApplication.run(DawiiT3UrbanoChavezRonaldApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer configGlobalCors(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("api/v1/**")
						.allowedMethods("GET", "POST", "PUT")
						.allowedOrigins("https://www.cibertec.edu.pe");
			}
		};
	}


}
