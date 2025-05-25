package axsos.assignment;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiControllerApplication.class, args);
	}

	@RequestMapping("")
    public String index() { 
            return "Welcome!";
    }
	@RequestMapping("/today")
    public String index1() { 
            return "Today you will find luck in all your endeavors!";
    }
	@RequestMapping("/tomorrow")
    public String index2() { 
            return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
	
}