import java.util.ArrayList;


public class GameState
{	
	private ArrayList<Screen> screens;
	private int width, height, index;

	public GameState(int width, int height) {
		this.width = width;
		this.height = height;
		index = 0;
		screens = new ArrayList<Screen>();
	}

	public Screen currentActiveScreen() {
		return screens.get(index);
	}
	
	public void addScreen(Screen s){
		screens.add(s);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	

}