package com.rjram.videocall;

import com.rjram.videocall.user.User;
import com.rjram.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(UserService service){
		return args -> {
			service.register(User.builder()
							.username("Ram")
							.email("ram@gmail.com")
							.password("123")
					.build());

			service.register(User.builder()
							.username("San")
							.email("san@gmail.com")
							.password("456")
					.build());

			service.register(User.builder()
							.username("Hap")
							.email("hap@gmail.com")
							.password("789")
					.build());
		};
	}
}
