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
public class BeautyController {
protected Log log = LogFactory.getLog(this.getClass());
	
	@Resource(name="socialCategoryService")
	private SocialCategoryService sService;
	
	@RequestMapping(value="/social/beauty.do")
	public ModelAndView beautyPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/beauty/beauty");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/skincare.do")
	public ModelAndView skincarePage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/beauty/skincare");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/makeup.do")
	public ModelAndView makeupPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/beauty/makeup");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/nail.do")
	public ModelAndView nailPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/beauty/nail");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/diet.do")
	public ModelAndView dietPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/beauty/diet");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/selectGCodeD.do", method = RequestMethod.POST)
	public ModelAndView selectGCodeD(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectGCodeD(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectD10.do", method = RequestMethod.POST)
	public ModelAndView selectD10(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectD10(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectD20.do", method = RequestMethod.POST)
	public ModelAndView selectD20(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectD20(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectD30.do", method = RequestMethod.POST)
	public ModelAndView selectD30(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectD30(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectD40.do", method = RequestMethod.POST)
	public ModelAndView selectD40(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectD40(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
}
