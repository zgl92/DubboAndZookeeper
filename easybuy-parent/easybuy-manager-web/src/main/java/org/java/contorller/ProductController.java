package org.java.contorller;


import org.java.pojo.EasybuyProduct;
import org.java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;
    @RequestMapping("/show/{id}")
    @ResponseBody
    public EasybuyProduct show(@PathVariable("id") Integer id){
        String s="zglaaacccccccc";
        return productService.getById(id);
    }
}
