package abstractFactoryPattern;

import java.io.*;
import java.util.*;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("abstractFactoryPattern/db.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("12345");
        userInfo.setPasswd("!@#$%");
        userInfo.setUserName("Tomas");
        Product product = new Product(); 
        product.setProductId("0011AA"); 
        product.setProductName("TV");
        DaoFactory daoFactory = null; 
        UserInfoDao userInfoDao = null; 
        ProductDao productDao = null;

        if (dbType.equals("ORACLE")) {
            daoFactory = new OracleDaoFactory();
        }
        else if (dbType.endsWith("MYSQL")) {
            daoFactory = new MySqlDaoFactory(); }
        else if (dbType.endsWith("MSSQL")) {
            daoFactory = new MssqlDaoFactory(); }
        else {
            System.out.println("db support error"); 
            return;
        }
        userInfoDao = daoFactory.createUserInfoDao(); 
        productDao = daoFactory.createProductDao();
        System.out.println("==USERINFO TRANSACTION=="); 
        userInfoDao.insertUserInfo(userInfo); 
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
        System.out.println("==PRODUCT TRANSACTION=="); 
        productDao.insertProduct(product); 
        productDao.updateProduct(product);
        productDao.deleteProduct(product);
    }
}