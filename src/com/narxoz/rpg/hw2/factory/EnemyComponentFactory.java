package com.narxoz.rpg.hw2.factory;

import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.loot.LootTable;

import java.util.List;

public interface EnemyComponentFactory {
    String getElement();
    List<Ability> createAbilities();
    LootTable createLootTable();
    AIBehavior createAIBehavior();
}
