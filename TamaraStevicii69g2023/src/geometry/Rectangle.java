package geometry;

public class Rectangle {

	private Point upperLeft;
	private int width;
	private int height;
	private boolean selected;
	
	public Rectangle () {
		
	}
	
	public Rectangle (Point upperLeft, int width, int height) {
		this.upperLeft= upperLeft;
		this.width=width;
		this.height=height;
		
	}
	public Rectangle (Point upperLeft, int width, boolean selected) {
		this(upperLeft, width, height);
		this.selected=selected;
	}
	
	public Point getUpperLeft () {
		return upperLeft;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft=upperLeft;
	}
	public void setWidth(int width) {
		this.width= width;
	}
	public void setSelected(boolean selected) {
		this.selected= selected;
	}
	public int area(int width,int height) {
		int P;
		P= width * height;
		return P;
	}
	public int circumference (int widh, int height) {
		int o;
		o= 2* width +2* height;
		return o;
	}
}
