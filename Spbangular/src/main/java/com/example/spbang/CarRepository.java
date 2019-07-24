package com.example.spbang;

import com.example.spbang.Car;
import com.example.spbang.CarRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
