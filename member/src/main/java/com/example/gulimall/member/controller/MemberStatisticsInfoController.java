package com.example.gulimall.member.controller;

import com.example.common.utils.PageUtils;
import com.example.common.utils.R;
import com.example.gulimall.member.entity.MemberStatisticsInfoEntity;
import com.example.gulimall.member.service.MemberStatisticsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员统计信息
 *
 * @author yql
 * @email bugduckyy@gmail.com
 * @date 2023-07-11 21:05:18
 */
@RestController
@RequestMapping("member/memberstatisticsinfo")
public class MemberStatisticsInfoController {
    @Autowired
    private MemberStatisticsInfoService memberStatisticsInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("user:memberstatisticsinfo:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberStatisticsInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("user:memberstatisticsinfo:info")
    public R info(@PathVariable("id") Long id) {
        MemberStatisticsInfoEntity memberStatisticsInfo = memberStatisticsInfoService.getById(id);

        return R.ok().put("memberStatisticsInfo", memberStatisticsInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("user:memberstatisticsinfo:save")
    public R save(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo) {
        memberStatisticsInfoService.save(memberStatisticsInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("user:memberstatisticsinfo:update")
    public R update(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo) {
        memberStatisticsInfoService.updateById(memberStatisticsInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("user:memberstatisticsinfo:delete")
    public R delete(@RequestBody Long[] ids) {
        memberStatisticsInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
