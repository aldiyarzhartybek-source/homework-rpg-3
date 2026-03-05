package com.narxoz.rpg.hw2.loot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class IceLootTable implements LootTable {
    @Override public String getName() { return "Ice Loot"; }

    @Override
    public List<String> roll(Random random) {
        List<String> items = new ArrayList<>();
        items.add("Frozen Fang");
        if (random.nextInt(100) < 40) items.add("Ice Crystal");
        if (random.nextInt(100) < 15) items.add("Glacier Heart");
        return items;
    }
}
