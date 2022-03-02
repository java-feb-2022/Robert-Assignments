package com.codingdojo.fullCRUD.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable("id") Long id, Model model) {
		Expense exp = expServ.getExpenseById(id);
		model.addAttribute("expense", exp);
		System.out.println("MOdel: " + model.getAttribute("expense"));
		if(model.getAttribute("expense") != null) {
			return "editExpense.jsp";
		}
		else {
			return "redirect:/";
		}
	}
	
	@PutMapping("/edit/{id}/commit")
	public String commitEdit(@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result, @PathVariable Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(expense);
			return "editExpense.jsp";
		}
		else {
			System.out.println("EXPENSE ID: " + expense.getId());
			expServ.editExpense(expense);
			return "redirect:/";
		}
	}
}
