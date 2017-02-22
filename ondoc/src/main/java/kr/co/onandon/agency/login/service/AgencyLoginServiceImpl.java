package kr.co.onandon.agency.login.service;



import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.onandon.portal.login.repository.PortalLoginRepository;

@Service("agencyLoginService")
public class AgencyLoginServiceImpl implements AgencyLoginService{

	@Autowired
	private PortalLoginRepository portalLoginRepository;

	@Override
	public String getList(HashMap<String, Object> paramMp) throws Exception {
		return portalLoginRepository.getList(paramMp);
	} 
	
}
