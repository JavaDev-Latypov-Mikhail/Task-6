package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Audi A4", 1, 2018));
        cars.add(new Car("Ford Mustang", 999, 2020));
        cars.add(new Car("Mercedes-Benz C-Class", 520, 2019));
        cars.add(new Car("Honda Civic", 2107, 2017));
        cars.add(new Car("Nissan Altima", 426, 2021));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size() || count < 0) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
