package com.narxoz.rpg.hw1.factory;

import com.narxoz.rpg.hw1.equipment.Armor;
import com.narxoz.rpg.hw1.equipment.Crossbow;
import com.narxoz.rpg.hw1.equipment.LeatherArmor;
import com.narxoz.rpg.hw1.equipment.Weapon;

public class RangerEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new Crossbow();
    }

    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }

    @Override
    public String getThemeName() {
        return "Ranger";
    }
}
