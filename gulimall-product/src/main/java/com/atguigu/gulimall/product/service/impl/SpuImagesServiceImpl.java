package com.atguigu.gulimall.product.service.impl;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;
import com.atguigu.gulimall.product.dao.SpuImagesDao;
import com.atguigu.common.entity.product.SpuImagesEntity;
import com.atguigu.gulimall.product.service.SpuImagesService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements SpuImagesService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuImagesEntity> page = this.page(
                new Query<SpuImagesEntity>().getPage(params),
                new QueryWrapper<SpuImagesEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 新增商品图片
     */
    @Override
    public void saveSpuImages(Long spuId, List<String> images) {
        if (!CollectionUtils.isEmpty(images)) {
            List<SpuImagesEntity> collect = images.stream().map(img -> {
                SpuImagesEntity spuImages = new SpuImagesEntity();
                spuImages.setSpuId(spuId);
                spuImages.setImgUrl(img);
                return spuImages;
            }).collect(Collectors.toList());
            this.saveBatch(collect);
        }
    }
}