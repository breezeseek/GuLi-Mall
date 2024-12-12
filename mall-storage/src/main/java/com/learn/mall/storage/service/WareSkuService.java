package com.learn.mall.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.common.utils.PageUtils;
import com.learn.mall.storage.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author ppj
 * @email 1043719676@qq.com
 * @date 2024-12-12 10:39:43
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

