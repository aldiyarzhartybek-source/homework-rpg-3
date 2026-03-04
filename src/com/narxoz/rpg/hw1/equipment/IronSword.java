package com.narxoz.rpg.hw1.equipment;

public class IronSword implements Weapon {

    private int damage;
    private String weaponType;

    public IronSword() {
        this.damage = 35;
        this.weaponType = "Sword";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - Damage: " + damage + ", Type: " + weaponType+ " (Damage Boost)";
    }


    @Override
    public String getWeaponType() {
        return weaponType;
    }
}
