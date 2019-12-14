package com.djn.cn.op.cloud.business.micro.service.base.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.djn.cn.op.cloud.business.micro.service.base.api.hystrix.BaseBusinessFeignHystrix;
import com.djn.cn.op.cloud.business.micro.service.base.model.dto.ConfirmOrderDTO;
import com.djn.cn.op.cloud.business.micro.service.base.model.dto.CreateOrderDTO;
import com.djn.cn.op.cloud.common.config.FeignConfig;
import com.djn.cn.op.common.service.model.ServiceReturn;



/**
 * 
 * <b>类   名：</b>BaseBusinessFeignApi  <br/>
 * <b>类描述：</b>The interface UTC  business feign api.  模拟分布式框架下  业务流程构建  <br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年12月8日 上午10:37:37<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年12月8日 上午10:37:37<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@FeignClient(value = "business-micro-service",configuration = FeignConfig.class,fallback = BaseBusinessFeignHystrix.class)
public interface BaseBusinessFeignApi {
	// 新增订单接口 
	@PostMapping(value = "/api/business/createOrder" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ServiceReturn<CreateOrderDTO>  createOrder(@RequestBody CreateOrderDTO createOrderDTO);
	// 确认订单接口（生成待结算结算单）  
	@PostMapping(value = "/api/business/confirmOrder" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ServiceReturn<CreateOrderDTO>  confirmOrder(@RequestBody ConfirmOrderDTO createOrderDTO);
	
	// 订单支付        （支付确认）
	// 生成发货单    
}
