import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

public class MyWind2 extends Frame {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	int x1, y1, x2, y2;
	MyWind1 wind1;
	GPrimitive[] gp=new GPrimitive[100];
	public int task;
		
	public MyWind2(MyWind1 wind1) {
		this.wind1 = wind1;
		setLocationRelativeTo(wind1);
		setSize(600, 600);
		setVisible(true);
		
		
		
  addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				x1 = e.getX();
				y1 = e.getY();
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				x2 = e.getX();
				y2 = e.getY();
	
				Line lin=new Line(x1, x1, x1, x1, Color.BLUE);
				gp[task]=lin;
				Oval Ol=new Oval(x1, y1, x2, y2, Color.RED);
				gp[task]=Ol;
				Rectangle Rt=new Rectangle(x1, y1, x2, y2, Color.BLACK);
				gp[task]=Rt;
				task++;
				repaint();
			
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
        	
        });
		
		addWindowListener(new WindowAdapter() {	
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
		});
	}	
	@Override
	public void paint(Graphics g) {
		for (int i = 0; i < gp.length; i++) {
			if (gp[i] != null)
				gp[i].drawPrimitive(g);
		}
	}
}

