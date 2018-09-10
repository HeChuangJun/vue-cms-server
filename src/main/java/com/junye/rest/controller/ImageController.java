package com.junye.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junye.service.ImageService;
import com.junye.vo.ImageVo;
import com.junye.vo.NewsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月4日 
* 类说明 :
*/
@RestController
@RequestMapping("/api")
public class ImageController {
	@Autowired
	private ImageService imageservice;
	@RequestMapping("/getimages/{cateid}")
	public Map<String, Object> getImages(@PathVariable("cateid") String cateid,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		List<ImageVo> images = imageservice.getImages(cateid);
		map.put("status", 0);
		map.put("message", images);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	
	@RequestMapping("/getimgcategory")
	public Map<String, Object> getImgcategory(HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		List<NewsVo> images = imageservice.getImgcategory();		
		map.put("status", 0);
		map.put("message", images);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	@RequestMapping("/getimageInfo/{imgid}")
	public Map<String, Object> getimageInfoById(@PathVariable("imgid") String imgid,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		ImageVo image = imageservice.getimageInfoById(imgid);		
		map.put("status", 0);
		map.put("message", image);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
}
