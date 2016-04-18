package first.common.util;

import net.sf.json.JSONObject;

public class JsonUtil {
	public static String getJsonString(Object obj){
		if(obj == null) return null;
		return JSONObject.fromObject(obj).toString();
	}
}
