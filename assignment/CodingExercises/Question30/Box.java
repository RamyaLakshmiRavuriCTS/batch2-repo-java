package com.cts.Question30;

public class Box {
	
	private double length;
	private double width;
	private double height;

	public Box() {
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double volume() {
		return length * width * height;
	}

	@Override
	public int hashCode() {
		return Double.hashCode(volume());
	}

	@Override
	public boolean equals(Object obj) {
		Box o = (Box) obj;
		return this.volume() == o.volume();
	}

}
