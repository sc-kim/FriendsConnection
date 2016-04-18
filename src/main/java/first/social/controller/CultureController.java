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
public class CultureController {
protected Log log = LogFactory.getLog(this.getClass());
	
	@Resource(name="socialCategoryService")
	private SocialCategoryService sService;
	
	@RequestMapping(value="/social/culture.do")
	public ModelAndView culturePage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/culture/culture");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/book.do")
	public ModelAndView bookPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/culture/book");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/music.do")
	public ModelAndView musicPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/culture/music");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/drawing.do")
	public ModelAndView drawingPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/culture/drawing");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/board.do")
	public ModelAndView boardPage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/culture/board");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/picture.do")
	public ModelAndView picturePage(CommandMap commandMap) throws Exception{
    	ModelAndView mv = new ModelAndView("/social/culture/picture");
    	System.out.println(mv);
    	return mv;
    }
	
	@RequestMapping(value="/social/selectGCodeC.do", method = RequestMethod.POST)
	public ModelAndView selectGCodeC(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectGCodeC(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectC10.do", method = RequestMethod.POST)
	public ModelAndView selectC10(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectC10(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectC20.do", method = RequestMethod.POST)
	public ModelAndView selectC20(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectC20(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectC30.do", method = RequestMethod.POST)
	public ModelAndView selectC30(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectC30(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectC40.do", method = RequestMethod.POST)
	public ModelAndView selectC40(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectC40(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	@RequestMapping(value="/social/selectC50.do", method = RequestMethod.POST)
	public ModelAndView selectC50(CommandMap map) throws Exception{
		ModelAndView mv = new ModelAndView("jsonView");
		
		List<Map<String,Object>> list = sService.selectC50(map.getMap());
		
		mv.addObject("list",list);
		
		return mv;
	}
}
