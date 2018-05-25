package cn.gouliao.navigation.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 类说明
 * </p>
 *
 * @author Shawn
 * @since 2018/05/25
 */
@Configuration
@MapperScan("cn.gouliao.navigation.mapper*")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}