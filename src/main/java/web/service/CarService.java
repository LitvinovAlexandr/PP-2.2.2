package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public List<Car> getAllCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Subaru", "Blue", 240));
        cars.add(new Car("Hyundai", "Grey", 190));
        cars.add(new Car("BMW", "Black", 230));
        cars.add(new Car("Kia", "Red", 195));
        cars.add(new Car("Geely", "Green", 220));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
