package kr.co.onandon.portal.login.service;



import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.onandon.portal.login.repository.PortalLoginRepository;

@Service("portalLoginService")
public class PortalLoginServiceImpl implements PortalLoginService{

	//@Resource(name="portalLoginRepository")
	@Autowired
	private PortalLoginRepository portalLoginRepository;

	@Override
	public String getList(HashMap<String, Object> paramMp) throws Exception {
		return portalLoginRepository.getList(paramMp);
	} 
	
}
