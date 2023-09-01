package com.example.gulimall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.coupon.entity.SeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 *
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 21:01:16
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {

}
