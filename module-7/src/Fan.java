/* Daniel Preller, 5 February 2026, Assignment 7
Class for representing the speed, status, radius, and color of a fan (copied from assignment 6) */

public class Fan {
	//Speed constants
	private final int STOPPED = 0;
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	
	//Fan properties
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	public Fan(int speed, boolean on, double radius, String color) {//Constructor for custom values
		//Sets speed to STOPPED if outside of allowed range
		try {
			this.setSpeed(speed);
		}
		catch (Exception e) {
			this.speed = STOPPED;
		}
		
		//Sets values according to arguments
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
	public Fan() {//Default constructor
		this(0, false, 6, "white");
	}
	
	//Set and get methods
	public void setSpeed(int newSpeed) {
		if (newSpeed >= STOPPED && newSpeed <= FAST) {
			speed = newSpeed;
		}
		else {//Throws error if speed is outside of allowed range
			throw new IllegalArgumentException("ERROR - Speed must be between " + STOPPED + " and " + FAST);
		}
	}
	public void setOn(boolean newOn) {
		on = newOn;
	}
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public int getSpeed() {
		return speed;
	}
	public boolean getOn() {
		return on;
	}
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	
	//toString method
	public String toString() {
		String outputString = "Speed: " + speed + "\nOn: " + on + "\nRadius: " + radius + "\nColor: " + color;
		return outputString;
	}
}