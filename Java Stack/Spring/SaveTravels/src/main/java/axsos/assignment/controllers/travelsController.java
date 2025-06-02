package axsos.assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import axsos.assignment.models.Travels;
import axsos.assignment.services.TravelService;
import jakarta.validation.Valid;

@Controller
public class travelsController {
	@Autowired
	TravelService travelService;

	@GetMapping("")
    public String index(@ModelAttribute("travel") Travels travel, Model model) {
        model.addAttribute("travels", travelService.allTravels());
        return "index.jsp";
    }
    
    
    @PostMapping("/travels")
    public String create(@Valid @ModelAttribute("travel") Travels travel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("travels", travelService.allTravels());
            return "index.jsp";
        } else {
        	travelService.createTravels(travel);
            return "redirect:/";
        }
    }
    
    @RequestMapping("/travels/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
    	Travels travel = travelService.findTravels(id);
        model.addAttribute("travel", travel);
        return "edit.jsp";
    }
    
    
    @RequestMapping(value="/travels/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("burger") Travels travel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("travel", travel);
            return "edit.jsp";
        } else {
        	travelService.updateTravels(travel);
            return "redirect:/";
        }
    }
    
    
    @RequestMapping("/travels/details/{id}")
    public String details(@PathVariable("id") Long id, Model model) {
    	Travels travel = travelService.findTravels(id);
        model.addAttribute("travels", travel);
        return "details.jsp";
    }
    
    
    @DeleteMapping("/travels/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
    	travelService.deleteTravel(id);
        return "redirect:/";
    }
    
    
    
}