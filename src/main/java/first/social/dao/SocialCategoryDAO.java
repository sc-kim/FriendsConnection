package first.social.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("socialCategoryDAO")
public class SocialCategoryDAO extends AbstractDAO{
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialAllList", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectGCodeA(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialG_CODEList_A", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectGCodeB(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialG_CODEList_B", map);
	}

	@SuppressWarnings("all")
	public List<Map<String, Object>> selectGCodeC(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialG_CODEList_C", map);
	}

	@SuppressWarnings("all")
	public List<Map<String, Object>> selectGCodeD(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialG_CODEList_D", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectA10(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_A_10", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectA20(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_A_20", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectA30(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_A_30", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectA40(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_A_40", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectA50(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_A_50", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectB10(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_B_10", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectB20(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_B_20", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectB30(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_B_30", map);
	}
		
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectC10(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_C_10", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectC20(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_C_20", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectC30(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_C_30", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectC40(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_C_40", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectC50(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_C_50", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectD10(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_D_10", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectD20(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_D_20", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectD30(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_D_30", map);
	}
	
	@SuppressWarnings("all")
	public List<Map<String, Object>> selectD40(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectPagingList("socialCategory.selectSocialD_CODEList_D_40", map);
	}
	
}
