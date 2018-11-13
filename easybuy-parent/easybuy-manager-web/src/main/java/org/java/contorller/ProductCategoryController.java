package org.java.contorller;


import org.java.pojo.EasybuyProductCategory;
import org.java.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @RequestMapping(value = "/queryProductCategoryList",method = RequestMethod.POST)
    @ResponseBody
    public String queryProductCategoryList(Integer parentId){

        //根据父Id进行查询
        List<EasybuyProductCategory> list = productCategoryService.getByParentId(parentId);

        return null;
    }
}
