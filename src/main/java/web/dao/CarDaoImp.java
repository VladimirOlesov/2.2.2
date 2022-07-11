package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> getListCars(int count, List<Car> listCars) {
        if (count > 5) {
            count = 5;
        }
        return listCars.subList(0, count);
    }
}
