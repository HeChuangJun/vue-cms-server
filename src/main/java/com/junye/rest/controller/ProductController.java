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

import com.junye.service.CommentsService;
import com.junye.service.ProductService;
import com.junye.vo.CommentVo;
import com.junye.vo.ProductVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/
@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/getprodlist")
	public Map<String, Object> getprodlist(HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		List<ProductVo> productVos= productService.getprodlist();
		map.put("status", 0);
		map.put("message", productVos);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	@RequestMapping("/delproduct/{id}")
	public Map<String, Object> delproductById(@PathVariable Integer id,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		productService.delproductById(id);
		map.put("status", 0);
		map.put("message", "删除品牌数据ok");
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	@RequestMapping("/addproduct")
	public Map<String, Object> addproduct(@RequestBody ProductVo productVo,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		productService.addproduct(productVo);
		map.put("status", 0);
		map.put("message", "添加成功");
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	
}
