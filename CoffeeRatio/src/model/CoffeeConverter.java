package model;

import java.math.BigDecimal;

public class CoffeeConverter {
	private int coffee;
	private float water;
	
	public CoffeeConverter() {
		super();
	}
	
	public CoffeeConverter(int coffee) {
		super();
		this.coffee = coffee;
		setRatio(coffee);
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
		setRatio(coffee);
		
	}
	public int getCoffee() {
		return coffee;
	}

	public double getWater() {
		return water;
	}

	public void setWater(float water) {
		this.water = water;
	}
	
	public void setRatio(int coffee) {
		final double goldenRatio = 17.42;
		float a = Math.round(coffee*goldenRatio);
		setWater(a);
	}
	
	@Override
	public String toString() {
		return "CoffeeConverter [coffee=" + coffee + ", water=" + water + "]";
	}

}
