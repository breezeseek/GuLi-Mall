package com.learn.mall.member.dao;

import com.learn.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ppj
 * @email 1043719676@qq.com
 * @date 2024-12-12 10:32:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
