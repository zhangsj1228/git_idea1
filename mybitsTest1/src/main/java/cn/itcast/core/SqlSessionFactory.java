package cn.itcast.core;

import cn.itcast.domain.Configuration;

public class SqlSessionFactory {
    private Configuration cfg;
    public SqlSessionFactory(Configuration cfg){
        this.cfg=cfg;
    }

    public SqlSession openSession(){
        return new DeafaultSqlSession(this.cfg);
    }
}
