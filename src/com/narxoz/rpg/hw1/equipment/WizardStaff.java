package com.narxoz.rpg.hw1.equipment;

public class WizardStaff implements Weapon {

    private int damage;
    private String weaponType;

    public WizardStaff() {
        this.damage = 25;
        this.weaponType = "Staff";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic) - Damage: " + damage + ", Type: " + weaponType + " (Mana Boost)";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }
}
