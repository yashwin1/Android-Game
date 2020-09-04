package com.example.yashwinblaster;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import javax.xml.soap.Text;


public class MyGdxGame extends ApplicationAdapter{

	private SpriteBatch batch;

//	private BitmapFont font;
//	private int screenWidth, screenHeight;
//	private String message = "Touch";
//	private GlyphLayout layout = new GlyphLayout(font,message);

	private TextureAtlas chickenAtlas;
	private Animation animation;
	private float timePassed = 0;

//	private Texture img;		//the raw image
//	private Sprite sprite;

//	private BitmapFont font;

	@Override
	public void create () {		//For initializing anything in the game
		batch = new SpriteBatch();

//		screenWidth = Gdx.graphics.getWidth();
//		screenHeight = Gdx.graphics.getHeight();
//
//		font = new BitmapFont();
//		font.setColor(Color.GREEN);
//		font.getData().setScale(5,5);
//		Gdx.input.setInputProcessor(this);		//This is to tell that the touch methods that we are going to use are present in this class itself



		chickenAtlas = new TextureAtlas(Gdx.files.internal("runningchicken.atlas"));
		animation = new Animation(1/30f, chickenAtlas.getRegions());		//First parameter takes care of the duration(30 frames a second), and second takes care of the coordinates and stuff like that.

//		img = new Texture("bird.png");
//		sprite = new Sprite(img);		//Initialize the image as a sprite

//		font = new BitmapFont();
//		font.setColor(Color.BLUE);
//		font.getData().setScale(5, 5);

	}

	@Override
	public void render () {		//This gets called again and again about 30-80 times a second, so it can include code which needs to be run again and again
		Gdx.gl.glClearColor(1,1,1,1);		//To set a color to the canvas on which we are going to set our game.
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

//		BitmapFont.TextBounds textSize = font.getBounds(message);
//		float x = screenWidth/2 - layout.width/2;
//		float y = screenHeight/2 - layout.height/2;
//		font.draw(batch, message, x, y);

		batch.begin();

		timePassed += Gdx.graphics.getDeltaTime();
		batch.draw((Texture) animation.getKeyFrame(timePassed, true), 300,500);

//		font.draw(batch, "Supp bruh! ", 100, 400);	//0,0 is the bottom left coordinate

//		sprite.draw(batch);

		batch.end();
	}
	
	@Override
	public void dispose () {		//Gets called at the end of the life cycle. To dispose off the resources and is a necessary ,method for smooth functioning
		batch.dispose();
//		font.dispose();
		chickenAtlas.dispose();
//		img.dispose();
//		font.dispose();
	}


//	@Override
//	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
//		message = "Touch down at " + screenX + ", " + screenY;
//		return true;
//	}
//
//	@Override
//	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
//		message = "Touch up at " + screenX + ", " + screenY;
//		return true;
//	}
//
//	@Override
//	public boolean touchDragged(int screenX, int screenY, int pointer) {
////		message = "Dragging " + screenX + ", " + screenY;
//		return false;
//	}
//
//
//
//
//
//
//	@Override
//	public boolean keyDown(int keycode) {
//		return false;
//	}
//
//	@Override
//	public boolean keyUp(int keycode) {
//		return false;
//	}
//
//	@Override
//	public boolean keyTyped(char character) {
//		return false;
//	}
//
//	@Override
//	public boolean mouseMoved(int screenX, int screenY) {
//		return false;
//	}
//
//	@Override
//	public boolean scrolled(int amount) {
//		return false;
//	}
}
