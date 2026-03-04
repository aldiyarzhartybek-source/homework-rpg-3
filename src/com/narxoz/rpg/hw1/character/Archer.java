package com.narxoz.rpg.hw1.character;

import com.narxoz.rpg.hw1.equipment.Armor;
import com.narxoz.rpg.hw1.equipment.Weapon;

public class Archer implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Archer(String name) {
        this.name = name;
        this.health = 110;
        this.mana = 60;
        this.strength = 55;
        this.intelligence = 45;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public void equip(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public String useSpecialAbility() {
        return name + " uses PRECISION SHOT!";
    }

    @Override
    public String getStats() {
        String weaponInfo = (weapon == null) ? "None" : weapon.getWeaponInfo();
        String armorInfo  = (armor == null) ? "None" : armor.getArmorInfo();

        return "=== " + name + " (Archer) ===\n"
                + "Health: " + health + "\n"
                + "Mana: " + mana + "\n"
                + "Strength: " + strength + "\n"
                + "Intelligence: " + intelligence + "\n"
                + "Weapon: " + weaponInfo + "\n"
                + "Armor: " + armorInfo + "\n"
                + "Special Ability: " + useSpecialAbility() + "\n";
    }
}
