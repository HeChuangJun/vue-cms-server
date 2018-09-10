package com.junye.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junye.service.GoodsService;
import com.junye.vo.CommentVo;
import com.junye.vo.GoodsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/
@RestController
@RequestMapping("/api")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/getgoods/{pageindex}")
	public Map<String, Object> getgoods(@PathVariable Integer pageindex,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		List<GoodsVo> goodlistGoodsVos=goodsService.getgoods(pageindex);
		map.put("status", 0);
		map.put("message", goodlistGoodsVos);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	
	@RequestMapping("/goods/getshopcarlist/{ids}")
	public Map<String, Object> getgoods(@PathVariable String[] ids,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		List<GoodsVo> goodlistGoodsVos=goodsService.getshopcarlist(ids);
		map.put("status", 0);
		map.put("message", goodlistGoodsVos);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	
	@RequestMapping("/goods/getinfo/{id}")
	public Map<String, Object> getinfo(@PathVariable Integer id,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		GoodsVo goodlistGoodsVos=goodsService.getinfo(id);
		map.put("status", 0);
		map.put("message", goodlistGoodsVos);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
}
