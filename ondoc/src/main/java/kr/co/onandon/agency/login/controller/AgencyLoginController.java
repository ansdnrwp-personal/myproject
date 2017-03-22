package kr.co.onandon.agency.login.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.ws.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import kr.co.onandon.agency.login.service.AgencyLoginService;
import kr.co.onandon.common.util.JsonUtil;

@Controller
public class AgencyLoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(AgencyLoginController.class);
	
	@Autowired
	private AgencyLoginService agencyLoginService;
	
	/**
	 * 관리자 첫 로그인 화면 호출
	 * @throws Exception 
	 */
	@RequestMapping(value = "/agencyLogin.do")
	public ModelAndView agencyLogin(Locale locale, Model model) throws Exception {
		ModelAndView mav = new ModelAndView();
		System.out.println("깃허브 연동성공");
		
		mav.setViewName("agency/login/agencyLogin");
		return mav;
	}

	@RequestMapping(value = "/agencyLoginCheck.do")
	@ResponseBody
	public Map<String,String> agencyLoginChek(@RequestBody MultiValueMap<String, String> paramMp) throws Exception{
		
		System.out.println(paramMp);
		
		Map<String,String> resultMp = new HashMap<String,String>();
		
		Map<String,String> mp = new HashMap<String,String>();
		
		mp.put("name", "문욱제");
		mp.put("age", "29");
		 // 테스트 데이터 : 맵에 string 2개랑 list 하나가 들어가 있는 형태
        List<Map<String,String>> list = new ArrayList<Map<String,String>>();
        list.add(mp);
        list.add(mp);
        list.add(mp);
 
        String jsonStr = JsonUtil.listORJosnConvert(list);
		
        resultMp.put("list", jsonStr);
         
		return resultMp;
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
		
		
		return "agency/main/agencyMain";
	}
	
}
