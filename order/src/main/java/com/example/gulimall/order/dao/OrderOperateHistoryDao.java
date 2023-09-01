package com.example.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.order.entity.OrderOperateHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 *
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 20:57:02
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {

}
