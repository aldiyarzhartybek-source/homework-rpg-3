package com.narxoz.rpg.hw2.combat;

public interface Ability {
    String getName();
    int getDamage();
    String getDescription();
    Ability clone();
}
