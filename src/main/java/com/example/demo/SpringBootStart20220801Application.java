package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
// SpringBootApplication 啟動時，會自動注入數據源和配置 JPA，若專案尚未設定 database driver 的路徑，
// 當 SpringBootApplication 在啟動時，因抓不到 database driver，導致報錯
@SpringBootApplication 
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class SpringBootStart20220801Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStart20220801Application.class, args);
    }
}
