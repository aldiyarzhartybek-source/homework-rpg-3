package com.narxoz.rpg.hw3.battle;

import java.util.Random;

public interface Combatant {

    final class Attack {
        private final String name;
        private final int damage;

        public Attack(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }
    }

    String getName();
    int getHealth();
    int getDefense();
    int getSpeed();
    boolean isAlive();

    Attack attack(Random random);
    void takeDamage(int damage);
}