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
public class PetController {
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Resource(name="socialCategoryService")
	private SocialCategoryService sService;
	
	@RequestMapping(value="/social/pet.do")
	public ModelAndView petPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/pet/pet");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/dog.do")
	public ModelAndView dogPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/pet/dog");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/cat.do")
	public ModelAndView catPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/pet/cat");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/etc.do")
	public ModelAndView etcPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/pet/etc");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/selectGCodeB.do", method = RequestMethod.POST)
	public ModelAndView selectGCodeB(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectGCodeB(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectB10.do", method = RequestMethod.POST)
	public ModelAndView selectB10(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectB10(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectB20.do", method = RequestMethod.POST)
	public ModelAndView selectB20(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectB20(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectB30.do", method = RequestMethod.POST)
	public ModelAndView selectB30(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectB30(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	
}
