package com.drgnfireyellow.kite.display;

import org.bukkit.entity.BlockDisplay;
import org.bukkit.util.Transformation;

public abstract class SimpleBlockDisplay implements BlockDisplay {
    public void setTranslation(double x, double y, double z) {
        Transformation transform = this.getTransformation();
        transform.getTranslation().set(x, y, z);
        this.setTransformation(transform);
    }
    public void setScale(double x, double y, double z) {
        Transformation transform = this.getTransformation();
        transform.getScale().set(x, y, z);
        this.setTransformation(transform);
    }
    public void setRotation(float x, float y, float z) {
        Transformation transform = this.getTransformation();
        transform.getRightRotation().set(x, y, z, 1);
        this.setTransformation(transform);
    }
}
