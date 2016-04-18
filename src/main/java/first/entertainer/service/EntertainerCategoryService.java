package first.entertainer.service;

import java.util.List;
import java.util.Map;

public interface EntertainerCategoryService {
	List<Map<String, Object>> selectEntertainerRankList(Map<String, Object> map) throws Exception;
}
