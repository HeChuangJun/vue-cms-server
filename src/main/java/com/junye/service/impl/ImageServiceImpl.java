package com.junye.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junye.mapper.ImageMapper;
import com.junye.service.ImageService;
import com.junye.vo.ImageVo;
import com.junye.vo.NewsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月4日 
* 类说明 :
*/
@Service
public class ImageServiceImpl implements ImageService{
	@Autowired
	private ImageMapper imageMapper;
	@Override
	public List<ImageVo> getImages(String cateid) {
		// TODO Auto-generated method stub
		List<ImageVo> images = imageMapper.getImages(cateid);
		return images;
	}
	@Override
	public List<NewsVo> getImgcategory() {
		// TODO Auto-generated method stub
		List<NewsVo> images = imageMapper.getImgcategory();
		return images;
	}
	@Override
	public ImageVo getimageInfoById(String imgid) {
		// TODO Auto-generated method stub
		ImageVo imageVo = imageMapper.getimageInfoById(imgid);
		return imageVo;
	}
	
}
