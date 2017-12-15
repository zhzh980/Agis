package com.zhang.pojo;

public class tempChart {
	private String point;
	private String zone;
	private float temp;
	private String g_time;
	public tempChart(String point, String zone, float temp, String g_time) {
		super();
		this.point = point;
		this.zone = zone;
		this.temp = temp;
		this.g_time = g_time;
	}
	public tempChart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public String getG_time() {
		return g_time;
	}
	public void setG_time(String g_time) {
		this.g_time = g_time;
	}
	@Override
	public String toString() {
		return "tempChart [point=" + point + ", zone=" + zone + ", temp="
				+ temp + ", g_time=" + g_time + "]";
	}
	
}
