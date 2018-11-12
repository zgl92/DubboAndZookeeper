package org.java.service;

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
}
