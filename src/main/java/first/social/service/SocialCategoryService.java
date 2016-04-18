package first.social.service;

import java.util.List;
import java.util.Map;

public interface SocialCategoryService {
	List<Map<String, Object>> selectSocialAllList(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> selectGCodeA(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectGCodeB(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectGCodeC(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectGCodeD(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectA10(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectA20(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectA30(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectA40(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectA50(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectB10(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectB20(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectB30(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectC10(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectC20(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectC30(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectC40(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectC50(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectD10(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectD20(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectD30(Map<String, Object> map) throws Exception;
	List<Map<String, Object>> selectD40(Map<String, Object> map) throws Exception;
	
}
