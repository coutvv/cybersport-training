package ru.coutvv.cybersport.training.model;

public class Circle {

	double x,y;
	long idTexture;
	
	
	public Circle(double x, double y, long idTexture) {
		super();
		this.x = x;
		this.y = y;
		this.idTexture = idTexture;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public long getIdTexture() {
		return idTexture;
	}
	public void setIdTexture(long idTexture) {
		this.idTexture = idTexture;
	}
}
