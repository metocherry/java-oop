package com.joy.abstractfactory.domain.product.dao.mysql;

import com.joy.abstractfactory.domain.product.dao.ProductDao;
import com.joy.abstractfactory.domain.product.Product;

public class ProductMysqlDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("insert into MYSQL DB productId =" + product.getProductId());
    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("update into MYSQL DB productId =" + product.getProductId());
    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("delete into MYSQL DB productId =" + product.getProductId());
    }
}
