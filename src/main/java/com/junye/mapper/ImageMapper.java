package com.junye.mapper;

import java.util.List;

import com.junye.vo.ImageVo;
import com.junye.vo.NewsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月4日 
* 类说明 :
*/
public interface ImageMapper {

	List<ImageVo> getImages(String cateid);

	List<NewsVo> getImgcategory();

	ImageVo getimageInfoById(String imgid);
	
}
