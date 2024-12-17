package me.violet.meowhack.features.modules.render;

import com.google.common.eventbus.Subscribe;
import me.violet.meowhack.event.impl.Render3DEvent;
import me.violet.meowhack.features.modules.Module;
import me.violet.meowhack.util.RenderUtil;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;

import java.awt.*;

public class BlockHighlight extends Module {
    public BlockHighlight() {
        super("BlockHighlight", "", Category.RENDER, true, false, false);
    }

    @Subscribe public void onRender3D(Render3DEvent event) {
        if (mc.crosshairTarget instanceof BlockHitResult result) {
            VoxelShape shape = mc.world.getBlockState(result.getBlockPos()).getOutlineShape(mc.world, result.getBlockPos());
            if (shape.isEmpty()) return;
            Box box = shape.getBoundingBox();
            box = box.offset(result.getBlockPos());
            RenderUtil.drawBox(event.getMatrix(), box, Color.red, 1f);
        }
    }
}
