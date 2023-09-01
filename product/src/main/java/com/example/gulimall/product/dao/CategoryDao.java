package com.example.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author yangqinglin
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 09:43:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
