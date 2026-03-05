package com.narxoz.rpg.hw2.factory;

import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.ai.DefensiveAI;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.combat.FrostBreath;
import com.narxoz.rpg.hw2.combat.IceShield;
import com.narxoz.rpg.hw2.loot.IceLootTable;
import com.narxoz.rpg.hw2.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public final class IceComponentFactory implements EnemyComponentFactory {
    @Override public String getElement() { return "Ice"; }

    @Override
    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new FrostBreath());
        list.add(new IceShield());
        return list;
    }

    @Override public LootTable createLootTable() { return new IceLootTable(); }

    @Override public AIBehavior createAIBehavior() { return new DefensiveAI(); }
}
