package com.narxoz.rpg.hw2;

import com.narxoz.rpg.hw2.builder.BasicEnemyBuilder;
import com.narxoz.rpg.hw2.builder.BossEnemyBuilder;
import com.narxoz.rpg.hw2.builder.EnemyDirector;
import com.narxoz.rpg.hw2.enemy.Enemy;
import com.narxoz.rpg.hw2.factory.FireComponentFactory;
import com.narxoz.rpg.hw2.factory.ShadowComponentFactory;
import com.narxoz.rpg.hw2.prototype.EnemyRegistry;

import java.util.Random;

public final class HW2Demo {

    public static void main(String[] args) {
        EnemyDirector director = new EnemyDirector();

        Enemy goblin = director.createMinion(new BasicEnemyBuilder(), new ShadowComponentFactory(), "Sneaky Goblin");
        Enemy dragon = director.createRaidBoss(new BossEnemyBuilder(), new FireComponentFactory(), "Inferno Dragon");

        EnemyRegistry registry = new EnemyRegistry();
        registry.register("goblin", goblin);
        registry.register("dragon", dragon);

        Enemy copy = registry.create("goblin");

        System.out.println(goblin.getType() + " AI=" + goblin.getAIBehavior().getName());
        System.out.println(dragon.getType() + " AI=" + dragon.getAIBehavior().getName());
        System.out.println("Prototype copy: " + copy.getName() + " / " + copy.getType());

        if (goblin.getLootTable() != null) {
            System.out.println("Loot roll: " + goblin.getLootTable().roll(new Random()));
        }
    }
}
