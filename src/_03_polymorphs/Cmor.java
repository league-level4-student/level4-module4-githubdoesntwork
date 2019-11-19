package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Cmor extends Polymorph{

	Cmor(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(getX(), getY(), getW(), getH());
	}
	public void update() {
		setX((int)Math.cos(getX())*10);
		setY((int)Math.sin(getY())*10);
	}
	
}
