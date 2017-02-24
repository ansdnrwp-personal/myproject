package kr.co.onandon.common.util;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	/**
	 * json mapper
	 */
	static ObjectMapper om = new ObjectMapper();
	
	/**List을 Json 문자열로 변환
	 * @throws JsonProcessingException  
	 * 
	 */
	public static String listORJosnConvert(List list) throws JsonProcessingException{
		return om.writeValueAsString(list);
	}
	
	/**Map을 Json 문자열로 변환
	 * @throws JsonProcessingException  
	 * 
	 */
	public static String mapORJosnConvert(Map mp) throws JsonProcessingException{
		return om.writeValueAsString(mp);
	}
	
	
	/**Json을 List로 변환
	 * @throws JsonProcessingException  
	 * 
	 */
	public static List<Map<String,Object>> jsonORListConvert(Map mp) throws JsonProcessingException{
		return null;
	}
}
