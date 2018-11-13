package org.java.service.impl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.java.mapper.EasybuyProductMapper;
import org.java.pojo.EasybuyProduct;
import org.java.pojo.EasybuyProductExample;
import org.java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private EasybuyProductMapper easybuyProductMapper;

    /**
     * @param id 商品编号
     * @return
     */
    @Override
    public EasybuyProduct getById(Integer id) {

        return easybuyProductMapper.selectByPrimaryKey(id);
    }

    /**
     * 分页查询
     *
     * @param currentPage 当前页码
     * @param pageSize    每页显示信息
     * @return
     */
    @Override
    public PageInfo<EasybuyProduct> getProducts(Integer currentPage, Integer pageSize) {
        if (currentPage==null) {
            currentPage = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }

        //开始分页
        PageHelper.startPage(currentPage, pageSize);

        //执行查询
        EasybuyProductExample example = new EasybuyProductExample();
        List<EasybuyProduct> list = easybuyProductMapper.selectByExample(example);

        //创建pageInfo对象
		PageInfo<EasybuyProduct> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

}
