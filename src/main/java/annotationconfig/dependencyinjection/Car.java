package annotationconfig.dependencyinjection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	@Qualifier("mrfTyre")
	private Tyre tyre;
	
	@Autowired
	public List<String> modelNo;

	void checkTyreAir() {
		tyre.checkAir();
	}

}
