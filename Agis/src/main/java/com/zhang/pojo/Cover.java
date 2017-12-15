package com.zhang.pojo;

public class Cover {
	private int id;
	private String point;
	private String nwpoint;
	private String nepoint;
	private String swpoint;
	private String sepoint;
	public Cover(String point, String nwpoint, String nepoint, String swpoint,
			String sepoint, int id) {
		super();
		this.point = point;
		this.nwpoint = nwpoint;
		this.nepoint = nepoint;
		this.swpoint = swpoint;
		this.sepoint = sepoint;
		this.id = id;
	}
	public Cover() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getNwpoint() {
		return nwpoint;
	}
	public void setNwpoint(String nwpoint) {
		this.nwpoint = nwpoint;
	}
	public String getNepoint() {
		return nepoint;
	}
	public void setNepoint(String nepoint) {
		this.nepoint = nepoint;
	}
	public String getSwpoint() {
		return swpoint;
	}
	public void setSwpoint(String swpoint) {
		this.swpoint = swpoint;
	}
	public String getSepoint() {
		return sepoint;
	}
	public void setSepoint(String sepoint) {
		this.sepoint = sepoint;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cover [point=" + point + ", nwpoint=" + nwpoint + ", nepoint="
				+ nepoint + ", swpoint=" + swpoint + ", sepoint=" + sepoint
				+ ", id=" + id + "]";
	} 

	
	
}
