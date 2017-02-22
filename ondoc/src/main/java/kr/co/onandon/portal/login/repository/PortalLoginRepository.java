package kr.co.onandon.portal.login.repository;

import java.sql.SQLException;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PortalLoginRepository {
	
	@Autowired
	private SqlSession sql;

	public String getList(HashMap<String, Object> paramMp) throws SQLException {
		
		return (String)sql.selectOne("portaLogin.getList",paramMp);
	}
}
