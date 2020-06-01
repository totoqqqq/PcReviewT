package kgw.PcReview.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages = "kgw.PcReview.web")
public class PcReviewTApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcReviewTApplication.class, args);
	}

}
