package com.wyz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyz.common.utils.PageUtils;
import com.wyz.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu????ֵ
 *
 * @author wu-yuezhou
 * @email wyz18405583620@gmail.com
 * @date 2022-09-23 20:46:07
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

