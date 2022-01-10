package dev;

import dev.ihm.Menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(App.class, args);

		Menu menu = context.getBean(Menu.class);

		menu.afficher();
	}
}
