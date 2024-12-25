package annotationconfig.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CeatTyre implements Tyre {

	@Override
	public void checkAir() {
		System.out.println("Air is 80%");
	}

}
