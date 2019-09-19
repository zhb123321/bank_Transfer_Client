package com.zl.bts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zl.bts.pojo.Currency;
import com.zl.bts.service.CrossBorderService;

@Controller
public class PageController {

	@Autowired
	private CrossBorderService  crossBorderService;
	
	//跨境页面查询
	@RequestMapping("/showCrossBorder")
	public String showCrossBorderPage(Model model) {
		//币种查询
		List<Currency> currencylist = crossBorderService.findCurrency();
		model.addAttribute("currencylist", currencylist);
		System.out.println(currencylist.get(0).getCurrencyname());
		return "/bank/crossBorder";
	}
	
}
