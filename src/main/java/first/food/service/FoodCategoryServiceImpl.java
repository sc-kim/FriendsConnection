package first.food.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import first.food.dao.FoodCategoryDAO;
import first.food.dto.FoodCategoryDTO;

@Service("foodCategoryService")
public class FoodCategoryServiceImpl implements FoodCategoryService{

	@Resource(name="foodCategoryDAO")
	private FoodCategoryDAO foodCategoryDAO;
	
	@Override
	public List<Map<String, Object>> selectFoodRankList(Map<String, Object> map) throws Exception {
		return foodCategoryDAO.selectBoardList(map);
	}

	@Override
	public void updateFoodRankList(FoodCategoryDTO fDTO) throws Exception {
		foodCategoryDAO.updateFoodRankList(fDTO);
	}

}
