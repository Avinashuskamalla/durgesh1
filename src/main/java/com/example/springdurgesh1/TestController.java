package com.example.springdurgesh1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String  firstHandler()
	{
		
		System.out.println("Java is great");
		return "home";
		
	}
		
}

