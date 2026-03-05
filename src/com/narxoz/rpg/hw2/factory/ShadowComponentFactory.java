package com.narxoz.rpg.hw2.factory;

import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.ai.TricksterAI;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.combat.ShadowStrike;
import com.narxoz.rpg.hw2.combat.Vanish;
import com.narxoz.rpg.hw2.loot.LootTable;
import com.narxoz.rpg.hw2.loot.ShadowLootTable;

import java.util.ArrayList;
import java.util.List;

public final class ShadowComponentFactory implements EnemyComponentFactory {
    @Override public String getElement() { return "Shadow"; }

    @Override
    public List<Ability> createAbilities() {
        List<Ability> list = new ArrayList<>();
        list.add(new ShadowStrike());
        list.add(new Vanish());
        return list;
    }

    @Override public LootTable createLootTable() { return new ShadowLootTable(); }

    @Override public AIBehavior createAIBehavior() { return new TricksterAI(); }
}
