package entities;

public abstract class HitBox {

	public float x;
	public float y;
	public float width;
	public float height;
	
	public HitBox() {
	}
	
	public HitBox(float x, float y, float width, float height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		System.out.println(this.x);
		System.out.println(this.y);
		System.out.println(this.width);
		System.out.println(this.height);
	}
	
	public float getEndX() {
		return (x + width);
	}
	
	public float getEndY() {
		return (y + height);
	}
	
	public float getHalfWidth() {
		return (width / 2);
	}
	
	public float getHalfHeight() {
		return (height / 2);
	}
	
	public float getCenterX() {
		return (x + getHalfWidth());
	}
	
	public float getCenterY() {
		return (y + getHalfHeight());
	}
	
	public boolean hitTest(HitBox b) {
		return (b.getEndX() >= x && b.getEndY() >= y && getEndX() >= b.x && getEndY() >= b.y);
	}
}
