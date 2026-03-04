package com.narxoz.rpg.hw1.character;

import com.narxoz.rpg.hw1.equipment.Armor;
import com.narxoz.rpg.hw1.equipment.Weapon;

public class Mage implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    private Weapon weapon;
    private Armor armor;

    public Mage(String name) {
        this.name = name;
        this.health = 90;
        this.mana = 120;
        this.strength = 15;
        this.intelligence = 90;
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
        return name + " casts FIREBALL!";
    }

    @Override
    public String getStats() {
        String weaponInfo = (weapon == null) ? "None" : weapon.getWeaponInfo();
        String armorInfo  = (armor == null) ? "None" : armor.getArmorInfo();

        return "=== " + name + " (Mage) ===\n"
                + "Health: " + health + "\n"
                + "Mana: " + mana + "\n"
                + "Strength: " + strength + "\n"
                + "Intelligence: " + intelligence + "\n"
                + "Weapon: " + weaponInfo + "\n"
                + "Armor: " + armorInfo + "\n"
                + "Special Ability: " + useSpecialAbility() + "\n";
    }
}
