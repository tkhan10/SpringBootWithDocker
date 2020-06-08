package com.tofek.spring.yml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tofek.spring.yml.model.GlobalProperties;
import com.tofek.spring.yml.model.WordPress;

@SpringBootApplication
public class SpringBootWithYmlApplication implements CommandLineRunner{
	
	@Autowired
	private WordPress wpProperties;
	
	@Autowired
	private GlobalProperties globalProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithYmlApplication.class, args);
	}
	
	@Override
    public void run(String... args) {
        System.out.println(globalProperties.getEmail()+" "+globalProperties.getThreadPool());
        System.out.println(wpProperties.getMenus().get(0).getName());
    }

}
