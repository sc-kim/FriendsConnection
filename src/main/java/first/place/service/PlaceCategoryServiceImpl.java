package first.place.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import first.place.dao.PlaceCategoryDAO;
import first.place.dto.PlaceCategoryDTO;

@Service("placeCategoryService")
public class PlaceCategoryServiceImpl implements PlaceCategoryService{
	
	@Resource(name="placeCategoryDAO")
	private PlaceCategoryDAO placeCategoryDAO;
	
	@Override
	public List<Map<String, Object>> selectPlaceRankList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return placeCategoryDAO.selectBoardList(map);
	}
	
	@Override
	public void insertPlaceData(PlaceCategoryDTO pDTO) throws Exception {
		// TODO Auto-generated method stub
		placeCategoryDAO.insertPlaceData(pDTO);
	}

	@Override
	public List<Map<String, Object>> selectLDLocation(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return placeCategoryDAO.selectLDLocation();
	}

	@Override
	public List<Map<String, Object>> selectLDMapreduce(String param) throws Exception {
		// TODO Auto-generated method stub
		return placeCategoryDAO.selectLDMapreduce(param);
	}

}
