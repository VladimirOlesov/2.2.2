package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model1", "BodyType1", 2));
        cars.add(new Car("Model2", "BodyType2", 3));
        cars.add(new Car("Model3", "BodyType3", 4));
        cars.add(new Car("Model4", "BodyType4", 5));
        cars.add(new Car("Model5", "BodyType5", 5));
        model.addAttribute("cars", carDao.getListCars(count, cars));
        return "cars";
    }

}
