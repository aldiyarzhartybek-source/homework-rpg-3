package com.narxoz.rpg.hw2.combat;

public final class Vanish implements Ability {
    @Override public String getName() { return "Vanish"; }
    @Override public int getAttackBonus() { return 3; }
    @Override public int getDefenseBonus() { return 2; }
}
