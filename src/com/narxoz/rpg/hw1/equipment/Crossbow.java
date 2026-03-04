package com.narxoz.rpg.hw1.equipment;

public class Crossbow implements Weapon {

    private int damage;
    private String weaponType;

    public Crossbow() {
        this.damage = 30;
        this.weaponType = "Crossbow";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Crossbow (Ranger) - Damage: " + damage + ", Type: " + weaponType + " (High precision)";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }
}
