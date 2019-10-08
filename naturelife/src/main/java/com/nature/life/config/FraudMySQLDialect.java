package com.nature.life.config;

import org.hibernate.dialect.MySQLDialect;

public class FraudMySQLDialect extends MySQLDialect {

    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
