package com.example.learning.hibernatefilter.inspector;

import org.hibernate.resource.jdbc.spi.StatementInspector;

public class SQLStatementInspector implements StatementInspector {

    @Override
    public String inspect(String sql) {
        if (sql.startsWith("update user_table") || sql.startsWith("delete from user_table")) {
            sql = sql + " and country = '" + "India" + "'";
        }
        return sql;
    }
}