package character.domain.Hero;

import character.domain.Hero.Race.Race;

import java.util.UUID;

public class Hero {
    UUID uuid;
    Name name;
    Health health;
    Race race;
    MagicPoints magicPoints;

    public Hero(
            String name,
            int health,
            int magicPoints
    ) {
        this.name = new Name(name);
        this.health = new Health(health);
        this.magicPoints = new MagicPoints(magicPoints);
    }

    public void heal(int healingPoints) {
        health.heal(healingPoints);
    }

    public void takeDamage(int damage) {
        health.takeDamage(damage);
    }

    public boolean isDead() {
        return health.getCurrent() == 0;
    }

    public void levelUp() {
        // TODO: Increase character stats and new spells or something later
    }

    public String getName() {
        return name.getValue();
    }

    public int getCurrentHealth() {
        return health.getCurrent();
    }

    public int getMaxHealth() {
        return health.getMax();
    }
}
