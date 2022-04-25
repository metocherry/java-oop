package com.joy.abstractfactory.factory;

import com.joy.abstractfactory.domain.product.dao.ProductDao;
import com.joy.abstractfactory.domain.userinfo.dao.UserInfoDao;

public interface DaoFactory {
    public UserInfoDao createUserInfoDao();
    public ProductDao createProductDao();
}
