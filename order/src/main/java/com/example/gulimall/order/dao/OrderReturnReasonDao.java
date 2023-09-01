package com.example.gulimall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.gulimall.order.entity.OrderReturnReasonEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 *
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 20:57:02
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {

}
