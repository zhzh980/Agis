package com.zhang.pojo;

public class waterChart {
	private String point;
	private String zone;
	private String farm_name;
	private float water;
	private String G_time;
	public waterChart(String point, String zone, String farm_name, float water,
			String g_time) {
		super();
		this.point = point;
		this.zone = zone;
		this.farm_name = farm_name;
		this.water = water;
		G_time = g_time;
	}
	public waterChart() {
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
	public String getFarm_name() {
		return farm_name;
	}
	public void setFarm_name(String farm_name) {
		this.farm_name = farm_name;
	}
	public float getWater() {
		return water;
	}
	public void setWater(float water) {
		this.water = water;
	}
	public String getG_time() {
		return G_time;
	}
	public void setG_time(String g_time) {
		G_time = g_time;
	}
	@Override
	public String toString() {
		return "waterChart [point=" + point + ", zone=" + zone + ", farm_name="
				+ farm_name + ", water=" + water + ", G_time=" + G_time + "]";
	}
	
}
