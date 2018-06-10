package com.amey.org.database.database.springjdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.amey.org.database.database.springjdbc.entity.Person;
import com.amey.org.database.database.springjdbc.jdbc.PersonJdbcDao;
import com.amey.org.database.database.springjdbc.jpa.PersonJpaRepository;


@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Person with id -> {}", repository.findById(381486));
				
//		logger.info("All users -> {}", dao.findAll());
//		logger.info("deleted 381487 no of rows deleted-> {}", dao.deleteById(381487));
//		logger.info("insert a person 381487 {}", dao.insert(new Person(381487, "Amey2", "johannesburg", new Date())));
//		logger.info("update a person 381487 {}", dao.update(new Person(381487, "Amey22", "johannesburg", new Date())));
		
	}
}
