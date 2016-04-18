package first.place.service;

import java.util.List;
import java.util.Map;

import first.place.dto.PlaceCategoryDTO;

public interface PlaceCategoryService {
	
	List<Map<String, Object>> selectPlaceRankList(Map<String, Object> map) throws Exception;

	//void insertPlaceData(Map<String, Object> map, HttpServletRequest request) throws Exception;

	void insertPlaceData(PlaceCategoryDTO pDTO) throws Exception;
	
	List<Map<String, Object>> selectLDLocation(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> selectLDMapreduce(String param) throws Exception;
}
