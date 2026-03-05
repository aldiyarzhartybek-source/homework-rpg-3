package com.narxoz.rpg.hw2.enemy;

import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public final class Goblin implements Enemy {

    private final String name;
    private final String element;
    private final int damage;
    private final int defense;
    private final int speed;
    private int health;

    private final List<Ability> abilities;
    private final LootTable lootTable;
    private final AIBehavior aiBehavior;

    public Goblin(String name, String element, int health, int damage, int defense, int speed,
                  List<Ability> abilities, LootTable lootTable, AIBehavior aiBehavior) {
        this.name = name;
        this.element = element;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.abilities = new ArrayList<>(abilities);
        this.lootTable = lootTable;
        this.aiBehavior = aiBehavior;
    }

    private Goblin(Goblin other) {
        this.name = other.name;
        this.element = other.element;
        this.health = other.health;
        this.damage = other.damage;
        this.defense = other.defense;
        this.speed = other.speed;
        this.abilities = new ArrayList<>(other.abilities);
        this.lootTable = other.lootTable;
        this.aiBehavior = other.aiBehavior;
    }

    @Override public String getName() { return name; }
    @Override public String getType() { return element + " Goblin"; }
    @Override public int getHealth() { return health; }
    @Override public int getDamage() { return damage; }
    @Override public int getDefense() { return defense; }
    @Override public int getSpeed() { return speed; }
    @Override public List<Ability> getAbilities() { return new ArrayList<>(abilities); }
    @Override public LootTable getLootTable() { return lootTable; }
    @Override public AIBehavior getAIBehavior() { return aiBehavior; }

    @Override
    public void takeDamage(int damage) {
        int d = Math.max(0, damage);
        health = Math.max(0, health - d);
    }

    @Override public boolean isAlive() { return health > 0; }
    @Override public Enemy copy() { return new Goblin(this); }
}
