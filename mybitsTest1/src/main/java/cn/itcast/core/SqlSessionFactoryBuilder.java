package cn.itcast.core;

import cn.itcast.domain.Configuration;
import cn.itcast.utils.XMLConfigBuilder;


import java.io.InputStream;

/*
* 根据xml解析配置文件
*    创建configuration核心配置类
*  创建sqlSessionFactory
* */
public class SqlSessionFactoryBuilder {
   //需要参数Inputstream
    public SqlSessionFactory build(InputStream is) throws Exception {
        Configuration cfg = XMLConfigBuilder.buildConfiguration(is);

        SqlSessionFactory factory=new SqlSessionFactory(cfg);
        return factory;
    }
}
