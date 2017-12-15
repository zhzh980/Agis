package com.zhang.pojo;

public class kp_cure {
	private String disease_name;
	private String disease_chara;
	private String cure_treat;
	private String crop;
	private String growth;
	public kp_cure(String disease_name, String disease_chara,
			String cure_treat, String crop, String growth) {
		super();
		this.disease_name = disease_name;
		this.disease_chara = disease_chara;
		this.cure_treat = cure_treat;
		this.crop = crop;
		this.growth = growth;
	}
	public kp_cure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDisease_name() {
		return disease_name;
	}
	public void setDisease_name(String disease_name) {
		this.disease_name = disease_name;
	}
	public String getDisease_chara() {
		return disease_chara;
	}
	public void setDisease_chara(String disease_chara) {
		this.disease_chara = disease_chara;
	}
	public String getCure_treat() {
		return cure_treat;
	}
	public void setCure_treat(String cure_treat) {
		this.cure_treat = cure_treat;
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
	@Override
	public String toString() {
		return "kp_cure [disease_name=" + disease_name + ", disease_chara="
				+ disease_chara + ", cure_treat=" + cure_treat + ", crop="
				+ crop + ", growth=" + growth + "]";
	}
	
	
	
}
