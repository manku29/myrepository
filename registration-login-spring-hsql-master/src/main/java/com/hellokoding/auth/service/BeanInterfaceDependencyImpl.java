/**
 * 
 */
package com.hellokoding.auth.service;

/**
 * @author RAMAVI
 *
 */

public class BeanInterfaceDependencyImpl {
  
	
	private String address;

	private String area;
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printDetails() {
		System.out.println("This is drived class................." +address +",, area"+ area);
	}
}
