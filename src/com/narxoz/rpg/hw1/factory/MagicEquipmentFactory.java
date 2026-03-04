package com.narxoz.rpg.hw1.factory;

import com.narxoz.rpg.hw1.equipment.Armor;
import com.narxoz.rpg.hw1.equipment.MagicRobes;
import com.narxoz.rpg.hw1.equipment.Weapon;
import com.narxoz.rpg.hw1.equipment.WizardStaff;

public class MagicEquipmentFactory implements EquipmentFactory {

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }

    @Override
    public Armor createArmor() {
        return new MagicRobes();
    }

    @Override
    public String getThemeName() {
        return "Magic";
    }
}
