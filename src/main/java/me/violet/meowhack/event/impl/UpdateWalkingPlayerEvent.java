package me.violet.meowhack.event.impl;

import me.violet.meowhack.event.Event;
import me.violet.meowhack.event.Stage;

public class UpdateWalkingPlayerEvent extends Event {
    private final Stage stage;

    public UpdateWalkingPlayerEvent(Stage stage) {
        this.stage = stage;
    }

    public Stage getStage() {
        return stage;
    }
}
