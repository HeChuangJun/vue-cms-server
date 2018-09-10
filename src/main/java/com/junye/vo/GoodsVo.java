package com.junye.vo;

import java.util.Date;

/** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年9月7日 
* 类说明 :
*/
public class GoodsVo {
	private Integer id;
	private String title;
	private Date add_time;
	private String zhaiyao;
	private String click;
	private String img_url;
	private String sell_price;
	private String market_price;
	private String stock_quantity;
	private String content;
	private String good_no;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getAdd_time() {
		return add_time;
	}
	public void setAdd_time(Date add_time) {
		this.add_time = add_time;
	}
	public String getZhaiyao() {
		return zhaiyao;
	}
	public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
	}
	public String getClick() {
		return click;
	}
	public void setClick(String click) {
		this.click = click;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getSell_price() {
		return sell_price;
	}
	public void setSell_price(String sell_price) {
		this.sell_price = sell_price;
	}
	public String getMarket_price() {
		return market_price;
	}
	public void setMarket_price(String market_price) {
		this.market_price = market_price;
	}
	public String getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(String stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getGood_no() {
		return good_no;
	}
	public void setGood_no(String good_no) {
		this.good_no = good_no;
	}
	
}
