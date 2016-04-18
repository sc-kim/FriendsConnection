package first.entertainer.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import first.common.common.CommandMap;
import first.entertainer.service.EntertainerCategoryService;

@Controller
public class EntertainerCategoryController {
	
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Resource(name="entertainerCategoryService")
	private EntertainerCategoryService eService;
	
	@RequestMapping(value="/entertainer.do")
    public ModelAndView entertainerCategory(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/entertainer/entertainer");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/entertainer/selectEntertainerRankList.do", method = RequestMethod.POST)
    public ModelAndView selectEntertainerRankList(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("jsonView");
    	
    	List<Map<String,Object>> list = eService.selectEntertainerRankList(commandMap.getMap());
    	
    	mv.addObject("list", list);
    	 
    	System.out.println(mv);
    	return mv;
    }
	
}
