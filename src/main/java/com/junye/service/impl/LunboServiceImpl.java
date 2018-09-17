package com.junye.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junye.mapper.LunboMapper;
import com.junye.service.LunboService;
import com.junye.vo.ImgVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月3日 
* 类说明 :
*/
@Service
public class LunboServiceImpl implements LunboService{
	@Autowired
	private LunboMapper lunboMapper;
	@Override
	public List<ImgVo> getLunbo() {
		// TODO Auto-generated method stub
		List<ImgVo> lunbo = lunboMapper.getLunbo();
		return lunbo;
	}
	@Override
	public List<ImgVo> getthumimagesById(String imgid) {
		// TODO Auto-generated method stub
		List<ImgVo> images= lunboMapper.getthumimagesById(imgid);
		return images;
	}

}
