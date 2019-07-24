package com.example.spbang;

import com.example.spbang.Car;
import com.example.spbang.CarRepository;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {
	 private final CarRepository CarRepository;

	    public  CarController(CarRepository carRepository) {
	        this.CarRepository = carRepository;
	    }

	    @GetMapping("/Cars")
	    public List<Car> getcars() {
	    	  return (List<Car>) CarRepository.findAll();
	    }

	    @PostMapping("/Cars")
	    void addUser(@RequestBody Car car) {
	        CarRepository.save(car);
	    }

}
