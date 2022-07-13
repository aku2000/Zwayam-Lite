package com.zwayamLite.ZwayamLite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"com.zwayamLite.ZwayamLite.request"})
@EntityScan("com.zwayamLite.ZwayamLite.domain")
@EnableJpaRepositories("com.zwayamLite.ZwayamLite.repository")
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ZwayamLiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZwayamLiteApplication.class, args);
	}

}
