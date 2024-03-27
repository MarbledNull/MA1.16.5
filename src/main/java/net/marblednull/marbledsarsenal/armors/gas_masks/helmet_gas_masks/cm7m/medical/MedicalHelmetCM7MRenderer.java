package net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.medical;

import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.MedicalHelmetCM7MArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.MedicalHelmetCM8MArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MedicalHelmetCM7MRenderer extends GeoArmorRenderer<MedicalHelmetCM7MArmorItem> {
    public MedicalHelmetCM7MRenderer() {
        super(new MedicalHelmetCM7MModel());
        this.headBone ="armorHead";
        this.bodyBone ="armorBody";
        this.rightArmBone ="armorRightArm";
        this.leftArmBone ="armorLeftArm";
        this.rightLegBone ="armorRightLeg";
        this.leftLegBone ="armorLeftLeg";
        this.leftBootBone ="armorLeftBoot";
        this.rightBootBone ="armorRightBoot";
    }
}
