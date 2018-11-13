package org.java.service;


import com.github.pagehelper.PageInfo;
import org.java.pojo.EasybuyProduct;

/**
 * 商品服务接口
 * @author yan
 *
 */
public interface ProductService {
	/**
	 * 根据商品编号查询商品对象
	 * @param id	商品编号
	 * @return		商品对象
	 */
	EasybuyProduct getById(Integer id);

	/**
	 *
	 * @param currentPage 当前页码
	 * @param pageSize     每页显示信息
	 * @return  分页查询
	 */
	PageInfo<EasybuyProduct> getProducts(Integer currentPage,Integer pageSize);
}
