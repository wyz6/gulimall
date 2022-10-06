package com.atguigu.gulimall.ware.service;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.vo.ware.MergeVO;
import com.atguigu.common.vo.ware.PurchaseDoneVO;
import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author wanzenghui
 * @email lemon_wan@aliyun.com
 * @date 2021-09-02 22:59:35
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询未领取的采购单
     */
    PageUtils queryPageUnreceive(Map<String, Object> params);

    /**
     * 合并采购需求至采购单
     */
    void mergePurchase(MergeVO mergeVo);

    /**
     * 领取采购单
     */
    void received(List<Long> ids);

    /**
     * 完成采购，入库
     */
    void done(PurchaseDoneVO doneVo);
}

