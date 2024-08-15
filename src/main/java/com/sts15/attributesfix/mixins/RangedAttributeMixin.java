package com.sts15.attributesfix.mixins;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RangedAttribute.class)
public class RangedAttributeMixin {

    @Overwrite
    public double sanitizeValue(double pValue) {
        return Double.isNaN(pValue) ? 0.0 : pValue;
    }
}
