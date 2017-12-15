package com.zhang.pojo;

public class cNChart {
	private String point;
	private float cN;
	private String zone;
	private String Nu_time;
	private String farm_name;
	public cNChart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public cNChart(String point, float cN, String zone, String nu_time,
			String farm_name) {
		super();
		this.point = point;
		this.cN = cN;
		this.zone = zone;
		Nu_time = nu_time;
		this.farm_name = farm_name;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public float getcN() {
		return cN;
	}
	public void setcN(float cN) {
		this.cN = cN;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getNu_time() {
		return Nu_time;
	}
	public void setNu_time(String nu_time) {
		Nu_time = nu_time;
	}
	public String getFarm_name() {
		return farm_name;
	}
	public void setFarm_name(String farm_name) {
		this.farm_name = farm_name;
	}
	@Override
	public String toString() {
		return "cNChart [point=" + point + ", cN=" + cN + ", zone=" + zone
				+ ", Nu_time=" + Nu_time + ", farm_name=" + farm_name + "]";
	}
	
	
}
