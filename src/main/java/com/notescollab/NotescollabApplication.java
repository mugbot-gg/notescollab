package com.notescollab;

import com.notescollab.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SecurityConfig.RsaKeyProperties.class)
public class NotescollabApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotescollabApplication.class, args);
	System.out.println("*Prerequisites to setup project locally*\n");
        System.out.println("1. Java 17 or above");
        System.out.println("2. Download PostgreSQL");
        System.out.println("3. Have Maven installed on device, or an IDE that has it already on it");
        System.out.println("4. Have SpringBoot version: 3.2.1 installed\n");
        System.out.println("*Steps to setup project*\n");
        System.out.println("1. Once you have made sure to install, or check if you have installed Java 17 and Maven you can move on to step 2");
        System.out.println("2. Fork the project on GitHub and then clone it so the project is on your device");
        System.out.println("3. Go to the directory that you saved the cloned project and run these commands: (mvn clean install), and then,(mvn spring-boot:run)\n");
        System.out.println("If you have any question's, please view our profiles on GitHub to contact us");
	}

}
