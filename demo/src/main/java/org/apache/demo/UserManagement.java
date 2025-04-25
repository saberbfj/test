package org.apache.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class UserManagement implements CommandLineRunner {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        try {
            SpringApplication.run(UserManagement.class, args);
        } catch (Exception e) {
          System.out.println("应用程序启动失败");
            e.printStackTrace();
        }
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            System.out.println("正在测试数据库连接...");
            System.out.println("数据库连接成功！");
        } catch (Exception e) {
            System.out.println("数据库连接失败");
            e.printStackTrace();
        }
    }
} 