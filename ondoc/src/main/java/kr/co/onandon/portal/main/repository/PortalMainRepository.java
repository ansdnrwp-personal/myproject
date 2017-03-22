package kr.co.onandon.portal.main.repository;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PortalMainRepository {

	@Autowired
	private SqlSession sql;
	
	public List<HashMap<String,Object>> getList(HashMap<String, Object> paramMp) throws SQLException {
		return sql.selectList("portalMain.getTestList", paramMp);
	}
}
