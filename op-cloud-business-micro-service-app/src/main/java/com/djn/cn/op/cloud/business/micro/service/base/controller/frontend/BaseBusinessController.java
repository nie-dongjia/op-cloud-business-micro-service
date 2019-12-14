package com.djn.cn.op.cloud.business.micro.service.base.controller.frontend;




import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.djn.cn.op.cloud.base.micro.service.base.api.MdmItemCodeFeignApi;
import com.djn.cn.op.cloud.base.micro.service.base.model.dto.ItemCodeDTO;
import com.djn.cn.op.cloud.goods.micro.service.base.api.GCGoodsInfoFeignApi;
import com.djn.cn.op.cloud.goods.micro.service.base.model.dto.GoodsInfoDTO;
import com.djn.cn.op.cloud.order.micro.service.base.api.ODROrderInfoFeignApi;
import com.djn.cn.op.cloud.order.micro.service.base.model.dto.OrderInfoDTO;
import com.djn.cn.op.cloud.settlement.micro.service.base.api.PCSettlementInfoFeignApi;
import com.djn.cn.op.cloud.settlement.micro.service.base.model.dto.SettlementInfoDTO;
import com.djn.cn.op.cloud.ucenter.micro.service.base.api.UCTUserInfoFeignApi;
import com.djn.cn.op.cloud.ucenter.micro.service.base.model.dto.UserInfoDTO;
import com.djn.cn.op.common.service.model.ServiceReturn;
import com.djn.cn.op.common.service.util.ServiceReturnUtil;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value = "/base-business",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class BaseBusinessController{
	private static final Logger logger = LoggerFactory.getLogger(BaseBusinessController.class);
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
	
	@ApiOperation(httpMethod = "POST", value = "测试服务")
	@GetMapping(value = "/test")
	public ServiceReturn<String> testService() {	
		ServiceReturn<OrderInfoDTO>  orderInfoDTOReturn = oDROrderInfoFeignApi.findById(1L);
		System.out.println("orderInfoDTOReturn:"+orderInfoDTOReturn.getData());
		ServiceReturn<GoodsInfoDTO>  goodsInfoDTOReturn = gCGoodsInfoFeignApi.findById(1L);
		System.out.println("goodsInfoDTOReturn:"+goodsInfoDTOReturn.getData());
		ServiceReturn<SettlementInfoDTO>  settlementDTOReturn = pCSettlementInfoFeignApi.findById(1L);
		System.out.println("settlementDTOReturn:"+settlementDTOReturn.getData());
		ServiceReturn<List<ItemCodeDTO>> itemCodeDTOeReturn = mdmItemCodeFeignApi.getByCategory("sex");
		System.out.println("itemCodeDTOeReturn:"+itemCodeDTOeReturn.getData());
		ServiceReturn<UserInfoDTO> userInfoDTOeReturn = uCTUserInfoFeignApi.findById(1L);
		System.out.println("userInfoDTOeReturn:"+userInfoDTOeReturn.getData());
		// 1、参数校验
		// 2、组装数据
		// 3、业务逻辑
		return ServiceReturnUtil.ok("success");
	}
}
