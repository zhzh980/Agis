package com.zhang.pojo;

public class GdInfo {
	private String point;
	private int id;
	private String zone;
	private float water;
	private float temp;
	private float pH;
	private String crop;
	private String g_time;
	private float swater;
	private float spH;
	private String Water_stu;
	private String Sug_water;
	private String pH_stu;
	private String Sug_pH;
	public String getWater_stu() {
		return Water_stu;
	}
	public void setWater_stu(String water_stu) {
		Water_stu = water_stu;
	}
	public String getSug_water() {
		return Sug_water;
	}
	public void setSug_water(String sug_water) {
		Sug_water = sug_water;
	}
	public String getpH_stu() {
		return pH_stu;
	}
	public void setpH_stu(String pH_stu) {
		this.pH_stu = pH_stu;
	}
	public String getSug_pH() {
		return Sug_pH;
	}
	public void setSug_pH(String sug_pH) {
		Sug_pH = sug_pH;
	}
	public GdInfo(String point, int id, float water, float temp, float pH,
			String crop, String g_time, float swater, float spH,String zone) {
		super();
		this.point = point;
		this.id = id;
		this.water = water;
		this.temp = temp;
		this.pH = pH;
		this.crop = crop;
		this.g_time = g_time;
		this.swater = swater;
		this.spH = spH;
		this.zone=zone;
	
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public GdInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getWater() {
		return water;
	}
	public void setWater(float water) {
		this.water = water;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public float getpH() {
		return pH;
	}
	public void setpH(float pH) {
		this.pH = pH;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public String getG_time() {
		return g_time;
	}
	public void setG_time(String g_time) {
		this.g_time = g_time;
	}
	public float getSwater() {
		return swater;
	}
	public void setSwater(float swater) {
		this.swater = swater;
	}
	public float getSpH() {
		return spH;
	}
	public void setSpH(float spH) {
		this.spH = spH;
	}
	@Override
	public String toString() {
		return "GdInfo [point=" + point + ", id=" + id + ", zone=" + zone
				+ ", water=" + water + ", temp=" + temp + ", pH=" + pH
				+ ", crop=" + crop + ", g_time=" + g_time + ", swater="
				+ swater + ", spH=" + spH + ", Water_stu=" + Water_stu
				+ ", Sug_water=" + Sug_water + ", pH_stu=" + pH_stu
				+ ", Sug_pH=" + Sug_pH + "]";
	}

	
	

	
}
