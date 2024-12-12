package com.learn.mall.product.dao;

import com.learn.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ppj
 * @email 1043719676@qq.com
 * @date 2024-12-07 15:50:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
