package com.joy.abstractfactory.factory;

import com.joy.abstractfactory.domain.product.dao.ProductDao;
import com.joy.abstractfactory.domain.product.dao.mysql.ProductMysqlDao;
import com.joy.abstractfactory.domain.userinfo.dao.UserInfoDao;
import com.joy.abstractfactory.domain.userinfo.dao.mysql.UserInfoMysqlDao;

public class MySqlDaoFactory implements DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMysqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMysqlDao();
    }
}
