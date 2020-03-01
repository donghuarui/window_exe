package com.dhr;

import com.dhr.window.MainWindow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WindowExeApplication {

	public static void main(String[] args) {
//      	MainWindow mainWindow = new MainWindow();
		//SpringApplication.run(WindowExeApplication.class, args);

		SpringApplicationBuilder builder = new SpringApplicationBuilder(WindowExeApplication.class);
		ApplicationContext applicationContext = builder.headless(false).run(args);
	}

}
