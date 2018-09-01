//package com.uni.controller;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.uni.entity.UserActivity;
//import com.uni.service.UserActivityServiceImpl;
//
//@Controller
//public class UserActivityController {
//	
//	@Autowired
//	private UserActivityServiceImpl userActivityServiceImpl;
//	
//	
//	@RequestMapping("/addActivity")
//	public String addActivity() {		
//		return "addActivity"; 
//	}
//	
//	@RequestMapping("/updateActivity/{action}")
//	public String updateActivity(@PathVariable String action, HttpServletRequest request, HttpServletResponse response) {
//		UserActivity act = new UserActivity();
//		
//		int id = Integer.parseInt(request.getParameter("id"));
//		String url = request.getParameter("url");
//		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date time = null;
//        try {
//            time = simpleDateFormat.parse(request.getParameter("time"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//		
//		act.setId(id);
//		act.setUrl(url);
//		act.setTime(time);
//		
//		if (action.equals("edit")) {
//			userActivityServiceImpl.updateActivity(act);
//		}
//		else if (action.equals("add")) {
//			userActivityServiceImpl.addActivity(act);
//		}
//		
//		return "redirect: ../listActivity";
//	}
//	
//	
//	@RequestMapping("/listActivity")
//	public String listActivity(HttpServletRequest request, HttpServletResponse response) {
//		int total = userActivityServiceImpl.getTotal();
//		List<UserActivity> acts = userActivityServiceImpl.list();
//		
//        request.setAttribute("acts", acts);
//        request.setAttribute("total", total);
//	
//		return "listActivity";
//	}
//	
//	
//	@RequestMapping("/deleteActivity/{id}")
//	public String deleteActivity(@PathVariable int id) {
//		userActivityServiceImpl.deleteActivity(id);
//		return "redirect:../listActivity";
//	}
//	
//	@RequestMapping("/editActivity/{id}")
//	public ModelAndView editActivity(@PathVariable int id) {
//		ModelAndView model = new ModelAndView("editActivity");
//		UserActivity act = userActivityServiceImpl.getActivity(id);
//		model.addObject("act", act);
//		return model;
//	}
//
//}
