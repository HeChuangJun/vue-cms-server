package com.junye.application;

import java.beans.PropertyVetoException;
import java.io.IOException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.Transaction;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**//** 
* @author 作者 junye E-mail: 1105128664@qq.com
* @version 创建时间：2018年6月16日 
* 类说明 :
*//*
*/
@Configuration
//@Lazy
public class MybatisConfiguration {

	@Bean
	@Primary
	public ComboPooledDataSource getComboPooledDataSource() throws PropertyVetoException{
		ComboPooledDataSource cd=new ComboPooledDataSource();
		cd.setDriverClass("com.mysql.jdbc.Driver");
		cd.setJdbcUrl("jdbc:mysql://localhost:3306/vue-cms");
		cd.setUser("root");
		cd.setPassword("1105128664");
		return cd;
	}
	
	
	
	@Bean(name="sqlSessionFactory")
	public SqlSessionFactoryBean getSqlSessionFactoryBean() throws Exception{
	SqlSessionFactoryBean sf = new SqlSessionFactoryBean();
	sf.setDataSource(getComboPooledDataSource());
	sf.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
	
	sf.setTypeAliasesPackage("com.junye.mapper");
	//sf.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis-configuration.xml"));
	return sf;
	
	}
	
	/* @Bean
	    public MapperScannerConfigurer mapperScannerConfigurer() {
	    MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
	    mapperScannerConfigurer.setBasePackage("com.junye.testspringbootMybaits");
	    return mapperScannerConfigurer;
	    }*/
	

}
