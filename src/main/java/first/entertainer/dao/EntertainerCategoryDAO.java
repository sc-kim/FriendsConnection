package first.entertainer.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("entertainerCategoryDAO")
public class EntertainerCategoryDAO extends AbstractDAO{
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("entertainerCategory.selectEntertainerRankList", map);
	}
}
