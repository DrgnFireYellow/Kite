package com.drgnfireyellow.kite;

import org.bukkit.entity.BlockDisplay;
import org.bukkit.Material;
import org.bukkit.util.Transformation;
import org.jetbrains.annotations.NotNull;

public class Display {
    public static BlockDisplay configureBlockDisplay(@NotNull BlockDisplay display, @NotNull Material type, double translationX, double translationY, double translationZ, double scaleX, double scaleY, double scaleZ, float rotationX, float rotationY, float rotationZ) {
        display.setBlock(type.createBlockData());
        Transformation transformation = display.getTransformation();
        transformation.getTranslation().set(translationX, translationY, translationZ);
        transformation.getScale().set(scaleX, scaleY, scaleZ);
        transformation.getRightRotation().set(rotationX, rotationY, rotationZ, 1);
        display.setTransformation(transformation);
        return display;
    }
}
