package com.narxoz.rpg.hw2.loot;

import java.util.List;
import java.util.Random;

public interface LootTable {
    String getName();
    List<String> roll(Random random);
}
