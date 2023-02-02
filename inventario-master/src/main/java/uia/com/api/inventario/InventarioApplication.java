package uia.com.api.inventario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.neo4j.core.Neo4jClient;

@SpringBootApplication
public class InventarioApplication extends SpringBootServletInitializer implements CommandLineRunner {


	public static void main(String[] args) {

		SpringApplication.run(InventarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MiNeo4JDriver miNeo4JDriver = new MiNeo4JDriver();
	}
}
