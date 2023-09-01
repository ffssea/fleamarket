package com.example.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 20:57:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
