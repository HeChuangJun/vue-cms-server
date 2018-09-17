package com.junye.vo;

import java.util.Date;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月4日 
* 类说明 :
*/
public class ImageVo {
	private Integer id;
	private String title;
	private String img_url;
	private String zhaiyao;
	private String content;
	private Date add_time;
	private String click;
	
	public String getClick() {
		return click;
	}
	public void setClick(String click) {
		this.click = click;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAdd_time() {
		return add_time;
	}
	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getZhaiyao() {
		return zhaiyao;
	}
	public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
	}
	
}
