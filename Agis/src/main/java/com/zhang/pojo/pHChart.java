package com.zhang.pojo;

public class pHChart {
	private String point;
	private String zone;
	private float pH;
	private String G_time;
	private String farm_name;
	public pHChart(String point, String zone, float pH, String g_time,
			String farm_name) {
		super();
		this.point = point;
		this.zone = zone;
		this.pH = pH;
		G_time = g_time;
		this.farm_name = farm_name;
	}
	public pHChart() {
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
	public float getpH() {
		return pH;
	}
	public void setpH(float pH) {
		this.pH = pH;
	}
	public String getG_time() {
		return G_time;
	}
	public void setG_time(String g_time) {
		G_time = g_time;
	}
	public String getFarm_name() {
		return farm_name;
	}
	public void setFarm_name(String farm_name) {
		this.farm_name = farm_name;
	}
	@Override
	public String toString() {
		return "pHChart [point=" + point + ", zone=" + zone + ", pH=" + pH
				+ ", G_time=" + G_time + ", farm_name=" + farm_name + "]";
	}
	
}
