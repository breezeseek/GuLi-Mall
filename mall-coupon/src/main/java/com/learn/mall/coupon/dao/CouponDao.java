package com.learn.mall.coupon.dao;

import com.learn.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ppj
 * @email 1043719676@qq.com
 * @date 2024-12-12 10:25:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
