package gesture;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
public class MouseMotion extends JPanel implements MouseMotionListener,MouseListener {

	
	private static final long serialVersionUID = 1L;
	protected static int rootX,rootY,nextX,nextY;
	protected static ArrayList<Point> coordinate; 
	MouseMotion(){
		setSize(600,600);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
    protected void paintComponent(Graphics g)
    {
        g.drawLine(rootX,rootY,nextX,nextY);
        rootX=nextX;
        rootY=nextY;
    }
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		g.drawLine(rootX,rootY,e.getX(),e.getY());
		coordinate.add(e.getPoint());
		nextX=e.getX();
		nextY=e.getY();
		repaint();
	}
	@Override
	public void mouseMoved(MouseEvent e) {	
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		Detect.isGesture = true;
		coordinate = new ArrayList<Point>();
		setOpaque(true);
		rootX=e.getX();
		rootY=e.getY();
		Detect.rootX=e.getX();
		Detect.rootY=e.getY();
		coordinate.add(e.getPoint());
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		setOpaque(false);
		try {
			new Detect();
		} catch (IOException e) {
			System.out.println(e);
		}
		repaint();		
	}
}