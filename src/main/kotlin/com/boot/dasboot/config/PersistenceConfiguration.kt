//package com.boot.dasboot.config
//
//import org.springframework.boot.autoconfigure.flyway.FlywayDataSource
//import org.springframework.boot.jdbc.DataSourceBuilder
//import org.springframework.boot.context.properties.ConfigurationProperties
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.context.annotation.Primary
//import javax.sql.DataSource
//
//@Configuration
//class PersistenceConfiguration{
//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    @Primary
//    fun dataSource(): DataSource =
//        DataSourceBuilder.create().build()
//
//    @Bean
//    @ConfigurationProperties("datasource.flyway")
//    @FlywayDataSource
//    fun flywayDataSource(): DataSource =
//      DataSourceBuilder.create().build()
//
//}
