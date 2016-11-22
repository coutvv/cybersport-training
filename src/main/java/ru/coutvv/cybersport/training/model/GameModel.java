package ru.coutvv.cybersport.training.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameModel {

	List<Circle> circles = new ArrayList<>();
	
	private final double X_MAX;
	private final double Y_MAX;
	private final long idTexture;
	private final Random r = new Random();
	
	public GameModel(double xMax, double yMax, long idTexture) {
		X_MAX = xMax;
		Y_MAX = yMax;
		this.idTexture = idTexture; 
	}
	
	public void createCircles(int count) {
		for(int i = 0; i < count; i++) {
			circles.add(createRandomOne());
		}
	}
	
	public void removeOne(Circle circle) {
		circles.remove(circle);
	}
	
	private Circle createRandomOne() {
		double x = X_MAX * r.nextDouble();
		double y = Y_MAX * r.nextDouble();
		Circle result = new Circle(x,y,idTexture);
		return result;
	}
	
}
