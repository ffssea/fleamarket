package com.example.gulimall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.member.entity.GrowthChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 *
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 21:05:18
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {

}
