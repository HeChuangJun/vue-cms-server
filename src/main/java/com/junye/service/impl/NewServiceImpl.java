package com.junye.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junye.mapper.NewsMapper;
import com.junye.service.NewsService;
import com.junye.vo.ImgVo;
import com.junye.vo.NewsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月3日 
* 类说明 :
*/
@Service
public class NewServiceImpl implements NewsService{
	@Autowired
	private NewsMapper newmapper;
	@Override
	public List<NewsVo> getNewsList() {
		// TODO Auto-generated method stub
		
		return newmapper.getNewsList();
	}
	@Override
	public NewsVo getNewbyId(String id) {
		// TODO Auto-generated method stub
		return newmapper.getNewbyId(id);
	}

}
