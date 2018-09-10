package com.junye.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junye.mapper.GoodsMapper;
import com.junye.service.GoodsService;
import com.junye.vo.GoodsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/
@Service
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsMapper goodsMapper;
	@Override
	public List<GoodsVo> getgoods(Integer pageindex) {
		// TODO Auto-generated method stub
		int newpageindex=(pageindex-1)*10;
		 List<GoodsVo> goodsVos=goodsMapper.getgoods(pageindex);
		return goodsVos;
	}
	@Override
	public List<GoodsVo> getshopcarlist(String[] ids) {
		// TODO Auto-generated method stub
		List<GoodsVo> goodsVos=goodsMapper.getshopcarlist(ids);
		return goodsVos;
	}
	@Override
	public GoodsVo getinfo(Integer id) {
		// TODO Auto-generated method stub
		GoodsVo goodsVo=goodsMapper.getinfo(id);
		return goodsVo;
	}

}
