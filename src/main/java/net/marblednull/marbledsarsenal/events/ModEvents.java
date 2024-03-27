package net.marblednull.marbledsarsenal.events;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.marbledsarsenal.armors.body_armors.BlackPlateCarrierRenderer;
import net.marblednull.marbledsarsenal.armors.body_armors.OlivePlateCarrierRenderer;
import net.marblednull.marbledsarsenal.armors.full_suits.*;
import net.marblednull.marbledsarsenal.armors.gas_masks.cm6m.CM6MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.HelmetCM6MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.OliveHelmetCM6MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.UNHelmetCM6MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.cm7m.CM7MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.medical.MedicalHelmetCM6MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.medical.MedicalOliveHelmetCM6MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm6m.medical.MedicalUNHelmetCM6MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.HelmetCM7MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.OliveHelmetCM7MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.UNHelmetCM7MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.cm8m.CM8MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.medical.MedicalHelmetCM7MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.medical.MedicalOliveHelmetCM7MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm7m.medical.MedicalUNHelmetCM7MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.HelmetCM8MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.OliveHelmetCM8MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.UNHelmetCM8MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.gp5.BlackGP5Renderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.gp5.WhiteGP5Renderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.medical.MedicalHelmetCM8MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.medical.MedicalOliveHelmetCM8MRenderer;
import net.marblednull.marbledsarsenal.armors.gas_masks.helmet_gas_masks.cm8m.medical.MedicalUNHelmetCM8MRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.berets.BlackMilitaryBeretRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.berets.RedMilitaryBeretRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.berets.UNMilitaryBeretRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.combat_helmet.CombatHelmetRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.medical.MedicalCombatHelmetRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.medical.MedicalOliveCombatHelmetRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.medical.MedicalUNCombatHelmetRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.olive.OliveCombatHelmetRenderer;
import net.marblednull.marbledsarsenal.armors.helmets.un_helmet.UNCombatHelmetRenderer;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.BlackPlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.body_armors.OlivePlateCarrierArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.full_suits.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm6m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm7m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.cm8m.*;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.BlackGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.gas_masks.gp5.WhiteGP5ArmorItem;
import net.marblednull.marbledsarsenal.init.ArmorItems.helmets.*;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = MarbledsArsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        GeoArmorRenderer.registerArmorRenderer(CM6MArmorItem.class, CM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(HelmetCM6MArmorItem.class, HelmetCM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNHelmetCM6MArmorItem.class, UNHelmetCM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OliveHelmetCM6MArmorItem.class, OliveHelmetCM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalHelmetCM6MArmorItem.class, MedicalHelmetCM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalUNHelmetCM6MArmorItem.class, MedicalUNHelmetCM6MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalOliveHelmetCM6MArmorItem.class, MedicalOliveHelmetCM6MRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(CM7MArmorItem.class, CM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(HelmetCM7MArmorItem.class, HelmetCM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNHelmetCM7MArmorItem.class, UNHelmetCM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OliveHelmetCM7MArmorItem.class, OliveHelmetCM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalHelmetCM7MArmorItem.class, MedicalHelmetCM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalUNHelmetCM7MArmorItem.class, MedicalUNHelmetCM7MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalOliveHelmetCM7MArmorItem.class, MedicalOliveHelmetCM7MRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(CM8MArmorItem.class, CM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(HelmetCM8MArmorItem.class, HelmetCM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNHelmetCM8MArmorItem.class, UNHelmetCM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OliveHelmetCM8MArmorItem.class, OliveHelmetCM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalHelmetCM8MArmorItem.class, MedicalHelmetCM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalUNHelmetCM8MArmorItem.class, MedicalUNHelmetCM8MRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalOliveHelmetCM8MArmorItem.class, MedicalOliveHelmetCM8MRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(WhiteGP5ArmorItem.class, WhiteGP5Renderer::new);
        GeoArmorRenderer.registerArmorRenderer(BlackGP5ArmorItem.class, BlackGP5Renderer::new);

        GeoArmorRenderer.registerArmorRenderer(CombatHelmetArmorItem.class, CombatHelmetRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNCombatHelmetArmorItem.class, UNCombatHelmetRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OliveCombatHelmetArmorItem.class, OliveCombatHelmetRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalCombatHelmetArmorItem.class, MedicalCombatHelmetRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalUNCombatHelmetArmorItem.class, MedicalUNCombatHelmetRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(MedicalOliveCombatHelmetArmorItem.class, MedicalOliveCombatHelmetRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(BlackPlateCarrierArmorItem.class, BlackPlateCarrierRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(OlivePlateCarrierArmorItem.class, OlivePlateCarrierRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(RiotArmorItem.class, RiotArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(SwatArmorItem.class, SwatArmorRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(HazmatArmorItem.class, HazmatArmorRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(WinterMilitaryArmorItem.class, WinterMilitaryArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(DesertMilitaryArmorItem.class, DesertMilitaryArmorRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(BlackMilitaryBeretArmorItem.class, BlackMilitaryBeretRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(RedMilitaryBeretArmorItem.class, RedMilitaryBeretRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(UNMilitaryBeretArmorItem.class, UNMilitaryBeretRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(OliveJuggernautArmorItem.class, OliveJuggernautArmorRenderer::new);
        GeoArmorRenderer.registerArmorRenderer(BlackJuggernautArmorItem.class, BlackJuggernautArmorRenderer::new);
    }
}