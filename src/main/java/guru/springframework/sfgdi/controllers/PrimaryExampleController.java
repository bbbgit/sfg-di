package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryExampleController {

    public GreetingService greetingService;

    public PrimaryExampleController(GreetingService greetingService) {
        System.out.println("Konstruktor pozvan za " + getClass().getName());
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
