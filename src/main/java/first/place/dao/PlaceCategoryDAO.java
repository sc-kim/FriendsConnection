package first.place.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;
import first.place.dto.PlaceCategoryDTO;

@Repository("placeCategoryDAO")
public class PlaceCategoryDAO extends AbstractDAO{
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("placeCategory.selectPlaceRankList", map);
	}
	@SuppressWarnings("all")
	public void insertPlaceData(PlaceCategoryDTO pDTO) throws Exception{
		insert("placeCategory.insertPlaceData", pDTO);
	}
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectLDLocation() throws Exception{
		return (List<Map<String, Object>>)selectList("placeCategory.selectLDLocation");
	}
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectLDMapreduce(String param) throws Exception{
		return (List<Map<String, Object>>)selectList("placeCategory.selectLDMapreduce",param);
	}
	
	
}
