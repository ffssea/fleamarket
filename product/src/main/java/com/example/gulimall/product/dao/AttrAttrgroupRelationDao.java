package com.example.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.product.entity.AttrAttrgroupRelationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 *
 * @author yangqinglin
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 09:43:20
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {
    void deleteBatchRelation(@Param("entities") List<AttrAttrgroupRelationEntity> entities);
}
