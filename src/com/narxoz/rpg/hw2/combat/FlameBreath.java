package com.narxoz.rpg.hw2.combat;

public final class FlameBreath implements Ability {
    @Override public String getName() { return "Flame Breath"; }
    @Override public int getAttackBonus() { return 10; }
    @Override public int getDefenseBonus() { return 0; }
}
