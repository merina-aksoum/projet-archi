package character;

import character.name.Name;
import character.statistics.ExperiencePoints;
import character.statistics.Health;
import character.statistics.MagicPoints;
import character.statistics.abilityScores.AbilityScore;
import character.statistics.Level;

import java.util.HashMap;

public class Character {
    // Infos about the character
    private Name name;
    private Health health;
    private MagicPoints magicPoints;
    private ExperiencePoints exp;
    private Level level;
    // Class
    // Race/Species

    private HashMap<String, AbilityScore> abilityScores = new HashMap<String, AbilityScore>();

    /**
     * Aptitudes/Abilities
     * Strength (STR)
     * Dexterity (DEX)
     * Constitution (CON)
     * Intelligence (INT)
     * Wisdom (WIS)
     * Charisma (CHA)
     */
    // Armor Class (AC)
    // Inventory
    public Character(
            String name,
            int health,
            int magicPoints
    ) {
        this.name = new Name(name);
        this.health = new Health(health);
        this.magicPoints = new MagicPoints(magicPoints);
        this.level = new Level(1);
    }

    public void heal(int healingPoints) {
        health.heal(healingPoints);
    }

    public void takeDamage(int damage) {
        health.takeDamage(damage);
    }

    public boolean isDead() {
        return health.getValue() == 0;
    }

    public void levelUp() {
        // TODO: Increase character stats and new spells or something later
    }

    public String getName() {
        return name.getValue();
    }

    public int getCurrentHealth() {
        return health.getValue();
    }

    public int getMaxHealth() {
        return health.getMax();
    }
}