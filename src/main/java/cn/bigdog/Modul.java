package cn.bigdog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author shksart
 * @date 2018/12/06 -  17:56
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class Modul {

    public static void main(String[] args) {

        SpringApplication.run(Modul.class,args);
    }

}
