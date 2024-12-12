package com.learn.mall.storage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.common.utils.PageUtils;
import com.learn.mall.storage.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author ppj
 * @email 1043719676@qq.com
 * @date 2024-12-12 10:39:43
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

