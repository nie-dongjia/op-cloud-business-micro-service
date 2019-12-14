package com.djn.cn.op.cloud.business.micro.service.base.api.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.djn.cn.op.cloud.business.micro.service.base.api.BaseBusinessFeignApi;
import com.djn.cn.op.cloud.business.micro.service.base.model.dto.ConfirmOrderDTO;
import com.djn.cn.op.cloud.business.micro.service.base.model.dto.CreateOrderDTO;
import com.djn.cn.op.common.service.model.ServiceReturn;

@Component
public class BaseBusinessFeignHystrix implements BaseBusinessFeignApi{
	private static final Logger logger = LoggerFactory.getLogger(BaseBusinessFeignHystrix.class);

	@Override
	public ServiceReturn<CreateOrderDTO> createOrder(CreateOrderDTO createOrderDTO) {
		logger.warn("business[]createOrder[]createOrderDTO=[{}] micro service fail ",createOrderDTO);
		return null;
	}

	@Override
	public ServiceReturn<CreateOrderDTO> confirmOrder(ConfirmOrderDTO createOrderDTO) {
		// TODO Auto-generated method stub
		return null;
	}
}
