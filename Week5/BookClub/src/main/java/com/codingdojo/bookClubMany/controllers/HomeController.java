package com.codingdojo.bookClubMany.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.bookClubMany.models.LoginUser;
import com.codingdojo.bookClubMany.models.User;
import com.codingdojo.bookClubMany.services.BookService;
import com.codingdojo.bookClubMany.services.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userServ;
	@Autowired
	private BookService bookServ;
	
//	Login and Register Page
	@GetMapping("/")
	public String homePage(@ModelAttribute("newUser") User newUser, @ModelAttribute("logUser") LoginUser logUser,
			HttpSession session) {
		return "index.jsp";
	}
	
	@PostMapping("/registration")
	public String tryUserRegister(@Valid @ModelAttribute("newUser") User user, BindingResult result,
			@ModelAttribute("logUser") LoginUser logUser) {
		if(userServ.validateRegistration(user, result) && !result.hasErrors()) {
			userServ.registerUser(user);
			return "redirect:/";
		}
		else {
			return "index.jsp";
		}
	}
	
	@PostMapping("/login")
	public String tryUserLogin(@Valid @ModelAttribute("logUser") LoginUser logUser, BindingResult result,
			@ModelAttribute("newUser") User user, HttpSession session) {
		User getUser = userServ.authenticateUser(logUser, result);
		if (!result.hasErrors() && getUser != null) {
			session.setAttribute("userData", getUser);
			return "redirect:/user/" + getUser.getId();
		} else {
			return "index.jsp";
		}
	}
	
//	Logged in User Dashboard
	@GetMapping("/user/{id}")
	public String userDashboard(HttpSession session) {
		if(session.getAttribute("userData") instanceof User) {
			User testUser = (User) session.getAttribute("userData");
			if(userServ.checkLoggedInUser(testUser)) {
				return "userDashboard.jsp";
			}
		}
		return "redirect:/";
	}
	
	@GetMapping("/user/{id}/book/{bookId}")
	public String bookDetails() {
		return "";
	}
//	User Book Functionality
	@GetMapping("/user/{id}/newbook")
	public String newBookForm() {
		return "";
	}
	
	@PostMapping("/user/{id}/newbook")
	public String createNewBook() {
		return "";
	}
	
	@PutMapping("/user/{id}/editbook")
	public String editBookForm() {
		return "";
	}
	
	@PostMapping("/user/{id}/editbook")
	public String commitBookEdit() {
		return "";
	}
	
//	Logout
	@GetMapping("/logout")
	public String logoutUser(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
