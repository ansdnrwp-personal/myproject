package kr.co.onandon.portal.main.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.onandon.portal.main.repository.PortalMainRepository;

@Service("portalMainService")
public class PortalMainServiceImpl implements PortalMainService{

	@Autowired
	private PortalMainRepository portalMainRepository;

	/**
	 * 포탈리스트 테스트 쿼리
	 * 
	 * @param  HashMap<String,Object>
	 * @return List
	 */
	@Override
	public List<HashMap<String,Object>> getTestList(HashMap<String, Object> paramMp) throws Exception {
		return portalMainRepository.getList(paramMp);
	}
	
}
