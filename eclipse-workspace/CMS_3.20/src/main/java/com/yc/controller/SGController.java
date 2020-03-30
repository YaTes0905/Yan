package com.yc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.domain.Good;
import com.yc.domain.Shop;
import com.yc.service.SGService;

@Controller
public class SGController {
	
	  @Autowired private SGService service;
	  
	  @RequestMapping("getlist")
	  public String getList(Model model,@RequestParam(defaultValue = "1")int pageNum,String keyword) {
		  	PageHelper.startPage(pageNum, 2);
			List<Shop> list = service.getList(keyword);
			PageInfo info=new PageInfo(list);
			model.addAttribute("list", list);
			model.addAttribute("info", info);
			model.addAttribute("keyword", keyword);
			return "list";
	  }
	  @GetMapping("add")
	  public String add() {
		  return "add";
	  }
	  @ResponseBody
	  @RequestMapping("getGoods")
	  public List<Good> getGoods(){
		 return service.getGoods();
	  }
	  
	  @RequestMapping("addSG")
	  public String addSG(Shop shop,int []idss) {
		  boolean add = service.addSG(shop,idss);
		  if (add) {
			  return "redirect:/getlist";
		  }else{
			  return "redirect:/add";
		  }
		  
	  }
	  @RequestMapping("details")
	  public String details(Integer sid,Model model) {
		  Shop shopdetails = service.Shopdetails(sid);
		  model.addAttribute("shop", shopdetails);
		  return "shopdetails";
	  }
	  @ResponseBody
	  @RequestMapping("delete")
	  public boolean del(int []ids) {
		  
		  return service.delete(ids);
	  }
}
