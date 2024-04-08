package  com.interview.forecast.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/v1")
public class WeatherController {

    @GetMapping("/forecastlist")
    public String getCityWeatherInfo(String city) {
        return "Hello with cloud9";
    }
}