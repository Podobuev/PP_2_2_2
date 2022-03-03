package web.controller;


import model.Car;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        CarService carService = new CarServiceImp();
        List<Car> listCar;
        if (count > 5 || count < 0) {
            listCar = carService.getCar(5);
        } else {
            listCar = carService.getCar(count);
        }
        model.addAttribute("list", listCar);
        return "index2";
    }
}
