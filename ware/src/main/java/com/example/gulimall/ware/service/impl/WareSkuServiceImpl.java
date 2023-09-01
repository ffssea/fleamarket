package com.example.gulimall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.utils.PageUtils;
import com.example.common.utils.Query;
import com.example.gulimall.ware.dao.WareSkuDao;
import com.example.gulimall.ware.entity.WareSkuEntity;
import com.example.gulimall.ware.service.WareOrderTaskDetailService;
import com.example.gulimall.ware.service.WareOrderTaskService;
import com.example.gulimall.ware.service.WareSkuService;
import com.example.gulimall.ware.vo.SkuHasStockVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("wareSkuService")
public class WareSkuServiceImpl extends ServiceImpl<WareSkuDao, WareSkuEntity> implements WareSkuService {

    @Autowired
    private WareSkuDao wareSkuDao;

    // @Autowired
    // private ProductFeignService productFeignService;

    // @Autowired
    // private RabbitTemplate rabbitTemplate;

    @Autowired
    private WareOrderTaskService wareOrderTaskService;

    @Autowired
    private WareOrderTaskDetailService wareOrderTaskDetailService;

    // @Autowired
    // private OrderFeignService orderFeignService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareSkuEntity> page = this.page(
                new Query<WareSkuEntity>().getPage(params),
                new QueryWrapper<WareSkuEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<SkuHasStockVo> getSkusHasStock(List<Long> skuIds) {
        List<SkuHasStockVo> list = skuIds.stream().map(sku -> {
            SkuHasStockVo vo = new SkuHasStockVo();
            Long stock = baseMapper.getSkuStock(sku);
            vo.setHasStock(stock > 0);
            return vo;
        }).collect(Collectors.toList());

        return list;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addStock(Long skuId, Long wareId, Integer skuNum) {

        // 1、判读如果没有这个库存记录新增
        // List<WareSkuEntity> wareSkuEntities = wareSkuDao.selectList(
        //         new QueryWrapper<WareSkuEntity>().eq("sku_id", skuId).eq("ware_id", wareId));
        //
        // if (wareSkuEntities == null || wareSkuEntities.size() == 0) {
        //     WareSkuEntity wareSkuEntity = new WareSkuEntity();
        //     wareSkuEntity.setSkuId(skuId);
        //     wareSkuEntity.setStock(skuNum);
        //     wareSkuEntity.setWareId(wareId);
        //     wareSkuEntity.setStockLocked(0);
        //     //TODO 远程查询sku的名字，如果失败整个事务无需回滚
        //     //1、自己catch异常
        //     try{
        //         R info = productFeignService.info(skuId);
        //         Map<String,Object> data = (Map<String, Object>) info.get("skuInfo");
        //         if (info.getCode() == 0) {
        //             wareSkuEntity.setSkuName((String) data.get("skuName"));
        //         }
        //     } catch (Exception e) {
        //
        //     }
        //     //添加库存信息
        //     wareSkuDao.insert(wareSkuEntity);
        // } else {
        //     //修改库存信息
        //     wareSkuDao.addStock(skuId,wareId,skuNum);
        // }

    }

}