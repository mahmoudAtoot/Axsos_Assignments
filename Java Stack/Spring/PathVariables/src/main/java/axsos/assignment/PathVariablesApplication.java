package axsos.assignment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@SpringBootConfiguration
@RestController
@RequestMapping("/daikichi")
@SpringBootApplication
public class PathVariablesApplication {
	public static void main(String[] args) {
		SpringApplication.run(PathVariablesApplication.class, args);
	}
//	@RequestMapping("/")
	public String index() {
		return "Hellow Human";
	}
	@RequestMapping("/search")
	public String name(@RequestParam(value="q",defaultValue = "hi") String searchQuery,@RequestParam(value="last" ,defaultValue = "") String lastname,@RequestParam(value="times" ,defaultValue = "1") int times) {
		String result  = "";
		for(int i = 0; i<times;i++) {
		result += "Hello " + searchQuery+lastname;
	}
		return result;
	}
	
	
	
	    @RequestMapping("/travel/{city}" )
	    public String city(@PathVariable("city")String city){
	      return "Congratulations! You will soon travel to "+city;
	    }
	    @RequestMapping("/lotto/{num}")
	    public String lotto(@PathVariable("num")Integer num){
	    	if(num%2 == 0) {
	    		return "You will take a grand journey in the near future but be wary of tempting offers.";
	    	}
	    	else {
	    		return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
	    	}
	    }
	
}