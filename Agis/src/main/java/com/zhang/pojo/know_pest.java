package com.zhang.pojo;

public class know_pest {
	private int id;
	private String crop;
	private String growth;
	private String disease_name;
	private String disease_chara;
	private String cure_treat;

	public know_pest(int id, String crop, String growth, String disease_name,
			String disease_chara, String cure_treat) {
		super();
		this.id = id;
		this.crop = crop;
		this.growth = growth;
		this.disease_name = disease_name;
		this.disease_chara = disease_chara;
		this.cure_treat = cure_treat;
	}

	public know_pest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "know_pest [id=" + id + ", crop=" + crop + ", growth=" + growth
				+ ", disease_name=" + disease_name + ", disease_chara="
				+ disease_chara + ", cure_treat=" + cure_treat + "]";
	}

}
