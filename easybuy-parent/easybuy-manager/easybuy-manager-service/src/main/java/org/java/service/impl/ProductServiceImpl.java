package org.java.service.impl;

import org.java.mapper.EasybuyProductMapper;
import org.java.pojo.EasybuyProduct;
import org.java.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
    private EasybuyProductMapper easybuyProductMapper;

	@Override
	public EasybuyProduct getById(Integer id) {

		return easybuyProductMapper.selectByPrimaryKey(id);
	}

}
