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
import com.junye.service.ImageService;
import com.junye.vo.CommentVo;
import com.junye.vo.ImageVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/
@RestController
@RequestMapping("/api")
public class CommentsController {
	@Autowired
	private CommentsService commentsService;
	@RequestMapping("/getcomments/{artid}/{pageindex}")
	public Map<String, Object> getImages(@PathVariable Integer artid,@PathVariable Integer pageindex,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		List<CommentVo> images = commentsService.getcomments(artid,pageindex);
		map.put("status", 0);
		map.put("message", images);
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
	
	@RequestMapping("/postcomment")
	public Map<String, Object> postcomment(@RequestBody CommentVo commentVo,HttpServletResponse rsq){
		Map<String, Object> map = new HashMap<String, Object>();
		commentsService.postcomment(commentVo);
		map.put("status", 0);
		map.put("message", "提交评论成功");
		rsq.setHeader("Access-Control-Allow-Origin", "*"); 
		return map;
	}
}
