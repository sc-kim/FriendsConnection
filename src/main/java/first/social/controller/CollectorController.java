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
public class CollectorController {
	protected Log log = LogFactory.getLog(this.getClass());
	
	@Resource(name="socialCategoryService")
	private SocialCategoryService sService;
	
	@RequestMapping(value="/social/collector.do")
	public ModelAndView collectorPage(CommandMap map) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/collector/collector");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/lego.do")
	public ModelAndView legoPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/collector/lego");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/figure.do")
	public ModelAndView figurePage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/collector/figure");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/shoes.do")
	public ModelAndView shoesPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/collector/shoes");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/plamodel.do")
	public ModelAndView plamodelPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/collector/plamodel");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/ani.do")
	public ModelAndView aniPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/collector/ani");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/selectGCodeA.do", method = RequestMethod.POST)
	public ModelAndView selectGCodeA(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectGCodeA(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectA10.do", method = RequestMethod.POST)
	public ModelAndView selectA10(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectA10(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectA20.do", method = RequestMethod.POST)
	public ModelAndView selectA20(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectA20(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectA30.do", method = RequestMethod.POST)
	public ModelAndView selectA30(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectA30(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectA40.do", method = RequestMethod.POST)
	public ModelAndView selectA40(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectA40(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectA50.do", method = RequestMethod.POST)
	public ModelAndView selectA50(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectA50(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	
}
