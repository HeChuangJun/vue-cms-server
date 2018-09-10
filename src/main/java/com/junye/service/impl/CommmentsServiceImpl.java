package com.junye.service.impl;
/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junye.mapper.CommentsMapper;
import com.junye.service.CommentsService;
import com.junye.vo.CommentVo;
@Service
public class CommmentsServiceImpl implements CommentsService{
	@Autowired
	private CommentsMapper commentsMapper;
	@Override
	public List<CommentVo> getcomments(Integer artid, Integer pageindex) {
		// TODO Auto-generated method stub
		int newpageindex=(pageindex-1)*10;
		List<CommentVo> abCommentVos=commentsMapper.getcomments(artid,newpageindex);
		return abCommentVos;
	}
	@Override
	public void postcomment(CommentVo commentVo) {
		// TODO Auto-generated method stub
		commentsMapper.postcomment(commentVo);
	}
	
}
