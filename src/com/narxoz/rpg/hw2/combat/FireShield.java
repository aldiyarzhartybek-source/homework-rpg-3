package com.narxoz.rpg.hw2.combat;

public final class FireShield implements Ability {
    @Override public String getName() { return "Fire Shield"; }
    @Override public int getAttackBonus() { return 0; }
    @Override public int getDefenseBonus() { return 4; }
}
