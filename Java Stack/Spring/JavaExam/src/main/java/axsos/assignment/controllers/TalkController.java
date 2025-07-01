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
import org.springframework.web.bind.annotation.PutMapping;

import axsos.assignment.models.Talk;
import axsos.assignment.models.User;
import axsos.assignment.services.TalkService;
import axsos.assignment.services.UserService;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller

public class TalkController {
	@Autowired
	private TalkService talkService;
	@Autowired
	UserService userService;

	@GetMapping("/talks")
	public String talks(Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/";
		}

		// Optional: Fetch user from DB and pass to JSP
		Long userId = (Long) session.getAttribute("userId");
		User user = userService.findUserById(userId);
		model.addAttribute("user", user);

		model.addAttribute("talks", talkService.findAllTalks());
		return "talks";
	}

	@GetMapping("/addTalk")
	public String addTalkPage(@ModelAttribute("talk") Talk talk, HttpSession session, Model model) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/index";
		}
		Long userId = (Long) session.getAttribute("userId");
		model.addAttribute("user", userService.findUserById(userId));

		return "addTalk";
	}

	@PostMapping("/addTalk/form")
	public String createTalk(@Valid @ModelAttribute("talk") Talk talk, BindingResult result, Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/index";
		}
		if (result.hasErrors()) {
//		model.addAttribute("book" ,new Book());
			return "addTalk";
		}

		// Get the logged-in user from the DB
		User user = userService.findUserById(userId);
		talk.setUser(user); // Link book to user

		talkService.createTalk(talk);
		return "talkDetails";
	}

	@GetMapping("/talkDetails/{id}")
	public String talkDetails(@PathVariable("id") Long id, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/index";
		}
		Talk talk = talkService.findTalk(id);
		model.addAttribute("talk", talk);
		return "talkDetails";
	}

	@GetMapping("/editTalk/{id}")
	public String editTalkPage(@PathVariable("id") Long id, Model model, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/index";
		}
		model.addAttribute("talk", talkService.findTalk(id));
		return "editTalk";

	}

	@PutMapping("/update/{id}/form")
	public String updateTalk(@Valid @ModelAttribute("talk") Talk talk, BindingResult result,
			@PathVariable("id") Long id, HttpSession session, Model model) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/index";
		}

		if (result.hasErrors()) {
			model.addAttribute("talk", talk);
			return "editTalk"; // Show errors again
		}

		// Optionally set user again
		User user = userService.findUserById(userId);
		talk.setUser(user);

		talkService.createTalk(talk); // createBook usually handles both create and update
		return "redirect:/talkDetails/" + talk.getId();
	}

	@DeleteMapping("/talks/{id}/delete")
	public String deleteTalk(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if (userId == null) {
			return "redirect:/index";
		}

		talkService.deleteTalk(id);
		return "redirect:/talks";
	}

}
