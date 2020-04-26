package cn.yykjc.jiaochengdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.yykjc.jiaochengdemo.user.dao")
public class JiaochengdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiaochengdemoApplication.class, args);
    }

}
