package com.junye.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.junye.vo.ImgVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月3日 
* 类说明 :
*/
public interface LunboMapper {
	List<ImgVo> getLunbo();

	List<ImgVo> getthumimagesById(String imgid);
}
