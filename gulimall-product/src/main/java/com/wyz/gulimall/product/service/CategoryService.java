package com.wyz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wyz.common.utils.PageUtils;
import com.wyz.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * ??Ʒ???????
 *
 * @author wu-yuezhou
 * @email wyz18405583620@gmail.com
 * @date 2022-09-23 20:46:07
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

