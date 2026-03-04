package com.narxoz.rpg.hw1.factory;

import com.narxoz.rpg.hw1.equipment.Armor;
import com.narxoz.rpg.hw1.equipment.IronSword;
import com.narxoz.rpg.hw1.equipment.PlateArmor;
import com.narxoz.rpg.hw1.equipment.Weapon;

public class MedievalEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor();
    }

    @Override
    public String getThemeName() {
        return "Medieval";
    }
}
