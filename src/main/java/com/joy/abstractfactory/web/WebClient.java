package com.joy.abstractfactory.web;

import com.joy.abstractfactory.domain.product.Product;
import com.joy.abstractfactory.domain.product.dao.ProductDao;
import com.joy.abstractfactory.domain.userinfo.UserInfo;
import com.joy.abstractfactory.domain.userinfo.dao.UserInfoDao;
import com.joy.abstractfactory.factory.DaoFactory;
import com.joy.abstractfactory.factory.MySqlDaoFactory;
import com.joy.abstractfactory.factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebClient {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/main/java/com/joy/abstractfactory/db.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPassword("!@#$%");
        userInfo.setUserName("이순신");

        Product product = new Product();
        product.setProductId("0011AA");
        product.setProductName("TV");

        DaoFactory daoFactory = null;

        if (dbType.equals("MYSQL")) {
            daoFactory = new MySqlDaoFactory();
        } else if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        } else {
            System.out.println("error");
        }

        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        System.out.println("===UserInfo Transaction===");
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

        ProductDao productDao = daoFactory.createProductDao();
        System.out.println("===Product Transaction===");
        productDao.insertProduct(product);
        productDao.updateProduct(product);
        productDao.deleteProduct(product);
    }
}
