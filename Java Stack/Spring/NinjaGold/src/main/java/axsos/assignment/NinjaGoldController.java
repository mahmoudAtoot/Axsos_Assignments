package axsos.assignment;

import java.util.Date;
import java.util.ArrayList;
import java.util.Random;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldController {

    @GetMapping("/")
    public String index(HttpSession session) {
        if (session.getAttribute("gold") == null) {
            session.setAttribute("gold", 0);
            session.setAttribute("log", new ArrayList<String>());
        }
        int gold = (int) session.getAttribute("gold");
        if (gold < -100) {
            return "prison.jsp";
        }
        return "gold.jsp";
    }

    @PostMapping("/process")
    public String processGold(
        @RequestParam("location") String location,
        HttpSession session
    ) {
        Random rand = new Random();
        int gold = (int) session.getAttribute("gold");
        @SuppressWarnings("unchecked")
        ArrayList<String> log = (ArrayList<String>) session.getAttribute("log");

        int earned = 0;
        String activity = "";

        switch (location) {
            case "farm":
                earned = rand.nextInt(11) + 10; // 10–20
                activity = "Earned " + earned + " gold from the farm!";
                break;
            case "cave":
                earned = rand.nextInt(6) + 5; // 5–10
                activity = "Earned " + earned + " gold from the cave!";
                break;
            case "house":
                earned = rand.nextInt(4) + 2; // 2–5
                activity = "Earned " + earned + " gold from the house!";
                break;
            case "quest":
                earned = rand.nextInt(101) - 50; // -50 to 50
                activity = (earned >= 0) 
                    ? "Completed a quest and earned " + earned + " gold!"
                    : "Failed a quest and lost " + Math.abs(earned) + " gold!";
                break;
            case "spa":
                earned = -1 * (rand.nextInt(16) + 5); // -5 to -20
                activity = "Relaxed at the spa and lost " + Math.abs(earned) + " gold!";
                break;
            case "reset":
                session.invalidate();
                return "redirect:/";
        }

        gold += earned;
        String timestamp = new java.text.SimpleDateFormat("MMM dd yyyy HH:mm:ss").format(new Date());
        log.add(0, activity + " (" + timestamp + ")");
        session.setAttribute("gold", gold);
        session.setAttribute("log", log);
        return "redirect:/";
    }
}
