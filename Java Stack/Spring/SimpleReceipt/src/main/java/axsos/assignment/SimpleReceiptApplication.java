package axsos.assignment;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleReceiptApplication {

    @RequestMapping("/")
    public String index(Model model) {

        String name = "Ada Lovelace";
        String itemName = "Silver Cable";
        double price = 8.99;
        String description = "Conductive wire, useful in computing exhibits.";
        String vendor = "Tech Trinkets Emporium";

        // Add values to the model
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);

        return "index.jsp";
    }
}
