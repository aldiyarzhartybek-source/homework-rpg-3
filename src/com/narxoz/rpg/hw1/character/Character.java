package com.narxoz.rpg.hw1.character;

import com.narxoz.rpg.hw1.equipment.Armor;
import com.narxoz.rpg.hw1.equipment.Weapon;

public interface Character {
    String getName();

    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();

    void equip(Weapon weapon, Armor armor);

    String getStats();
    String useSpecialAbility();

    int getAttackPower();
    void takeDamage(int damage);
    boolean isAlive();
}