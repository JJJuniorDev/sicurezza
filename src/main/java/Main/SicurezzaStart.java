package Main;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = {
		"Main",
		"Repository.Sicurezza",
		"Security",
		"Services",
		"Filters",
		"Utils",
		"Controller",
		"Dto",
		//"Services.Auth",
		"Model",
		//"Converter",
		//"MongoConfiguration",
		//"DatabaseHealth"
		})
@EnableMongoRepositories(basePackages = "Repository.Sicurezza")
public class SicurezzaStart {

    public static void main(String[] args) {
        SpringApplication.run(SicurezzaStart.class, args);
    }

	   
	      
	    

}
