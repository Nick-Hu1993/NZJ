package org.tool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonObject {
	public static Object getResult(int code,String msg,Object data){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", code);
		map.put("msg", msg);
		map.put("data", data);
		return map;
	}
}
