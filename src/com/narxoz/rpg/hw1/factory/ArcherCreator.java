package com.narxoz.rpg.hw1.factory;

import com.narxoz.rpg.hw1.character.Archer;
import com.narxoz.rpg.hw1.character.Character;

public class ArcherCreator extends CharacterCreator {

    @Override
    protected Character createCharacter(String name) {
        return new Archer(name);
    }

}
