package com.example.gulimall.user.dao;

import com.example.gulimall.user.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 21:05:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
