package com.zhang.pojo;

public class plant_situation {
	private int id;
	private String zone;
	private String crop;
	private String growth;
	private String disease_name;
	private String disease_mes;
	private String time;
	private String img1;
	private String img2;
	private String img3;
	public plant_situation(int id, String zone, String crop, String growth,
			String disease_name, String disease_mes, String time, String img1,
			String img2, String img3) {
		super();
		this.id = id;
		this.zone = zone;
		this.crop = crop;
		this.growth = growth;
		this.disease_name = disease_name;
		this.disease_mes = disease_mes;
		this.time = time;
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
	}
	public plant_situation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public String getGrowth() {
		return growth;
	}
	public void setGrowth(String growth) {
		this.growth = growth;
	}
	public String getDisease_name() {
		return disease_name;
	}
	public void setDisease_name(String disease_name) {
		this.disease_name = disease_name;
	}
	public String getDisease_mes() {
		return disease_mes;
	}
	public void setDisease_mes(String disease_mes) {
		this.disease_mes = disease_mes;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	@Override
	public String toString() {
		return "plant_situation [id=" + id + ", zone=" + zone + ", crop="
				+ crop + ", growth=" + growth + ", disease_name="
				+ disease_name + ", disease_mes=" + disease_mes + ", time="
				+ time + ", img1=" + img1 + ", img2=" + img2 + ", img3=" + img3
				+ "]";
	}

	
}
