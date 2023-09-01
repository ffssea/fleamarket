package com.example.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.order.entity.RefundInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 *
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 20:57:02
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {

}
