package stages;

import entities.Entity;
import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StagePanel {

    ArrayList<Rectangle> hitBoxes;
    PImage background;

    public StagePanel(PImage background, Rectangle... hitBoxes)  {
        this.background = background;
        this.hitBoxes = new ArrayList<>();
        this.hitBoxes.addAll(Arrays.asList(hitBoxes));
    }

    public ArrayList<Rectangle> getHitBoxes() {
        return hitBoxes;
    }

    public void draw(PApplet p) {
        p.image(background, (p.displayWidth/2F)-(background.pixelWidth/2F), (p.displayHeight/2F)-(background.pixelHeight/2F));
    }
}