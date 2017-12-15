package com.zhang.pojo;

public class Gap {
	private String point;
	private int id;
	private float cK;
	private float scK;
	private float cN;
	private float scN;
	private float cP;
	private float scP;
	private float pH;
	private float spH;
	private float water;
	private float swater;
	private String water_stu;
	private String cK_stu;
	private String cN_stu;
	private String cP_stu;
	private String pH_stu;
	public String getpH_stu() {
		return pH_stu;
	}
	public void setpH_stu(String pH_stu) {
		this.pH_stu = pH_stu;
	}
	public Gap(String point, int id, float cK, float scK, float cN, float scN,
			float cP, float scP, float pH, float spH, float water, float swater) {
		super();
		this.point = point;
		this.id = id;
		this.cK = cK;
		this.scK = scK;
		this.cN = cN;
		this.scN = scN;
		this.cP = cP;
		this.scP = scP;
		this.pH = pH;
		this.spH = spH;
		this.water = water;
		this.swater = swater;
	}
	public Gap() {
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
	public float getcK() {
		return cK;
	}
	public void setcK(float cK) {
		this.cK = cK;
	}
	public float getScK() {
		return scK;
	}
	public void setScK(float scK) {
		this.scK = scK;
	}
	public float getcN() {
		return cN;
	}
	public void setcN(float cN) {
		this.cN = cN;
	}
	public float getScN() {
		return scN;
	}
	public void setScN(float scN) {
		this.scN = scN;
	}
	public float getcP() {
		return cP;
	}
	public void setcP(float cP) {
		this.cP = cP;
	}
	public float getScP() {
		return scP;
	}
	public void setScP(float scP) {
		this.scP = scP;
	}
	public float getpH() {
		return pH;
	}
	public void setpH(float pH) {
		this.pH = pH;
	}
	public float getSpH() {
		return spH;
	}
	public void setSpH(float spH) {
		this.spH = spH;
	}
	public float getWater() {
		return water;
	}
	public void setWater(float water) {
		this.water = water;
	}
	public float getSwater() {
		return swater;
	}
	public void setSwater(float swater) {
		this.swater = swater;
	}
	public String getWater_stu() {
		return water_stu;
	}
	public void setWater_stu(String water_stu) {
		this.water_stu = water_stu;
	}
	public String getcK_stu() {
		return cK_stu;
	}
	public void setcK_stu(String cK_stu) {
		this.cK_stu = cK_stu;
	}
	public String getcN_stu() {
		return cN_stu;
	}
	public void setcN_stu(String cN_stu) {
		this.cN_stu = cN_stu;
	}
	public String getcP_stu() {
		return cP_stu;
	}
	public void setcP_stu(String cP_stu) {
		this.cP_stu = cP_stu;
	}
	@Override
	public String toString() {
		return "Gap [point=" + point + ", id=" + id + ", cK=" + cK + ", scK="
				+ scK + ", cN=" + cN + ", scN=" + scN + ", cP=" + cP + ", scP="
				+ scP + ", pH=" + pH + ", spH=" + spH + ", water=" + water
				+ ", swater=" + swater + ", water_stu=" + water_stu
				+ ", cK_stu=" + cK_stu + ", cN_stu=" + cN_stu + ", cP_stu="
				+ cP_stu + "]";
	}




}
