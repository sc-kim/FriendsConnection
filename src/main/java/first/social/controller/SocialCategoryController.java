package first.social.controller;

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
import first.social.service.SocialCategoryService;

@Controller
public class SocialCategoryController {
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Resource(name="socialCategoryService")
	private SocialCategoryService sService;
	
	@RequestMapping(value="/social.do")
    public ModelAndView socialCategory(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/social");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/selectSocialAllList.do", method = RequestMethod.POST)
	public ModelAndView selectSocialAllList(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectSocialAllList(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
}
