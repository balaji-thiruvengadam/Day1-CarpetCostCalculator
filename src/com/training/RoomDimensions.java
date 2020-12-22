package com.training;

/**
 * @author balaji
 *
 */

public class RoomDimensions {

	private double length;
	private double width;

	// no-arg constructor to initialize the properties
	public RoomDimensions() {
		this.length = 0;
		this.width = 0;
	}

	// Overloaded Constructor
	// parameterized constructor - using setter

	public RoomDimensions(double len, double w) {
		setLength(len);
		setWidth(w);
	}

	// Copy constructor - copying the values of one object to another object.
	public RoomDimensions(RoomDimensions d) {

		setLength(d.length);
		setWidth(d.width);
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	private void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	private void setWidth(double width) {
		this.width = width;
	}

	// Method to calculate the area
	public double getArea() {
		return this.getLength() * this.getWidth();
	}

}
