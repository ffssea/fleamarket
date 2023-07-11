package com.example.gulimall.ware.dao;

import com.example.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 20:47:38
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
