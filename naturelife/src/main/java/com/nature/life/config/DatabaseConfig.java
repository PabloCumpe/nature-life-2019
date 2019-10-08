package com.nature.life.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.nature.life.repository",
        entityManagerFactoryRef = "mainEntityManagerFactory",
        transactionManagerRef = "mainTransactionManager")
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfig {

    @Primary
    @Bean(name = "mainEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean mainEntityManagerFactory(final EntityManagerFactoryBuilder builder,
            final @Qualifier("main-datasource") DataSource dataSource, JpaProperties jpaProperties) {
        return builder.dataSource(dataSource).packages("com.nature.life").persistenceUnit("mainDb").properties(jpaProperties.getProperties()).build();
    }

    @Primary
    @Bean(name = "mainTransactionManager")
    public PlatformTransactionManager mainTransactionManager(@Qualifier("mainEntityManagerFactory") EntityManagerFactory mainEntityManagerFactory) {
        return new JpaTransactionManager(mainEntityManagerFactory);
    }

    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSourceProperties mainDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "main-datasource")
    public DataSource mainDataSource() {
        return mainDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean
    public PhysicalNamingStrategyImpl physical() {
        return new PhysicalNamingStrategyImpl();
    }

}
