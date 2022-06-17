package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		System.out.println("App startovana!");




		MyController myController = (MyController) ctx.getBean("myController");
		MyController myController1 = (MyController) ctx.getBean("myController");

		// Ovako ispitujemo da li je objekat u kontekstu singleton ili prototype
		if (myController == myController1){
			System.out.println("Isti objekat - singleton");
		} else {
			System.out.println("Nije isti objekat - prototype");
		}

		String greetingA = myController.sayHello();
		System.out.println(greetingA);


		YourController yourController = (YourController) ctx.getBean("yourController");
		YourController yourController1 = (YourController) ctx.getBean("yourController");

		// Ovako ispitujemo da li je objekat u kontekstu singleton ili prototype
		if (yourController == yourController1){
			System.out.println("Isti objekat - singleton");
		} else {
			System.out.println("Nije isti objekat - prototype");
		}

		String greetingB = yourController.sayHello();
		System.out.println(greetingB);




		/////////////////////////////////////////////////////////// Spring style /////////////////////////////////////////
		System.out.println("");
		System.out.println("----------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("");
		System.out.println("----------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("");
		System.out.println("----------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("");
		System.out.println("----------- Primary Example");
		PrimaryExampleController primaryExampleController = (PrimaryExampleController) ctx.getBean("primaryExampleController");
		System.out.println(primaryExampleController.sayHello());

	}

}
