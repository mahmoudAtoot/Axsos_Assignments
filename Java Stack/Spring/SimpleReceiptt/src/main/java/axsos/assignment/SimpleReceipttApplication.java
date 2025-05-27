
package axsos.assignment;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@SpringBootApplication
public class SimpleReceipttApplication{
	public static void main(String[] args) {
		SpringApplication.run(SimpleReceipttApplication.class, args);
	}
@RequestMapping("/")
public String index(Model model) {

    String name = "Grace Hopper";
    String itemName = "Copper wire";
    double price = 5.25;
    String description = "Metal strips. Also on illustration of nanoseconds.";
    String vendor = "Liitle Things Corner Store";

    // Add values to the model
    model.addAttribute("name", name);
    model.addAttribute("itemName", itemName);
    model.addAttribute("price", price);
    model.addAttribute("description", description);
    model.addAttribute("vendor", vendor);

    return "index.jsp";
}}