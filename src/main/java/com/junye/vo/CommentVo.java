package com.junye.vo;
/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月7日 
* 类说明 :
*/

import java.util.Date;

public class CommentVo {
	private String user_name;
	private Date add_time;
	private String content;
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Date getAdd_time() {
		return add_time;
	}
	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
