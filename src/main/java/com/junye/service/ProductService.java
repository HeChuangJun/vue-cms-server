package com.junye.service;

import java.util.List;

import com.junye.vo.ProductVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/
public interface ProductService {

	List<ProductVo> getprodlist();

	void delproductById(Integer id);

	void addproduct(ProductVo productVo);

}
