package com.Maven.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Maven.web.service.AddService;

@Controller
public class MainController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res)
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		AddService obj=new AddService();  //this class will do addition task
		int k=obj.add(i,j);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("ans",k);
		
		return mv;
	}

}
