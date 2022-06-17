package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class YourController {

    public YourController() {
        System.out.println("Konstruktor pozvan za " + getClass().getName());
    }

    public String sayHello(){
        //System.out.println("Hello World");

        return "Hi folks from " + getClass().getName();
    }

}
