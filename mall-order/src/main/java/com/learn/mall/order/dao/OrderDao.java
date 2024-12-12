package com.learn.mall.order.dao;

import com.learn.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ppj
 * @email 1043719676@qq.com
 * @date 2024-12-12 10:36:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
