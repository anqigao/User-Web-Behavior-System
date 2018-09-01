package com.uni.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uni.entity.UserActivity;
//import com.alibaba.fastjson.JSON;
import com.uni.entity.UserInfo;
import com.uni.service.UserActivityServiceImpl;
import com.uni.service.UserInfoServiceImpl;

@Controller
public class UserInfoController {
	
	@Autowired
	private UserInfoServiceImpl userInfoServiceImpl;
	@Autowired
	private UserActivityServiceImpl userActivityServiceImpl;
	
	
	//User full table
	@RequestMapping("/listUser")
	public String listUser(HttpServletRequest request, HttpServletResponse response) {
		int total = userInfoServiceImpl.getTotal();
		List<UserInfo> users = userInfoServiceImpl.getUser();
		
        request.setAttribute("users", users);
        request.setAttribute("total", total);
	
		return "listUser";
	}
	
	
	
	//User Information
	@RequestMapping("/addInfo")
	public String addInfo() {		
		return "addInfo"; 
	}
	
	@RequestMapping("/updateInfo/{action}")
	public String updateInfo(@PathVariable String action, HttpServletRequest request, HttpServletResponse response) {
		UserInfo info = new UserInfo();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String first_name = request.getParameter("firstName");
		String last_name = request.getParameter("lastName");
		int age = Integer.parseInt(request.getParameter("age"));
		
		info.setId(id);
		info.setFirstName(first_name);
		info.setLastName(last_name);
		info.setAge(age);
		
		if (action.equals("edit")) {
			userInfoServiceImpl.updateInfo(info);
		}
		else if (action.equals("add")) {
			userInfoServiceImpl.addInfo(info);
		}
		
		return "redirect: ../listInfo";
	}
	
	@RequestMapping("/listInfo")
	public String listInfo(HttpServletRequest request, HttpServletResponse response) {
		int total = userInfoServiceImpl.getTotal();
		List<UserInfo> users = userInfoServiceImpl.getUser();
		
        request.setAttribute("users", users);
        request.setAttribute("total", total);
	
		return "listInfo";
	}
	
	
	@RequestMapping("/deleteInfo/{id}")
	public String deleteInfo(@PathVariable int id) {
		userInfoServiceImpl.deleteInfo(id);
		return "redirect:../listInfo";
	}
	
	@RequestMapping("/editInfo/{id}")
	public ModelAndView editInfo(@PathVariable int id) {
		ModelAndView model = new ModelAndView("editInfo");
		UserInfo info = userInfoServiceImpl.getInfo(id);
		model.addObject("info", info);
		return model;
	}
	
	
	//Test
	@RequestMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	
	//Activity
	@RequestMapping("/addActivity")
	public String addActivity() {		
		return "addActivity"; 
	}
	
	@RequestMapping("/updateActivity/{action}")
	public String updateActivity(@PathVariable String action, HttpServletRequest request, HttpServletResponse response) {
		UserActivity act = new UserActivity();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String url = request.getParameter("url");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = null;
        try {
            time = simpleDateFormat.parse(request.getParameter("time"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

		
		act.setId(id);
		act.setUrl(url);
		act.setTime(time);
		
		if (action.equals("edit")) {
			userActivityServiceImpl.updateActivity(act);
		}
		else if (action.equals("add")) {
			userActivityServiceImpl.addActivity(act);
		}
		
		return "redirect: ../listActivity";
	}
	
	
	@RequestMapping("/listActivity")
	public String listActivity(HttpServletRequest request, HttpServletResponse response) {
		int total = userActivityServiceImpl.getTotal();
		List<UserActivity> acts = userActivityServiceImpl.list();
		
        request.setAttribute("acts", acts);
        request.setAttribute("total", total);
	
		return "listActivity";
	}
	
	
	@RequestMapping("/deleteActivity/{id}")
	public String deleteActivity(@PathVariable int id) {
		userActivityServiceImpl.deleteActivity(id);
		return "redirect:../listActivity";
	}
	
	@RequestMapping("/editActivity/{id}")
	public ModelAndView editActivity(@PathVariable int id) {
		ModelAndView model = new ModelAndView("editActivity");
		UserActivity act = userActivityServiceImpl.getActivity(id);
		model.addObject("act", act);
		return model;
	}

	
}
