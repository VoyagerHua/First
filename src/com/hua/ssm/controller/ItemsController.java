package com.hua.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;





import org.springframework.web.bind.annotation.RequestMapping;

import com.hua.ssm.po.ItemsEx;
import com.hua.ssm.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;
	
	@RequestMapping("/queryItems")
	public String queryItems(Model model,HttpServletRequest request) throws Exception
	{
		
		List<ItemsEx> itemsList = itemsService.findItemsList(null);

		System.out.println("呵呵呵呵");
		
		model.addAttribute("itemsList", itemsList);
		
		//前面的"itemsList"是给jsp用的  底层 存在request.addAttribute 中
		
		
		

		System.out.println(itemsList.size());
		
		System.out.println(itemsList);
		
		
		//System.out.println(request.getAttribute("itemsList"));
		
		
		return "items/itemsList";
		
	}
}
