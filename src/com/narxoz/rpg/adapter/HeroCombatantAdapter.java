package com.narxoz.rpg.adapter;

import com.narxoz.rpg.battle.Combatant;
import com.narxoz.rpg.hw1.character.Character;

public class HeroCombatantAdapter implements Combatant {
    private final Character hero;

    public HeroCombatantAdapter(Character hero) {
        this.hero = hero;
    }

    @Override
    public String getName() {
        return hero.getName();
    }

    @Override
    public int getAttackPower() {
        return hero.getAttackPower();
    }

    @Override
    public void takeDamage(int amount) {
        hero.takeDamage(amount);
    }

    @Override
    public boolean isAlive() {
        return hero.isAlive();
    }
}