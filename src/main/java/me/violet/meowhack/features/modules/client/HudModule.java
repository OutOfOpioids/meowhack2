package me.violet.meowhack.features.modules.client;

import me.violet.meowhack.Meowhack;
import me.violet.meowhack.event.impl.Render2DEvent;
import me.violet.meowhack.features.modules.Module;

public class HudModule extends Module {
    public HudModule() {
        super("Hud", "hud", Category.CLIENT, true, false, false);
    }

    @Override
    public void onRender2D(Render2DEvent event) {
        event.getContext().drawTextWithShadow(
                mc.textRenderer,
                Meowhack.NAME + " " + Meowhack.VERSION,
                2, 2,
                -1
        );
    }
}
