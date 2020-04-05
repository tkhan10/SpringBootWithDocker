/**
 * 
 */
package com.tofek.service;

import org.springframework.stereotype.Service;

/**
 * @author tofekkhan
 *
 */


@Service
public class HelloWorldService {
	
	public void getTodoList() {
		System.out.println("Inside the service method");
	}

}
