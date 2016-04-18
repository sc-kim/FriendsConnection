package first.social.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import first.social.dao.SocialCategoryDAO;

@Service("socialCategoryService")
public class SocialCategoryServiceImpl implements SocialCategoryService{

	@Resource(name="socialCategoryDAO")
	private SocialCategoryDAO socialCategoryDAO;
	
	@Override
	public List<Map<String, Object>> selectSocialAllList(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectBoardList(map);
	}

	@Override
	public List<Map<String, Object>> selectGCodeA(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectGCodeA(map);
	}

	@Override
	public List<Map<String, Object>> selectGCodeB(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectGCodeB(map);
	}

	@Override
	public List<Map<String, Object>> selectGCodeC(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectGCodeC(map);
	}

	@Override
	public List<Map<String, Object>> selectGCodeD(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectGCodeD(map);
	}

	@Override
	public List<Map<String, Object>> selectA10(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectA10(map);
	}

	@Override
	public List<Map<String, Object>> selectA20(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectA20(map);
	}

	@Override
	public List<Map<String, Object>> selectA30(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectA30(map);
	}

	@Override
	public List<Map<String, Object>> selectA40(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectA40(map);
	}

	@Override
	public List<Map<String, Object>> selectA50(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectA50(map);
	}

	@Override
	public List<Map<String, Object>> selectB10(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectB10(map);
	}

	@Override
	public List<Map<String, Object>> selectB20(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectB20(map);
	}

	@Override
	public List<Map<String, Object>> selectB30(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectB30(map);
	}

	@Override
	public List<Map<String, Object>> selectC10(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectC10(map);
	}

	@Override
	public List<Map<String, Object>> selectC20(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectC20(map);
	}

	@Override
	public List<Map<String, Object>> selectC30(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectC30(map);
	}

	@Override
	public List<Map<String, Object>> selectC40(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectC40(map);
	}

	@Override
	public List<Map<String, Object>> selectC50(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectC50(map);
	}

	@Override
	public List<Map<String, Object>> selectD10(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectD10(map);
	}

	@Override
	public List<Map<String, Object>> selectD20(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectD20(map);
	}

	@Override
	public List<Map<String, Object>> selectD30(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectD30(map);
	}

	@Override
	public List<Map<String, Object>> selectD40(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return socialCategoryDAO.selectD40(map);
	}
	

}
