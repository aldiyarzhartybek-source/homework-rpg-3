package com.narxoz.rpg.battle;

public class BattleEngine {
    private static BattleEngine instance;

    private BattleEngine() {
    }

    public static BattleEngine getInstance() {
        if (instance == null) {
            instance = new BattleEngine();
        }
        return instance;
    }

    public void battle(Combatant first, Combatant second) {
        System.out.println(first.getName() + " vs " + second.getName());

        if (!first.isAlive() || !second.isAlive()) {
            System.out.println("Battle cannot start because one of the combatants is already defeated.");
            return;
        }

        int round = 1;

        while (first.isAlive() && second.isAlive()) {
            System.out.println("Round " + round);

            second.takeDamage(first.getAttackPower());
            System.out.println(first.getName() + " attacks " + second.getName()
                    + " for " + first.getAttackPower() + " damage");

            if (!second.isAlive()) {
                System.out.println(second.getName() + " has been defeated!");
                System.out.println("Winner: " + first.getName());
                break;
            }

            first.takeDamage(second.getAttackPower());
            System.out.println(second.getName() + " attacks " + first.getName()
                    + " for " + second.getAttackPower() + " damage");

            if (!first.isAlive()) {
                System.out.println(first.getName() + " has been defeated!");
                System.out.println("Winner: " + second.getName());
                break;
            }

            round++;
            System.out.println();
        }
    }
}