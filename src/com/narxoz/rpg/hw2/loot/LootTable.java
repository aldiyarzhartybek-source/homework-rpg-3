package com.narxoz.rpg.hw2.loot;

import java.util.List;

public interface LootTable {
    List<String> getItems();
    int getGoldDrop();
    int getExperienceDrop();
    LootTable clone();
}
