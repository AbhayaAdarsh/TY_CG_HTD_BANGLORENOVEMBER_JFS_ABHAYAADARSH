package com.capge.springmvc.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.capge.springmvc.beans.User;

@Controller
public class SpringController {
	
	@Autowired
	private ServletContext context;
	
	@RequestMapping("/hello")
	public String hello(ModelMap map) {
		map.addAttribute("msg" , "Hello World.........!!!!");
		return "index";
	}
	
	//@RequestMapping(path="/query", method= RequestMethod.GET)
	@GetMapping("/query")
	//Query String
	//HERE IT WILL NOT SHOW VALUE//public String query(@RequestParam(name="name",required=false)String name,@RequestParam(name="age",required=false)int age,ModelMap map)
	public String query(@RequestParam("name")String name,@RequestParam("age")int age,ModelMap map)
	{
			System.out.println(name);
			System.out.println(age);
			map.addAttribute("name",name);
			map.addAttribute("age",age);
			
			return "query";
		}
	
	@GetMapping("/form")
	public String form() {
		return "form";
	}
	
	@PostMapping("/form")
	//public String form(String name,String email,String password,String gender,ModelMap map) 
	public String form(User user,ModelMap map)
	{
		map.addAttribute("name",user.getName());
		map.addAttribute("email",user.getEmail());
		map.addAttribute("password",user.getPassword());
		map.addAttribute("gender",user.getGender());
		return "form";
	}
	
	//COOKIES //http://localhost:8080/springmvc/createcookie write in url
	@GetMapping("/createcookie")
	public String createCookie(HttpServletResponse response) {
		Cookie cookie=new Cookie("name","Abhaya");
		response.addCookie(cookie);
		return "createcookie";
	}
	
	//GET COOKIE //http://localhost:8080/springmvc/getcookie write in url
	@GetMapping("/getcookie")
	public String getCookie(@CookieValue(name="name")String name,ModelMap map) {
		if(name!=null)
			map.addAttribute("name",name);
		else
			map.addAttribute("name","Abhaya");
		//map.addAttribute("name",name);
		return "getcookie";//this should be same as jsp name
		
	}
	//PATH PARAM/PATH VARIABLE(USE IN MICRO SERVISES,PATH SERVICES)
	
	//Dynamic value //http://localhost:8080/springmvc/path/ANS/Rakshit%20Shetty this path give in url
	@GetMapping("/path/{movie}/{hero}")
	public String path(@PathVariable("movie")String movie,@PathVariable("hero")String hero,ModelMap map) {
		
		map.addAttribute("movie",movie);
		map.addAttribute("hero",hero);
		
		return "pathvalue";
	}
	
	//FORWARD request to another controller //http://localhost:8080/springmvc/forward in url
	@GetMapping("/forward")
	public String forward() {
		return "forward:hello";
	}
	
	//REDIRECT
	
	              //In Servlet we use to write this type 
	
		    //public String redirect(HttpServletResponse response) throws IOException {
		   //response.sendRedirect("https://www.google.com");
		  //return "";
		 //	}
	
	//Here we write like this
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:https://www.google.com";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	//performace wise it is good.Here it create session by its own.
	
	@PostMapping("/login")
	public String login(String username ,String password ,HttpServletRequest request,ModelMap map) {
		if(username.equals("user") && password.equals("qwerty")) {
			User user = new User();
			user.setName(username);
			user.setEmail("user@gmail.com");
			user.setPassword(password);
			user.setGender("O");
			//request.getSession();
			
			//Setting Session Attribute
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			map.addAttribute("msg", "User login");
			return "home";
		}
		else {
			map.addAttribute("msg", "Credential Invalid!!");
			return "login";
		}
	}
	
	//Here we are forcing spring creating session
	//@PostMapping("/login")
	//public String login(String username,String password,HttpSession session,ModelMap map) {
	//if(username.equals("user") && password.equals("qwerty")) {
	//	map.addAttribute("msg", "User login");
	//	return "home";
	//	}
	//else {
	//	session.invalidate();
	//	map.addAttribute("msg", "Credential Invalid");
	//	return "login";
	//}
	//}
	
	//http://localhost:8080/springmvc/home write in url
	@GetMapping("home")
	public String home(@SessionAttribute(name="user",required=false) User user) {
		if(user!=null) {
			return "home";
		}else {
		return "login";
		}
	}
	
	@GetMapping("/setappattribute")
	public String setAppAttribute() {
		context.setAttribute("msg",new Object());
		return "setcontext";
	}
	
	@GetMapping("/getappattribute")
	public String getAppAttribute() {
		System.out.println(context.getAttribute("msg"));
		return "getcontext";
	}
	
	}

