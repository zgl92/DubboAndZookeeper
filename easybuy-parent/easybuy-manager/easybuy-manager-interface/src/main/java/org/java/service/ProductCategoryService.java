package org.java.service;

import org.java.pojo.EasybuyProductCategory;

import java.util.List;

/**
 * 商品上架
 */
public interface ProductCategoryService {

    /**
     *  根据父Id进行查询
     * @param parentId  父id
     * @return  分类列表
     */
     List<EasybuyProductCategory> getByParentId(Integer parentId);


}
