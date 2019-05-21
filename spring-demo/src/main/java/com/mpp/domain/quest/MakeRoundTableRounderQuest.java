package com.mpp.domain.quest;

public class MakeRoundTableRounderQuest implements Quest {
    @Override
    public String embark() {
        return "Make Round Table Rounder Quest";
    }

    @Override
    public String toString() {
        return "Quest{ " + embark() + " }";
    }
}
