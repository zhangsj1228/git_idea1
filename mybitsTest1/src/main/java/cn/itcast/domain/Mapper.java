package cn.itcast.domain;

/**
 * sql配置文件的实体类
 *      sql语句
 *      返回值类型
 */
public class Mapper {

    private String querySql; //sql语句

    //返回值类型（返回值类型的全限定类名）
    private String resultType;

    public String getQuerySql() {
        return querySql;
    }

    public void setQuerySql(String querySql) {
        this.querySql = querySql;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
