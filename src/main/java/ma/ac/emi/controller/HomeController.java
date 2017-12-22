package ma.ac.emi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
*
* @author RipPer
*/

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView Accueil(){
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("message", "SIGB HOME");
		return mav;
	}
}
