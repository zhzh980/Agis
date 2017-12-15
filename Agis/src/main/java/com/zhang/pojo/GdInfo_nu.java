package com.zhang.pojo;

public class GdInfo_nu {
	private String point;
	private String crop;
	private float cP;
	private float scP;
	private float cN;
	private float scN;
	private float cK;
	private float scK;
	private String Nu_time;
	private String cP_stu;
	private String Sug_cP;
	private String cN_stu;
	private String Sug_cN;
	private String cK_stu;
	private String Sug_cK;
	public String getcP_stu() {
		return cP_stu;
	}
	public void setcP_stu(String cP_stu) {
		this.cP_stu = cP_stu;
	}
	public String getSug_cP() {
		return Sug_cP;
	}
	public void setSug_cP(String sug_cP) {
		Sug_cP = sug_cP;
	}
	public String getcN_stu() {
		return cN_stu;
	}
	public void setcN_stu(String cN_stu) {
		this.cN_stu = cN_stu;
	}
	public String getSug_cN() {
		return Sug_cN;
	}
	public void setSug_cN(String sug_cN) {
		Sug_cN = sug_cN;
	}
	public String getcK_stu() {
		return cK_stu;
	}
	public void setcK_stu(String cK_stu) {
		this.cK_stu = cK_stu;
	}
	public String getSug_cK() {
		return Sug_cK;
	}
	public void setSug_cK(String sug_cK) {
		Sug_cK = sug_cK;
	}
	public GdInfo_nu(String point, String crop, float cP, float scP, float cN,
			float scN, float cK, float scK, String nu_time) {
		super();
		this.point = point;
		this.crop = crop;
		this.cP = cP;
		this.scP = scP;
		this.cN = cN;
		this.scN = scN;
		this.cK = cK;
		this.scK = scK;
		Nu_time = nu_time;
	}
	public GdInfo_nu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
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
	public String getNu_time() {
		return Nu_time;
	}
	public void setNu_time(String nu_time) {
		Nu_time = nu_time;
	}
	@Override
	public String toString() {
		return "GdInfo_nu [point=" + point + ", crop=" + crop + ", cP=" + cP
				+ ", scP=" + scP + ", cN=" + cN + ", scN=" + scN + ", cK=" + cK
				+ ", scK=" + scK + ", Nu_time=" + Nu_time + "]";
	}
	
}
