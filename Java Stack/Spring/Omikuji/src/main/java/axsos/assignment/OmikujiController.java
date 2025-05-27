package axsos.assignment;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OmikujiController {

    @GetMapping("/omikuji")
    public String omikujiForm() {
        return "omikuji.jsp";
    }

    @PostMapping("/omikuji/process")
    public String processForm(
            @RequestParam("number") String number,
            @RequestParam("city") String city,
            @RequestParam("person") String person,
            @RequestParam("hobby") String hobby,
            @RequestParam("livingThing") String livingThing,
            @RequestParam("message") String message,
            HttpSession session
    ) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("livingThing", livingThing);
        session.setAttribute("message", message);
        return "redirect:/omikuji/show";
    }

    @GetMapping("/omikuji/show")
    public String showFortune() {
        return "show.jsp";
    }
}
