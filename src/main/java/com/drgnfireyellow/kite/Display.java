package com.drgnfireyellow.kite;

import org.bukkit.Location;
import org.bukkit.entity.BlockDisplay;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.util.Transformation;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

public class Display {
    public static BlockDisplay createBlockDisplay(@NotNull Material type, @NotNull Location position, Vector3f translation, Vector3f scale, Vector3f rotation) {
        BlockDisplay display = (BlockDisplay) position.getWorld().spawnEntity(position, EntityType.BLOCK_DISPLAY);
        display.setBlock(type.createBlockData());
        Transformation transformation = display.getTransformation();
        transformation.getTranslation().set(translation);
        transformation.getScale().set(scale);
        transformation.getRightRotation().set(rotation.x, rotation.y, rotation.z, 1);
        display.setTransformation(transformation);
        return display;
    }
}