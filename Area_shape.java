
// find area of circle square and rectangle
class Area_shape 
{
	public static void main(String[] args) 
	{
		int radius=5,side=6,length=4,breadth=8;
		double area_ci=3.14*radius*radius;
		int area_sq=side*side;
		int area_rec=length*breadth;
		System.out.println("Radius of circle:"+radius+"\nEach side of square:"+side+"\nlength and breadth of rectangle:"+length+" and "+breadth);
		System.out.println("Area of circle :"+area_ci+"sqm");
		System.out.println("Area of square:"+area_sq+"sqm");
		System.out.println("Area of rectangle:"+area_rec+"sqm");
		
	}
}
