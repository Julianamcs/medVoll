package med.voll.api;

import jakarta.persistence.Entity;
import net.minidev.json.writer.BeansMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MedVollApplication {

	public static void main(String[] args) {

		SpringApplication.run(MedVollApplication.class, args);
	}

}
