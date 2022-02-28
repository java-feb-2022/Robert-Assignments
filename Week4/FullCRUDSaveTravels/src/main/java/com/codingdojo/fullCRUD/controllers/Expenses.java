package com.codingdojo.fullCRUD.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.fullCRUD.models.Expense;
import com.codingdojo.fullCRUD.services.ExpenseService;

@Controller
public class Expenses {
	private final ExpenseService expServ;

	public Expenses(ExpenseService expenseService) {
		this.expServ = expenseService;
	}
	
	@GetMapping("/")
	public String getHome(@ModelAttribute("expense") Expense expense, Model model, BindingResult result) {
		model.addAttribute("exp", expServ.allExpenses());
		return "index.jsp";
	}
	
	@PostMapping("/newExpense")
	public String newExpense(@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("exp", expServ.allExpenses());
			return "index.jsp";
		}
		else {
			expServ.createExpense(expense);
			return "redirect:/";
		}
	}
}
