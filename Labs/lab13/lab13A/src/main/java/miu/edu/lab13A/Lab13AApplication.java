package miu.edu.lab13A;

import miu.edu.lab13A.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Lab13AApplication implements CommandLineRunner {

	@Autowired
	private CustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Lab13AApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		customerService.addCustomer("Yohannes","yohannes.haile@outlook.com","1000 N 4th St","Fairfield","52557");
	}
}
