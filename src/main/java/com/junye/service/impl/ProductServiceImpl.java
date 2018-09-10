package com.junye.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junye.mapper.ProductMapper;
import com.junye.service.ProductService;
import com.junye.vo.ProductVo;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月9日 
* 类说明 :
*/
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductMapper productMapper;
	@Override
	public List<ProductVo> getprodlist() {
		// TODO Auto-generated method stub
		List<ProductVo> productVos =productMapper.getprodlist();
		return productVos;
	}
	@Override
	public void delproductById(Integer id) {
		// TODO Auto-generated method stub
		productMapper.delproductById(id);
	}
	@Override
	public void addproduct(ProductVo productVo) {
		// TODO Auto-generated method stub
		productMapper.addproduct(productVo);
	}

}
