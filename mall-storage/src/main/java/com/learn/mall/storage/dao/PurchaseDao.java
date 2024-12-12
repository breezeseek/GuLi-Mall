package com.learn.mall.storage.dao;

import com.learn.mall.storage.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author ppj
 * @email 1043719676@qq.com
 * @date 2024-12-12 10:39:43
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
