package com.mpp.domain.quest;

public class SlayDragonQuest implements Quest {
    @Override
    public String embark() {
        return "Slay Dragon Quest";
    }

    @Override
    public String toString() {
        return "Quest{ " + embark() + " }";
    }
}
