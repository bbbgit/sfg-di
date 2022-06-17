package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
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

		// Ovako dokazujemo da ce kontekst sadrzati samo jedan objekat, kreria ga kad se app startuje i uvek vraca isti (singleton)
		if (myController == myController1){
			System.out.println("Isti objekat");
		}

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
