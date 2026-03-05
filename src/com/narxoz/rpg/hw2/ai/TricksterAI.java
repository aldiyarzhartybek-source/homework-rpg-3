package com.narxoz.rpg.hw2.ai;

public final class TricksterAI implements AIBehavior {
    @Override
    public String getName() {
        return "Trickster";
    }

    @Override
    public String decideAction() {
        return "TRICK";
    }
}
