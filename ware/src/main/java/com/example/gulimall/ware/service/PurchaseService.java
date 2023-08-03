package com.example.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.gulimall.ware.entity.PurchaseEntity;
import com.example.gulimall.ware.vo.PurchaseDoneVo;

import java.util.Map;

/**
 * 采购信息
 *
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 20:47:38
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void done(PurchaseDoneVo doneVo);
}

