package com.lxd.movie.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//druid数据库连接池
public class DBconn {
    private static DruidDataSource dataSource = null;

    static {
        Properties properties = new Properties();
//      加载配置文件
        try {
            properties.load(DruidDataSource.class.getClassLoader().
                    getResourceAsStream("dbconfig.properties"));
//      得到一个数据源
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConn() {
        try {
//            得到连接对象
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("服务器异常");
        }
    }
}
