package entities;

import processing.core.PApplet;
import sprites.Sprite;

import java.awt.*;

public abstract class Entity {

    protected int x, y, hp;
    protected Rectangle hitBox;
    protected float xVelocity, yVelocity;
    protected Sprite sprite;

    public Entity(Rectangle hitBox, Sprite sprite, int x, int y, int hp) {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.hitBox = hitBox;
        this.sprite = sprite;
        this.xVelocity = 0.0F;
        this.yVelocity = 0.0F;
    }

    public abstract void tick();
    public abstract void kill();
    public abstract void render(PApplet p);

    public void moveX(float xAcceleration) {
        xVelocity += xAcceleration;
    }

    public void moveY(float yAcceleration)  {
        yVelocity -= yAcceleration;
    }

    public Point getPosition()  {
        return new Point((int) (this.x+hitBox.getWidth()), (int) (this.y+hitBox.getHeight()));
    }

    public Point getPositionRaw()   {
        return new Point(this.x, this.y);
    }

    public Rectangle getHitBox() {
        return hitBox;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public int getHp() {
        return hp;
    }
}
