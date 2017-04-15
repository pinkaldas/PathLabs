/**
 * 
 */
package com.example.pathlabs.navigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author WINDOWS
 *
 */
@ManagedBean
@ViewScoped
public class NavigationController {
	
	public String moveToHome(){
		return "home";
	}
	
	public String moveToContact(){
		return "contacts";
	}
	
	public String moveToAbout(){
		return "about";
	}

}
