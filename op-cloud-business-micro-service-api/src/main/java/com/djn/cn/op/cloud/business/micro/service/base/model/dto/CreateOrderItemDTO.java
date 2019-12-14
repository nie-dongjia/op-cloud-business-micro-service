package com.djn.cn.op.cloud.business.micro.service.base.model.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;

/**
 * 
 * <b>类   名：</b>createOrderDTO<br/>
 * <b>类描述：</b>新增订单DTO <br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年12月15日 上午10:57:10<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年12月15日 上午10:57:10<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@ApiModel
public class CreateOrderItemDTO implements Serializable{
	private static final long serialVersionUID = 4866695485731604083L;
	/**描述*/
    private String description;
    private String name;
    private String systemCode;
	private BigDecimal price;
	private Long goodsInfoId;
	public CreateOrderItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Long getGoodsInfoId() {
		return goodsInfoId;
	}
	public void setGoodsInfoId(Long goodsInfoId) {
		this.goodsInfoId = goodsInfoId;
	}
	@Override
	public String toString() {
		return "CreateOrderItemDTO [description=" + description + ", name=" + name + ", systemCode=" + systemCode
				+ ", price=" + price + ", goodsInfoId=" + goodsInfoId + "]";
	}
}
