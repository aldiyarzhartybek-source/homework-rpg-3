package com.narxoz.rpg.hw2.factory;

import com.narxoz.rpg.hw2.ai.AggressiveAI;
import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.combat.FlameBreath;
import com.narxoz.rpg.hw2.combat.FireShield;
import com.narxoz.rpg.hw2.loot.FireLootTable;
import com.narxoz.rpg.hw2.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public final class FireComponentFactory implements EnemyComponentFactory {
    @Override public String getElement() { return "Fire"; }

    @Override
    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new FlameBreath());
        list.add(new FireShield());
        return list;
    }

    @Override public LootTable createLootTable() { return new FireLootTable(); }

    @Override public AIBehavior createAIBehavior() { return new AggressiveAI(); }
}
