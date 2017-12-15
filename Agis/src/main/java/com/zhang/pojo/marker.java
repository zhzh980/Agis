package com.zhang.pojo;

public class marker extends Gap{
	String point;
	String zone;

	public marker(String point) {
		super();
		this.point = point;
	}
	
	public String getFzone() {
		return zone;
	}

	public void setFzone(String fzone) {
		this.zone = fzone;
	}

	public marker(){
		super();
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "marker [point=" + point + ", fzone=" + zone + "]";
	}
	

	
}
