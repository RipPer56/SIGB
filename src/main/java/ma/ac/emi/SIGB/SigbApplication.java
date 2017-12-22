package ma.ac.emi.SIGB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
*
* @author RipPer
*/

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan("ma.ac.emi")
public class SigbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigbApplication.class, args);
	}
}
