package first.food.controller;

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
import first.food.dto.FoodCategoryDTO;
import first.food.service.FoodCategoryService;

@Controller
public class FoodCategoryController {
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Resource(name="foodCategoryService")
	private FoodCategoryService fService;
	
	@RequestMapping(value="/food.do")
    public ModelAndView foodCategory(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/food/food");
    	System.out.println(mv);
    	return mv;
    }
	
	
	@RequestMapping(value="/foodCategory/selectFoodRankList.do", method = RequestMethod.POST)
    public ModelAndView selectFoodRankList(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("jsonView");
    	
    	List<Map<String,Object>> list = fService.selectFoodRankList(commandMap.getMap());
    	
    	mv.addObject("list", list);
    	 
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/foodCategory/updateFoodData.do", method=RequestMethod.POST)
	public void updateFoodRankList(CommandMap commandMap, FoodCategoryDTO fDTO, 
		      HttpServletRequest request, HttpServletResponse response, ModelMap model) throws Exception{
		log.debug(this.getClass());
		
		String[] test = request.getParameterValues("params");

		for(String str : test){
			System.out.println( str );
		}
		
 
    	
    	
		/*
    	fDTO.setDocId(request.getParameter("docId"));
    	fDTO.setLikesCount(Integer.parseInt((request.getParameter("likesCount"))));
    	
    	try{
    		fService.updateFoodRankList(fDTO);
    	}catch(Exception e ){
    		e.printStackTrace();
    	}
		*/
		
		
	}
	
}
