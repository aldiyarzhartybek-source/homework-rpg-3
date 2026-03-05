package com.narxoz.rpg.hw2.combat;

public final class FrostBreath implements Ability {
    @Override public String getName() { return "Frost Breath"; }
    @Override public int getAttackBonus() { return 7; }
    @Override public int getDefenseBonus() { return 1; }
}
