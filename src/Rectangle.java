
import java.awt.*;

public class Rectangle extends Frame implements  GPrimitive{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int x1, y1, x2, y2;
	Color inline;
	public Rectangle(int x1,int y1,int x2,int y2,Color inline) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		this.inline=inline;
	}
	@Override
	public void drawPrimitive(Graphics g) {
		g.setColor(inline);
	     g.drawRect(x1, y1, x2, y2);
		g.fillRect(x1, y1, x2, y2);
	}
	
}
