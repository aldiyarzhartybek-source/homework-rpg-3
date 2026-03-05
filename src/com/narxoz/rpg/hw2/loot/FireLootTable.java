package com.narxoz.rpg.hw2.loot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class FireLootTable implements LootTable {
    @Override public String getName() { return "Fire Loot"; }

    @Override
    public List<String> roll(Random random) {
        List<String> items = new ArrayList<>();
        items.add("Charred Scale");
        if (random.nextInt(100) < 40) items.add("Flame Gem");
        if (random.nextInt(100) < 15) items.add("Molten Core");
        return items;
    }
}
