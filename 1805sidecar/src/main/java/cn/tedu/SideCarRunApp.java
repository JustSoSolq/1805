package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
@SpringBootApplication
@EnableSidecar
public class SideCarRunApp {
	public static void main(String[] args) {
		SpringApplication.run(SideCarRunApp.class, args);
	}
}
