package com.narxoz.rpg.hw2.enemy;

import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.loot.LootTable;

import java.util.List;

public interface Enemy {
    String getName();
    String getType();
    int getHealth();
    int getDamage();
    int getDefense();
    int getSpeed();
    List<Ability> getAbilities();
    LootTable getLootTable();
    AIBehavior getAIBehavior();
    void takeDamage(int damage);
    boolean isAlive();
    Enemy copy();
}
