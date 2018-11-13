package org.java.contorller;


import com.alibaba.dubbo.container.page.Page;
import com.github.pagehelper.PageInfo;
import org.java.common.pojo.Pager;
import org.java.pojo.EasybuyProduct;
import org.java.pojo.EasybuyProductCategory;
import org.java.service.ProductCategoryService;
import org.java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductCategoryService productCategoryService;

    /**
     * 根据商品编号获取商品对象
     *
     * @param id
     * @return
     */
    @RequestMapping("/show/{id}")
    @ResponseBody
    public EasybuyProduct show(@PathVariable("id") Integer id) {
        return productService.getById(id);
    }

    /**
     * 分页显示----商品管理
     *
     * @param mv
     * @param currentPage
     * @param pageSize
     * @return
     */
    @RequestMapping("/product/list")
    public ModelAndView list(ModelAndView mv, Integer currentPage, Integer pageSize) {
        //执行分页查询
        PageInfo<EasybuyProduct> pageInfo = productService.getProducts(currentPage, pageSize);

        mv.addObject("productlist", pageInfo.getList()); //商品列表

        Pager pager = new Pager(pageInfo.getPages(), "/product/list?1=1", pageInfo.getPageNum(), pageInfo.getTotal());

        mv.addObject("pager", pager); //分页所需要的对象
        mv.setViewName("productList");

        return mv;
    }


    /**
     *  进入到添加商品的页面
     * @return
     */
    @RequestMapping("/product/toadd")
    public String toadd(Model model) {

          //进入到添加商品的页面的时候需要查询一级分类
        List<EasybuyProductCategory> list = productCategoryService.getByParentId(0);

         //放到模型中
        model.addAttribute("productCategoryList1",list);
        model.addAttribute("menu",6);
        return "toAddProduct";
    }
}
