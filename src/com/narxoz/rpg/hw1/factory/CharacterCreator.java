package com.narxoz.rpg.hw1.factory;

import com.narxoz.rpg.hw1.character.Character;

public abstract class CharacterCreator {
    public Character create(String name) {
        return createCharacter(name);
    }


    protected abstract Character createCharacter(String name);

}
