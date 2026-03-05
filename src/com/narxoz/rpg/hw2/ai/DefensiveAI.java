package com.narxoz.rpg.hw2.ai;

public final class DefensiveAI implements AIBehavior {
    @Override
    public String getName() {
        return "Defensive";
    }

    @Override
    public String decideAction() {
        return "DEFEND";
    }
}
