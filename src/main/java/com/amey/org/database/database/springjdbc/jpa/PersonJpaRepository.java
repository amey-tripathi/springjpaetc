package com.amey.org.database.database.springjdbc.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.amey.org.database.database.springjdbc.entity.Person;


@Transactional
@Repository
public class PersonJpaRepository {
	

	@PersistenceContext
	private EntityManager entityManager;
	
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

}
