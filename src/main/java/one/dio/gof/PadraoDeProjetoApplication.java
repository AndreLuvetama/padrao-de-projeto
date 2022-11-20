package one.dio.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PadraoDeProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadraoDeProjetoApplication.class, args);
	}

}
