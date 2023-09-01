package com.example.gulimall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author yangqinglin
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 09:43:20
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
