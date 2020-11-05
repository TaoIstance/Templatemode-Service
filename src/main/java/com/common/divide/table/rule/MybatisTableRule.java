package com.common.divide.table.rule;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Weird.He
 * @version 1.0
 * @program: TemplatemodeService
 * @create 2020-10-28 10:42
 * @description 基于Mybatis分表
 **/
@Component
@Intercepts({
        @Signature(type= StatementHandler.class,method="parameterize",args= Statement.class)
//        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class})
//        @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class })
//        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
})
@Slf4j
public class MybatisTableRule implements DivideTableRule{
    private static int MAPPED_STATEMENT_INDEX = 0;
    private static int PARAMETER_INDEX = 1;
    private static int ROWBOUNDS_INDEX = 2;
    private static int RESULT_HANDLER_INDEX = 3;
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        log.info("执行拦截逻辑");
        //获取代理对象
        Object target = invocation.getTarget();
        //获取元数据
        MetaObject metaObject = SystemMetaObject.forObject(target);
        //获取参数

        final Object[] queryArgs = invocation.getArgs();
        final PreparedStatement  mappedStatement = (PreparedStatement) queryArgs[MAPPED_STATEMENT_INDEX];
        final Object parameter = queryArgs[PARAMETER_INDEX];
//        final BoundSql boundSql = mappedStatement.getBoundSql(parameter);
        //测试rebase
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object o) {
        log.info("MyFirstPlugin的plugin方法执行，包装的对象（目标对象）："+o);
        return Plugin.wrap(o, this);
    }

    @Override
    public void setProperties(Properties properties) {
        log.info("mybatis 插件初始化配置"+properties);
    }
}
