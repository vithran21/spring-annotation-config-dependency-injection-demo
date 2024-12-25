package annotationconfig.dependencyinjection;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class ConfigurationClass {

	@Bean
	public List<String> getModelNo() {
		return Arrays.asList("dnvks4864", "acjhb5464644");
	}
}
