package physics;

import constants.PhysicsConstants;
import entities.Entity;
import processing.core.PApplet;

import java.util.ArrayList;

public class Runner {


    ArrayList<Entity> activeEntities;

    public Runner() {
        activeEntities = new ArrayList<>();
    }

    public void tick(PApplet p)  {
        activeEntities.forEach(entity -> {
            entity.moveY(PhysicsConstants.GRAVITY);

            entity.tick();
            entity.render(p);
            if (entity.getHp()<=0)  {
                entity.kill();
            }
        });
    }

    public void checkCollision(Entity entity)   {

    }

    public void addEntity(Entity entity) {
        activeEntities.add(entity);
    }

    public void removeEntity(Entity entity)  {
        activeEntities.remove(entity);
    }
}
