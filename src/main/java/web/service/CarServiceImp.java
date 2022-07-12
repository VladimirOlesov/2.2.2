package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Model1", "BodyType1", 2));
        cars.add(new Car("Model2", "BodyType2", 3));
        cars.add(new Car("Model3", "BodyType3", 4));
        cars.add(new Car("Model4", "BodyType4", 5));
        cars.add(new Car("Model5", "BodyType5", 5));
    }

    @Override
    public List<Car> getListCars(int count) {
        List<Car> getList = new ArrayList<>();
        if (count > 5) {
            count = 5;
        }
        for (int i = 0; i < count; i++) {
            getList.add(cars.get(i));
        }
        return getList;
    }
}
