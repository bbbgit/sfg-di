package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public MyController() {
        System.out.println("Konstruktor pozvan za " + getClass().getName());
    }

    public String sayHello(){
        //System.out.println("Hello World");

        return "Hi folks from " + getClass().getName();
    }

}
