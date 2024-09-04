package com.studies.java21_poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.StringTemplate.STR;

@SpringBootApplication
public class Java21PocApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java21PocApplication.class, args);
		Todo t = new Todo("Learn Java 21", false);
		System.out.println(stringTemplate("Tiago"));
	}


	// To create a record:
	public record Todo(String title, boolean completed){}

	public static String stringTemplate(String param){
		return  STR."Hello \{param}";
	}
}
