package axsos.assignment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import axsos.assignment.models.LoginUser;
import axsos.assignment.models.User;
import axsos.assignment.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("newUser", new User());
		model.addAttribute("newLogin", new LoginUser());
		return "index";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {
		User registerUser = userService.register(newUser, result);

		if (result.hasErrors()) {
			model.addAttribute("newLogin", new LoginUser()); // make sure login form is also available
			return "index"; // keep submitted user data with validation errors
		}

		session.setAttribute("userId", registerUser.getId());
		return "redirect:/talks";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, BindingResult result, Model model,
			HttpSession session) {
		User user = userService.login(newLogin, result);

		if (result.hasErrors()) {
			model.addAttribute("newUser", new User()); // registration form still needs to exist
			return "index"; // keep login form input & errors
		}

		session.setAttribute("userId", user.getId());
		return "redirect:/talks";
	}
	
	
	
	@PostMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
	    return "redirect:/";
	}

}