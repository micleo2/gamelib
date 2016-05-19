import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.IOException;
import java.io.InputStream;

public abstract class Screen
{
	protected GameState state;
	protected int width, height;
	
	public Screen(GameState s, int w, int h) {
		state = s;
		width = w;
		height = h;
	}
	
	public static void drawCenteredString(Graphics g, String text, int x, int y){

		FontMetrics metrics = g.getFontMetrics(g.getFont());
		Rectangle2D rect = metrics.getStringBounds(text, g); 


		g.drawString(text, (int)(x - rect.getWidth()/2), (int)(y + rect.getHeight() / 2));
	}
	
	public void start(){}
	public abstract void render(Graphics g);
	public abstract void update();
	
	public abstract void keyPressed(KeyEvent e);
	public abstract void keyReleased(KeyEvent e);
	
	public abstract void mousePressed(Point2D p);
	public abstract void mouseReleased(Point2D p);
	public abstract void mouseMoved(Point2D p);
	public abstract void mouseDragged(Point2D p);
}