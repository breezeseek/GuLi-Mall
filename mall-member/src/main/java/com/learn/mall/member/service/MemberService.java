package com.learn.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.common.utils.PageUtils;
import com.learn.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ppj
 * @email 1043719676@qq.com
 * @date 2024-12-12 10:32:00
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

