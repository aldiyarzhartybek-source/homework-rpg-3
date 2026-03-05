package com.narxoz.rpg.hw2.prototype;

import com.narxoz.rpg.hw2.enemy.Enemy;

import java.util.HashMap;
import java.util.Map;

public final class EnemyRegistry {

    private final Map<String, Enemy> prototypes = new HashMap<>();

    public void register(String key, Enemy enemy) {
        if (key == null || key.isEmpty()) throw new IllegalArgumentException("key");
        if (enemy == null) throw new IllegalArgumentException("enemy");
        prototypes.put(key, enemy);
    }

    public Enemy create(String key) {
        Enemy proto = prototypes.get(key);
        if (proto == null) throw new IllegalArgumentException("Unknown prototype: " + key);
        return proto.copy();
    }
}
