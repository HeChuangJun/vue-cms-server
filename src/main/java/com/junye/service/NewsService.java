package com.junye.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.junye.vo.ImgVo;
import com.junye.vo.NewsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月3日 
* 类说明 :
*/
@Service
public interface NewsService {
	List<NewsVo> getNewsList();

	NewsVo getNewbyId(String id);
}
