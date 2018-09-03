package com.junye.mapper;

import java.util.List;

import com.junye.vo.NewsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月3日 
* 类说明 :
*/
public interface NewsMapper {
	List<NewsVo> getNewsList();

	NewsVo getNewbyId(String id);
}
