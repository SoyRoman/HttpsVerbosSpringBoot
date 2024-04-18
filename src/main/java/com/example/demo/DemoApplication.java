package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate){

		return args -> {
			Address address = new Address(
					"Colombia",
					"Cali",
					"NE9"
			);

			String email = "camiloroman@gmail.com";
			Student student = new Student(

					"Camilo",
					"Roman",
					email,
					Gender.MALE,
					address,
					List.of("Computer science", "software engineering", "software architecture"),
					BigDecimal.TEN,
					LocalDateTime.now()

			);

			//usingMongoTemplateAndQuery(repository, mongoTemplate, email, student);
			repository.findStudentByEmail(email)
					.ifPresentOrElse(s ->{
						System.out.println("Ya existe " + s);

					}, () ->{
						System.out.println("Ingresando estudiante" + student);
						repository.insert(student);
					} );


		};
	}

	private static void usingMongoTemplateAndQuery(StudentRepository repository, MongoTemplate mongoTemplate, String email, Student student) {
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is(email));

		List<Student> students = mongoTemplate.find(query, Student.class);

		if (students.size() > 1) {
			throw  new IllegalStateException("Se econtro muchos estudiantes con este email" + email);
		}

		if (students.isEmpty()) {
			System.out.println("Ingresando estudiante" + student);
			repository.insert(student);
		}else{
			System.out.println("Ya existe " + student);
		}
	}

}
