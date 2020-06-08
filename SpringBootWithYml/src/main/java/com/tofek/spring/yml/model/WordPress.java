/**
 * 
 */
package com.tofek.spring.yml.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author tofekkhan
 *
 */

@Component
@ConfigurationProperties("wordpress")
public class WordPress {
	
	private List<Menu> menus = new ArrayList<>();
    private Theme themes;
    private List<Server> servers = new ArrayList<>();
	/**
	 * @return the menus
	 */
	public List<Menu> getMenus() {
		return menus;
	}
	/**
	 * @param menus the menus to set
	 */
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}
	/**
	 * @return the themes
	 */
	public Theme getThemes() {
		return themes;
	}
	/**
	 * @param themes the themes to set
	 */
	public void setThemes(Theme themes) {
		this.themes = themes;
	}
	/**
	 * @return the servers
	 */
	public List<Server> getServers() {
		return servers;
	}
	/**
	 * @param servers the servers to set
	 */
	public void setServers(List<Server> servers) {
		this.servers = servers;
	}
    
    

}
