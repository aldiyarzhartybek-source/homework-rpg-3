package com.narxoz.rpg.hw2.builder;

import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.enemy.Enemy;
import com.narxoz.rpg.hw2.loot.LootTable;

public interface EnemyBuilder {
    void reset();
    void setName(String name);
    void setElement(String element);
    void setBaseStats(int health, int damage, int defense, int speed);
    void addAbility(Ability ability);
    void setLootTable(LootTable lootTable);
    void setAIBehavior(AIBehavior aiBehavior);
    Enemy build();
}
