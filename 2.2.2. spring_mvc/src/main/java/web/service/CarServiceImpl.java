package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1,"Mercedes","black"));
        cars.add(new Car(2,"Tesla","white"));
        cars.add(new Car(3,"Kia","yellow"));
        cars.add(new Car(4,"Bentley","blue"));
        cars.add(new Car(5,"Mini Cooper","pink"));
    }

    @Override
    public List<Car> getCars(Integer count){
        if(count == null){
            count=5;
        }
        return cars.stream().limit(Math.min(count,5)).collect(Collectors.toList());
    }

    }

