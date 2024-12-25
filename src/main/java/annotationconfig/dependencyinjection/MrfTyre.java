package annotationconfig.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class MrfTyre implements Tyre {

	@Override
	public void checkAir() {
		System.out.println("Air is 70%");
	}

}
