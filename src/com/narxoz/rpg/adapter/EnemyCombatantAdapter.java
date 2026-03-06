package com.narxoz.rpg.adapter;

import com.narxoz.rpg.battle.Combatant;
import com.narxoz.rpg.hw2.enemy.Enemy;

public class EnemyCombatantAdapter implements Combatant {
    private final Enemy enemy;

    public EnemyCombatantAdapter(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String getName() {
        return enemy.getName();
    }

    @Override
    public int getAttackPower() {
        return enemy.getDamage();
    }

    @Override
    public void takeDamage(int amount) {
        enemy.takeDamage(amount);
    }

    @Override
    public boolean isAlive() {
        return enemy.isAlive();
    }
}