package com.example.demo;

import org.springframework.boot.SpringApplication;
import java.util.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DebuggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebuggerApplication.class, args);
		HashMap<Integer,String> hm=new HashMap<>();
		for(int i=1;i<=50;i++) {
			hm.put(i, "done");
		}
		for(int i=51;i<=100;i++) {
			hm.put(i, "donetwice");
		}
		System.out.println(hm.entrySet());
	}

}
