package cn.gouliao.navigation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author Shawn
 * @date 2018/04/04
 */
// 添加扫描数据
@ComponentScan(basePackages = {"cn.gouliao.navigation"})
@SpringBootApplication(exclude = MongoAutoConfiguration.class)

public class NavigationApplication {

    public static void main(String[] args) {

        SpringApplication.run(NavigationApplication.class, args);

    }
}
