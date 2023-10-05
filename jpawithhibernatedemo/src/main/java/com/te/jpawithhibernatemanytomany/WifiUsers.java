
package com.te.jpawithhibernatemanytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class WifiUsers {

	@Id
	private int ipAddress;
	private int devices;
	private String deviceName;
	private String userName;

	@ManyToMany
	private List<WifiRouters> routers;

	public WifiUsers(int ipAddress, int devices, String deviceName, String userName, List<WifiRouters> routers) {
		super();
		this.ipAddress = ipAddress;
		this.devices = devices;
		this.deviceName = deviceName;
		this.userName = userName;
		this.routers = routers;
	}

	public WifiUsers() {
		super();
	}

	public int getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(int ipAddress) {
		this.ipAddress = ipAddress;
	}

	public int getDevices() {
		return devices;
	}

	public void setDevices(int devices) {
		this.devices = devices;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<WifiRouters> getRouters() {
		return routers;
	}

	public void setRouters(List<WifiRouters> routers) {
		this.routers = routers;
	}

}
