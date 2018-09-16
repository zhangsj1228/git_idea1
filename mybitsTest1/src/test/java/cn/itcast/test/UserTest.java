package cn.itcast.test;

import cn.itcast.dao.UserDao;
import cn.itcast.dao.impl.UserDaoImpl;
import cn.itcast.domain.User;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void test(){
        UserDao dao=new UserDaoImpl();
        List<User> list = dao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
