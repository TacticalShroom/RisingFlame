package stages;

import entities.Entity;
import entities.Player;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Arrays;

public class Stage {

    ArrayList<StagePanel> panels;
    StagePanel activePanel;
    Player player;

    public Stage(Player player, StagePanel... panels)  {
        this.panels = new ArrayList<>();
        this.panels.addAll(Arrays.asList(panels));
        this.activePanel = this.panels.get(0);
        this.player = player;
    }

    public void tick()  {

    }

    public void draw(PApplet p)  {
        activePanel.draw(p);
    }
}
