package com.joy.abstractfactory.factory;

import com.joy.abstractfactory.domain.userinfo.dao.UserInfoDao;
import com.joy.abstractfactory.domain.userinfo.dao.oracle.UserInfoOracleDao;
import com.joy.abstractfactory.domain.product.dao.ProductDao;
import com.joy.abstractfactory.domain.product.dao.oracle.ProductOracleDao;

public class OracleDaoFactory implements DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}
