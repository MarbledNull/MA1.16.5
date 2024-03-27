package net.marblednull.marbledsarsenal.armors.gas_masks.gp5;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class WhiteGP5Model extends AnimatedGeoModel<WhiteGP5ArmorItem> {
    @Override
    public ResourceLocation getModelLocation(WhiteGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "geo/gp5.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(WhiteGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "textures/armor/white_gp5.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(WhiteGP5ArmorItem object) {
        return new ResourceLocation(MarbledsArsenal.MODID, "animations/gp5.animation.json");
    }
}