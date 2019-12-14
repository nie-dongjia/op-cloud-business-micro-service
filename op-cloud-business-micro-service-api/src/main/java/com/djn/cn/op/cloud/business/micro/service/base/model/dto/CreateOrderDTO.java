package com.djn.cn.op.cloud.business.micro.service.base.model.dto;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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
public class CreateOrderDTO implements Serializable {
	private static final long serialVersionUID = -199591814856402052L;
	/**deduplicate key 防重提交*/
	@ApiModelProperty(value = "dedupKey ")
	private String dedupKey; 
	/**描述*/
	@ApiModelProperty(value = "描述")
    private String description;
    /**creatorId*/
	@ApiModelProperty(value = "creatorId")
	private Long creatorId;
    /**createOrderItemDTOs*/
	private List<CreateOrderItemDTO> createOrderItemDTOs;
	public CreateOrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDedupKey() {
		return dedupKey;
	}
	public void setDedupKey(String dedupKey) {
		this.dedupKey = dedupKey;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}
	public List<CreateOrderItemDTO> getCreateOrderItemDTOs() {
		return createOrderItemDTOs;
	}
	public void setCreateOrderItemDTOs(List<CreateOrderItemDTO> createOrderItemDTOs) {
		this.createOrderItemDTOs = createOrderItemDTOs;
	}
	@Override
	public String toString() {
		return "CreateOrderDTO [dedupKey=" + dedupKey + ", description=" + description + ", creatorId=" + creatorId
				+ ", createOrderItemDTOs=" + createOrderItemDTOs + "]";
	}
}
