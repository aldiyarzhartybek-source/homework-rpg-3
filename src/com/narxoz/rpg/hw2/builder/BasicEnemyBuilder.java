package com.narxoz.rpg.hw2.builder;

import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.ai.TricksterAI;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.enemy.Enemy;
import com.narxoz.rpg.hw2.enemy.Goblin;
import com.narxoz.rpg.hw2.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public final class BasicEnemyBuilder implements EnemyBuilder {

    private String name;
    private String element;
    private int health;
    private int damage;
    private int defense;
    private int speed;
    private final List<Ability> abilities = new ArrayList<>();
    private LootTable lootTable;
    private AIBehavior aiBehavior;

    public BasicEnemyBuilder() {
        reset();
    }

    @Override
    public void reset() {
        name = "Goblin";
        element = "Neutral";
        health = 90;
        damage = 14;
        defense = 3;
        speed = 14;
        abilities.clear();
        lootTable = null;
        aiBehavior = new TricksterAI();
    }

    @Override public void setName(String name) { this.name = name; }
    @Override public void setElement(String element) { this.element = element; }

    @Override
    public void setBaseStats(int health, int damage, int defense, int speed) {
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
    }

    @Override
    public void addAbility(Ability ability) {
        if (ability != null) abilities.add(ability);
    }

    @Override public void setLootTable(LootTable lootTable) { this.lootTable = lootTable; }

    @Override
    public void setAIBehavior(AIBehavior aiBehavior) {
        if (aiBehavior != null) this.aiBehavior = aiBehavior;
    }

    @Override
    public Enemy build() {
        return new Goblin(name, element, health, damage, defense, speed, abilities, lootTable, aiBehavior);
    }
}
