package mid.class_program;

/**
 * Modify the GeometricObject class to implement the Comparable interface.
 */
public abstract class GeometricObject implements Comparable<Object> {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, so, the get method name is
	 * isFilled
	 */

	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

	/**
	 * The compareTo method determines the order of this object with the
	 * specified object o, and returns a negative integer, zero, or a positive
	 * integer if this object is less than, equal to, or greater than the
	 * specified object o.
	 */
	public int compareTo(Object o) {
		if (getArea() > ((GeometricObject) o).getArea())
			return 1;
		else if (getArea() < ((GeometricObject) o).getArea())
			return -1;
		else
			return 0;
	}

	/**
	 * Define a static max method in the GeometricObject class for finding the
	 * larger of two GeometricObject objects
	 */
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		return (o1.compareTo(o2) > 0) ? o1 : o2;
	}
}
