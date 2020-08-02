package com.arzds;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CouserCtrl {
	/*
	 * @RequestMapping("course") public String coures(HttpServletRequest req) {
	 * HttpSession httpSession = req.getSession(); String courseName =
	 * req.getParameter("cName"); System.out.println("Name OF Course " +
	 * courseName); httpSession.setAttribute("cname", courseName); return "course";
	 * 
	 * }
	 */

	/*
	 * @RequestMapping("course") public String coures(@RequestParam("csname")String
	 * courseName,HttpSession session) {
	 * 
	 * System.out.println("Name OF Course " + courseName);
	 * session.setAttribute("cname", courseName); return "course";
	 * 
	 * }
	 */

	@RequestMapping("course")
	public ModelAndView coures(@RequestParam("csname") String courseName) {

		System.out.println("Name OF Course " + courseName);
		ModelAndView view = new ModelAndView();
		view.addObject("cname", courseName);
		view.setViewName("course");
		return view;

	}

}
