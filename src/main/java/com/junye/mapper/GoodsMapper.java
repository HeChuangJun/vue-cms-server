package com.junye.mapper;

import java.util.List;

import com.junye.vo.GoodsVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/
public interface GoodsMapper {

	List<GoodsVo> getgoods(Integer pageindex);

	List<GoodsVo> getshopcarlist(String[] ids);

	GoodsVo getinfo(Integer id);

	GoodsVo getdesc(Integer id);

}
