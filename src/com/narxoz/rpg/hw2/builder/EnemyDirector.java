package com.narxoz.rpg.hw2.builder;

import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.enemy.Enemy;
import com.narxoz.rpg.hw2.factory.EnemyComponentFactory;

public final class EnemyDirector {

    public Enemy createMinion(EnemyBuilder builder, EnemyComponentFactory factory, String name) {
        builder.reset();
        builder.setName(name);
        builder.setElement(factory.getElement());
        builder.setBaseStats(90, 14, 3, 14);
        for (Ability a : factory.createAbilities()) builder.addAbility(a);
        builder.setLootTable(factory.createLootTable());
        builder.setAIBehavior(factory.createAIBehavior());
        return builder.build();
    }

    public Enemy createRaidBoss(EnemyBuilder builder, EnemyComponentFactory factory, String name) {
        builder.reset();
        builder.setName(name);
        builder.setElement(factory.getElement());
        builder.setBaseStats(280, 30, 12, 9);
        for (Ability a : factory.createAbilities()) builder.addAbility(a);
        builder.setLootTable(factory.createLootTable());
        builder.setAIBehavior(factory.createAIBehavior());
        return builder.build();
    }
}
