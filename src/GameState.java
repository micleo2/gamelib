
public class GameState
{	
	private Screen currentScreen;
	private int width, height;

	public GameState(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Screen currentActiveScreen() {
		return currentScreen;
	}
	
	public void setCurrentScreen(Screen s){
		currentScreen = s;
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
	
	

}