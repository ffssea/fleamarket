package com.example.gulimall.product.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.utils.PageUtils;
import com.example.common.utils.Query;

import com.example.gulimall.product.dao.CategoryDao;
import com.example.gulimall.product.entity.CategoryEntity;
import com.example.gulimall.product.service.CategoryService;

@Slf4j
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        List<CategoryEntity> menuLevel1 = categoryEntities.stream().filter(item -> item.getCatLevel() == 1).map(menu->{
            menu.setChildren(getChildren(menu, categoryEntities));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() ==null ? 0:menu1.getSort())- (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

        return menuLevel1;
    }

    @Override
    public Long[] findCatelogPath(Long catelogId) {
        List<Long> path = findParentPath(catelogId,  new ArrayList<>());
        Collections.reverse(path);
        log.info("findCatelogPath: ",path.toString());
        return path.toArray(new Long[0]);
    }

    private List<Long> findParentPath(Long catelogId, List<Long> path) {
        path.add(catelogId);
        CategoryEntity categoryEntity = this.getById(catelogId);
        if(categoryEntity!=null && categoryEntity.getParentCid()!=0){
            findParentPath(categoryEntity.getParentCid(), path);
        }
        return path;

    }

    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all){
        return all.stream().filter(item -> {
            return item.getParentCid().equals(root.getCatId());
        }).map(item->{
            item.setChildren(getChildren(item, all));
            return item;
        }).sorted((menu1, menu2)->{
            return (menu1.getSort() ==null ? 0:menu1.getSort())- (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());

    }

}