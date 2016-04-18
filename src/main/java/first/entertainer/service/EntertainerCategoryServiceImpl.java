package first.entertainer.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import first.entertainer.dao.EntertainerCategoryDAO;

@Service("entertainerCategoryService")
public class EntertainerCategoryServiceImpl implements EntertainerCategoryService{
	
	@Resource(name="entertainerCategoryDAO")
	private EntertainerCategoryDAO entertainerCategoryDAO;
	
	@Override
	public List<Map<String, Object>> selectEntertainerRankList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return entertainerCategoryDAO.selectBoardList(map);
	}

}
