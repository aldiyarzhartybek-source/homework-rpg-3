package com.narxoz.rpg;

import com.narxoz.rpg.adapter.EnemyCombatantAdapter;
import com.narxoz.rpg.adapter.HeroCombatantAdapter;
import com.narxoz.rpg.battle.BattleEngine;
import com.narxoz.rpg.battle.Combatant;
import com.narxoz.rpg.hw1.character.Archer;
import com.narxoz.rpg.hw1.character.Character;
import com.narxoz.rpg.hw1.character.Mage;
import com.narxoz.rpg.hw1.character.Warrior;
import com.narxoz.rpg.hw2.ai.AIBehavior;
import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.enemy.DragonBoss;
import com.narxoz.rpg.hw2.enemy.Enemy;
import com.narxoz.rpg.hw2.enemy.Goblin;
import com.narxoz.rpg.hw2.loot.LootTable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Thorin");
        Character mage = new Mage("Merlin");
        Character archer = new Archer("Legolas");

        List<Ability> goblinAbilities = new ArrayList<>();
        List<Ability> dragonAbilities = new ArrayList<>();

        LootTable goblinLoot = null;
        LootTable dragonLoot = null;
        AIBehavior goblinAI = null;
        AIBehavior dragonAI = null;

        Enemy goblin = new Goblin(
                "Grimtooth",
                "Earth",
                100,
                20,
                10,
                15,
                goblinAbilities,
                goblinLoot,
                goblinAI
        );

        Enemy dragon = new DragonBoss(
                "Smolderfang",
                "Fire",
                250,
                35,
                20,
                10,
                dragonAbilities,
                dragonLoot,
                dragonAI
        );

        Enemy goblinCopy = goblin.copy();

        Combatant hero1 = new HeroCombatantAdapter(warrior);
        Combatant hero2 = new HeroCombatantAdapter(mage);
        Combatant hero3 = new HeroCombatantAdapter(archer);

        Combatant enemy1 = new EnemyCombatantAdapter(goblin);
        Combatant enemy2 = new EnemyCombatantAdapter(dragon);
        Combatant enemy3 = new EnemyCombatantAdapter(goblinCopy);

        BattleEngine engine = BattleEngine.getInstance();

        System.out.println("=== BATTLE 1 ===");
        engine.battle(hero1, enemy1);

        System.out.println("\n=== BATTLE 2 ===");
        engine.battle(hero2, enemy2);

        System.out.println("\n=== BATTLE 3 ===");
        engine.battle(hero3, enemy3);
    }
}