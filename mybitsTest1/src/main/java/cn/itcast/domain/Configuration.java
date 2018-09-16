package cn.itcast.domain;

import java.util.Map;

/**
 * 核心配置类
 *     数据库信息
 *          username，password，url，driver
 *     mapper对象的集合
 *          Map<String,Mapper>
 *                 key(mapperId): namespace.id
 */
public class Configuration {
    private String username;
    private String password;
    private String url;
    private String driver;

    //mapper对象的map集合
    private Map<String,Mapper> mappers;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Map<String, Mapper> getMappers() {
        return mappers;
    }

    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers = mappers;
    }
}
