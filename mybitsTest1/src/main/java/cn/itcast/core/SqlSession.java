package cn.itcast.core;

import java.util.List;

public interface SqlSession {
    public <T> List<T> selectList(String mapperid);
}
