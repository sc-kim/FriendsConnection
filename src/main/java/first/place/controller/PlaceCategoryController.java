package first.place.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import first.common.common.CommandMap;
import first.place.dto.PlaceCategoryDTO;
import first.place.service.PlaceCategoryService;

@Controller
public class PlaceCategoryController {
	protected Log log = LogFactory.getLog(this.getClass());
	 
	@Resource(name="placeCategoryService")
	private PlaceCategoryService pService;
	
	@RequestMapping(value="/place.do")
    public ModelAndView placeCategory(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/place/place");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/placeCategory/selectPlaceRankList.do", method = RequestMethod.POST)
	public ModelAndView selectPlaceRankList(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("jsonView");
    	log.debug(this.getClass());
    	
    	List<Map<String,Object>> list = pService.selectPlaceRankList(commandMap.getMap());
    	
    	mv.addObject("list", list);
    	 
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/placeCategory/selectLDLocation.do", method = RequestMethod.POST)
	public ModelAndView selectLDLocation(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("jsonView");
    	log.debug(this.getClass());
    	HashMap<String,List<Map<String,Object>>> map = new HashMap<String,List<Map<String,Object>>>();
    	
    	List<Map<String,Object>> list = pService.selectLDLocation(commandMap.getMap());
    	for(int i = 0; i<list.size(); i++){
    		List<Map<String,Object>> tempList = pService.selectLDMapreduce(list.get(i).get("NAME").toString());
    		
    		map.put(Integer.toString(i), tempList);
    	}
    	
    	mv.addObject("map",map);
    	
    	System.out.println(mv);
    	return mv;
    }
	
}
