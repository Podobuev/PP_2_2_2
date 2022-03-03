package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("red", "audi", 20000));
        list.add(new Car("green", "tesla", 15000));
        list.add(new Car("blue", "bmw", 30000));
        list.add(new Car("black", "porshe", 35000));
        list.add(new Car("white", "ford", 5000));

    }

    @Override
    public List<Car> getCar(int value) {
        return list.subList(0, value);
    }
}
