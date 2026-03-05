package com.narxoz.rpg.hw2.ai;

public final class AggressiveAI implements AIBehavior {
    @Override
    public String getName() {
        return "Aggressive";
    }

    @Override
    public String decideAction() {
        return "ATTACK";
    }
}
