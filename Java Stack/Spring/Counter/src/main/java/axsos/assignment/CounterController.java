package axsos.assignment;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {

    @RequestMapping("/Your_server")
    public String index(HttpSession session) {
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 0;
        }

        session.setAttribute("count", count + 1);
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session, Model model) {
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 0;
        }

        model.addAttribute("count", count);
        return "counter.jsp";
    }
    
    
    @RequestMapping("/plus2")
    public String plusTwo(HttpSession session) {
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            count = 0;
        }
        session.setAttribute("count", count + 1);
        return "plus2.jsp";
    }
    
    @PostMapping("/reset")
    public String reset(HttpSession session) {
        session.setAttribute("count", 0);
        return "redirect:/counter";
    }
}
