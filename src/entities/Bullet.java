package entities;

/**
 * Abstract class for a bullet entity.
 */
public abstract class Bullet extends Entity{
	private float _xMove;
	private float _yMove;
	
	public Bullet(float x, float y, float xMove, float yMove, float width, float height){
		
		super(x, y, width, height);

		_xMove = xMove;
		_yMove = yMove;
		this.width = width;
		this.height = height;
	}
	
	public float getxMove(){
		return _xMove;
	}
	   
	public float getyMove(){
		return _yMove;
	}
}
