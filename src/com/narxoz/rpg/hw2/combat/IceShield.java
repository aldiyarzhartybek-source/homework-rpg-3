package com.narxoz.rpg.hw2.combat;

public final class IceShield implements Ability {
    @Override public String getName() { return "Ice Shield"; }
    @Override public int getAttackBonus() { return 0; }
    @Override public int getDefenseBonus() { return 5; }
}
