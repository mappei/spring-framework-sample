package com.mpp.domain.quest;

public class RescueDamselQuest implements Quest {
    @Override
    public String embark() {
        return "Rescue Damsel Quest";
    }

    @Override
    public String toString() {
        return "Quest{ " + embark() + " }";
    }
}
