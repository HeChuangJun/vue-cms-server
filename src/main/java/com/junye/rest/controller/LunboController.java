package com.junye.rest.controller;

import java.security.Provider.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junye.service.LunboService;
import com.junye.service.impl.LunboServiceImpl;
import com.junye.vo.ImgVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月3日 
* 类说明 :
*/
@RestController("LunboController")
@RequestMapping("/api")
public class LunboController {
	@Autowired
	private LunboService lunboService;
	@RequestMapping("/getlunbo")
	public Map<String,Object> getLunbo(HttpServletRequest req,HttpServletResponse rsq){
		Map<String,Object> map = new HashMap<String, Object>();
		List<ImgVo> lunbo = lunboService.getLunbo();
		Map<String,Object> map2 = new HashMap<String, Object>();		
		map.put("status", 0);
		map.put("message", lunbo);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	
	@RequestMapping("/getthumimages/{imgid}")
	public Map<String,Object> getthumimagesById(@PathVariable("imgid") String imgid,HttpServletRequest req,HttpServletResponse rsq){
		Map<String,Object> map = new HashMap<String, Object>();
		List<ImgVo> images = lunboService.getthumimagesById(imgid);
		Map<String,Object> map2 = new HashMap<String, Object>();		
		map.put("status", 0);
		map.put("message", images);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
}
