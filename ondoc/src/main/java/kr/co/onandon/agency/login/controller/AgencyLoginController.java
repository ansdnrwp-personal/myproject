package kr.co.onandon.agency.login.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.onandon.agency.login.service.AgencyLoginService;
import kr.co.onandon.portal.login.repository.PortalLoginRepository;
import kr.co.onandon.portal.login.service.PortalLoginService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AgencyLoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(AgencyLoginController.class);
	
	//@Resource(name="portalLoginService")
	@Autowired
	private AgencyLoginService agencyLoginService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/agencyLogin.do", method = RequestMethod.GET)
	public ModelAndView agencyLogin(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("agency/login/agencyLogin");
		return mav;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @throws Exception 
	 */
	@RequestMapping(value = "/agencyMain.do", method = RequestMethod.GET)
	public String agencyMain(Locale locale, Model model) throws Exception {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		System.out.println("fdsafds");
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		HashMap<String, Object> paramMp = new HashMap<String, Object>();
		paramMp.put("fcltcd", "1");
		
		model.addAttribute("fcltnm", agencyLoginService.getList(paramMp) );
		
		return "agency/main/agencyMain";
	}
	
}
