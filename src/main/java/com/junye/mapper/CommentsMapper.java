package com.junye.mapper;

import java.util.List;

import com.junye.vo.CommentVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/
public interface CommentsMapper {

	List<CommentVo> getcomments(Integer artid, Integer pageindex);

	void postcomment(CommentVo commentVo);

}
