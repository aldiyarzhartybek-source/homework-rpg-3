package com.narxoz.rpg.hw2.loot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class ShadowLootTable implements LootTable {
    @Override public String getName() { return "Shadow Loot"; }

    @Override
    public List<String> roll(Random random) {
        List<String> items = new ArrayList<>();
        items.add("Dark Cloth");
        if (random.nextInt(100) < 40) items.add("Shadow Essence");
        if (random.nextInt(100) < 15) items.add("Night Shard");
        return items;
    }
}
