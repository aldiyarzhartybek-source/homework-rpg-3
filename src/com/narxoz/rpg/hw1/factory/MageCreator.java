package com.narxoz.rpg.hw1.factory;

import com.narxoz.rpg.hw1.character.Character;
import com.narxoz.rpg.hw1.character.Mage;

public class MageCreator extends CharacterCreator {

    @Override
    protected Character createCharacter(String name) {
        return new Mage(name);
    }

}
