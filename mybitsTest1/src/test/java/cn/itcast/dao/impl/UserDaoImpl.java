package cn.itcast.dao.impl;

import cn.itcast.core.SqlSession;
import cn.itcast.core.SqlSessionFactory;
import cn.itcast.core.SqlSessionFactoryBuilder;
import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {

    public List<User> findAll() {
        InputStream is= UserDaoImpl.class.getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        SqlSessionFactory factory=null;
        try {
            factory=builder.build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SqlSession session=factory.openSession();
        List<User> list=session.selectList("cn.itcast.dao.UserDao.findAll");
        return list;
    }
}
