package org.java.service.impl;


import org.java.mapper.EasybuyProductCategoryMapper;
import org.java.pojo.EasybuyProductCategory;
import org.java.pojo.EasybuyProductCategoryExample;
import org.java.pojo.EasybuyProductExample;
import org.java.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 商品上架
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private EasybuyProductCategoryMapper easybuyProductCategoryMapper;

    @Override
    public List<EasybuyProductCategory> getByParentId(Integer parentId) {
        try {

            EasybuyProductCategoryExample example = new EasybuyProductCategoryExample();
            EasybuyProductCategoryExample.Criteria criteria = example.createCriteria();
            criteria.andParentidEqualTo(parentId);
            List<EasybuyProductCategory> list = easybuyProductCategoryMapper.selectByExample(example);
            return list;
        } catch (Exception e) {
            e.printStackTrace();

        }

        return null;
      }

}
