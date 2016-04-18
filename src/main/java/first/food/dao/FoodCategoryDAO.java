package first.food.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;
import first.food.dto.FoodCategoryDTO;

@Repository("foodCategoryDAO")
public class FoodCategoryDAO extends AbstractDAO{

	@SuppressWarnings("all")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("foodCategory.selectFoodRankList", map);
	}
	
	@SuppressWarnings("all")
	public void updateFoodRankList(FoodCategoryDTO fDTO) throws Exception{
		insert("foodCategory.updateFoodData", fDTO);
	}
	
}
