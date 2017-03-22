package kr.co.onandon.portal.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.onandon.portal.main.service.PortalMainService;

@Controller
public class PortalMainController {
	
	@Autowired
	private PortalMainService portalMainService;
	
	
	/**
	 * 문쌤 로그인 페이지 접속
	 * @throws Exception 
	 */
	@RequestMapping(value = "/")
	public ModelAndView mainLogin(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		HashMap<String, Object> paramMp = new HashMap<String,Object>();
		 
		paramMp.put("test", "TESTOK");
		List<HashMap<String,Object>> resultList = portalMainService.getTestList(paramMp);
		

		for (HashMap<String,Object> mp : resultList) {
			System.out.println(mp);
		}
		
		mav.setViewName("portal/main/portalMain");
		return mav;
	}

}
