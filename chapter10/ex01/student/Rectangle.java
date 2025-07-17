class Rectangle
{
	private double length;  // Length of this rectangle
	private double width;   // Width of this rectangle
	

	public void setLength(double len)  // Write set methods here
	{
		length = len;
	}

    public void setWidth(double wid)
	{
		width = wid;
	}


	public double getLength()  // Write get methods here
	{
		return length;
	}

	public double getwidth()
	{
		return width;
	}
	
	// Write the calculatePerimeter() and 
	// calculateArea() methods here	
	public double calculatePerimeter()
	{
		return (2 * (length + width));
	}

	public double calculateArea()
	{
		return(length * width);
	}
 
}