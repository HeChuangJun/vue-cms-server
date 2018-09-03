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
import com.junye.service.NewsService;
import com.junye.service.impl.LunboServiceImpl;
import com.junye.vo.ImgVo;
import com.junye.vo.NewsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月3日 
* 类说明 :
*/
@RestController("NewsController")
@RequestMapping("/api")
public class NewsController {
	@Autowired
	private NewsService newsService;
	@RequestMapping("/getnewslist")
	public Map<String,Object> getNewsList(HttpServletRequest req,HttpServletResponse rsq){
		Map<String,Object> map = new HashMap<String, Object>();
		List<NewsVo> lunbo = newsService.getNewsList();
		
		//map2.put("url", lunbo);
		
		map.put("status", 0);
		map.put("message", lunbo);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	@RequestMapping("/getnew/{newid}")
	public Map<String,Object> getNewbyId(@PathVariable("newid") String newid,HttpServletResponse rsq){
		Map<String,Object> map = new HashMap<String, Object>();
		NewsVo newsVo=newsService.getNewbyId(newid);
		map.put("status", 0);
		map.put("message", newsVo);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
}
