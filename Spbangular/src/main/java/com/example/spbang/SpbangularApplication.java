package com.example.spbang;

import com.example.spbang.Car;
import com.example.spbang.CarRepository;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpbangularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpbangularApplication.class, args);
	}
		@Bean
	    CommandLineRunner init(CarRepository carRepository) {
	        return args -> {
	            Stream.of("Hundai", "Bugati","Porsche", "Lamborghini", "Bentley").forEach(company -> {
	                Car car = new Car();
	                car.setName(company);
	                carRepository.save(car);
	            
	            });
	            carRepository.findAll().forEach(System.out::println);
	        };
		}

	           

}
