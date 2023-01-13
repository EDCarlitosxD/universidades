package com.university.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.university.university.entity.State;
import com.university.university.repository.StateRepository;


@SpringBootApplication
public class UniversityApplication {

	public static void main(String[] args) {
		StateRepository sta =  SpringApplication.run(UniversityApplication.class, args).getBean(StateRepository.class);
	
	
	}

}
