package first.food.service;

import java.util.List;
import java.util.Map;

import first.food.dto.FoodCategoryDTO;

public interface FoodCategoryService {

	List<Map<String, Object>> selectFoodRankList(Map<String, Object> map) throws Exception;
	
	void updateFoodRankList(FoodCategoryDTO fDTO) throws Exception;
}
