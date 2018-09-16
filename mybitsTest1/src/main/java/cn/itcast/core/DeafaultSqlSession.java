package cn.itcast.core;

import cn.itcast.domain.Configuration;
import cn.itcast.domain.Mapper;
import cn.itcast.utils.Executor;

import java.util.List;
import java.util.Map;

public class DeafaultSqlSession implements SqlSession {
    private Configuration cfg;
    private Executor executor;
    public DeafaultSqlSession(Configuration cfg) {
        this.cfg=cfg;
        executor=new Executor(cfg);
    }

    public <T> List<T> selectList(String mapperid) {
        Map<String, Mapper> map = cfg.getMappers();
        Mapper mapper = map.get(mapperid);
        String querySql=mapper.getQuerySql();
        String resultType=mapper.getResultType();
        System.out.println("sdsdsdsdsdsdsd1");
        System.out.println("22222222");
        try {
            return executor.executeQuery(querySql,resultType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
