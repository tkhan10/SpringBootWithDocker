/**
 * 
 */
package com.tofek.spring.yml.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tofekkhan
 *
 */

@Component
@ConfigurationProperties
public class GlobalProperties {
	
	//thread-pool , relax binding
    private int threadPool;
    private String email;
    
	/**
	 * @return the threadPool
	 */
	public int getThreadPool() {
		return threadPool;
	}
	/**
	 * @param threadPool the threadPool to set
	 */
	public void setThreadPool(int threadPool) {
		this.threadPool = threadPool;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
