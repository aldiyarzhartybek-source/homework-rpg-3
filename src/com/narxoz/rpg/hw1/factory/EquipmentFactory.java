package com.narxoz.rpg.hw1.factory;

import com.narxoz.rpg.hw1.equipment.Armor;
import com.narxoz.rpg.hw1.equipment.Weapon;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
    String getThemeName();
}
