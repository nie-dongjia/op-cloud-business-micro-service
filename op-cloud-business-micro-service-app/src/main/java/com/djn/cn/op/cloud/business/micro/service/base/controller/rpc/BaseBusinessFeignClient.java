package com.djn.cn.op.cloud.business.micro.service.base.controller.rpc;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.djn.cn.op.cloud.base.micro.service.base.api.MdmItemCodeFeignApi;
import com.djn.cn.op.cloud.business.micro.service.base.api.BaseBusinessFeignApi;
import com.djn.cn.op.cloud.business.micro.service.base.model.dto.ConfirmOrderDTO;
import com.djn.cn.op.cloud.business.micro.service.base.model.dto.CreateOrderDTO;
import com.djn.cn.op.cloud.goods.micro.service.base.api.GCGoodsInfoFeignApi;
import com.djn.cn.op.cloud.order.micro.service.base.api.ODROrderInfoFeignApi;
import com.djn.cn.op.cloud.settlement.micro.service.base.api.PCSettlementInfoFeignApi;
import com.djn.cn.op.cloud.ucenter.micro.service.base.api.UCTUserInfoFeignApi;
import com.djn.cn.op.common.service.model.ServiceReturn;

import io.swagger.annotations.ApiOperation;





@RestController
public class BaseBusinessFeignClient implements  BaseBusinessFeignApi{
	private static final Logger logger = LoggerFactory.getLogger(BaseBusinessFeignClient.class);
	@Autowired
	private PCSettlementInfoFeignApi pCSettlementInfoFeignApi;  // 支付中心基础服务
	@Autowired
	private MdmItemCodeFeignApi mdmItemCodeFeignApi;  // 基础数据中心基础服务
	@Autowired
	private UCTUserInfoFeignApi uCTUserInfoFeignApi;  // 用户中心基础服务
	@Autowired
	private GCGoodsInfoFeignApi gCGoodsInfoFeignApi;  // 商品中心基础服务
	@Autowired
	private ODROrderInfoFeignApi oDROrderInfoFeignApi; // 订单中心基础服务
	@Override
	@ApiOperation(httpMethod = "POST", value = "新增订单")
	public ServiceReturn<CreateOrderDTO> createOrder(@RequestBody CreateOrderDTO createOrderDTO) {		
		// 1、参数校验
		// 2、组装数据
		// 3、业务逻辑
		return null;
	}
	@Override
	public ServiceReturn<CreateOrderDTO> confirmOrder(ConfirmOrderDTO createOrderDTO) {
		// TODO Auto-generated method stub
		return null;
	}
}
