package annotationconfig.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Showroom {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(ConfigurationClass.class);

		con.getBean(Car.class).checkTyreAir();
		System.out.println(con.getBean(Car.class).modelNo);
	}

}
