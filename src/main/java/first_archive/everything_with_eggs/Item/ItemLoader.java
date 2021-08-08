package first_archive.everything_with_eggs.Item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static first_archive.everything_with_eggs.EverythingWithEggs.MODID;
import static first_archive.everything_with_eggs.Item.BoiledEgg.boiledEgg;
import static first_archive.everything_with_eggs.Item.BrokenEggshell.brokenEggshell;
import static first_archive.everything_with_eggs.Item.CalciumCarbonate.calciumCarbonate;
import static first_archive.everything_with_eggs.Item.EggCore.eggCore;
import static first_archive.everything_with_eggs.Item.EggLiquidGlue.eggLiquidGlue;
import static first_archive.everything_with_eggs.Item.EggTarts.eggTarts;
import static first_archive.everything_with_eggs.Item.EggWhite.eggWhite;
import static first_archive.everything_with_eggs.Item.EggshellArmorMaterial.*;
import static first_archive.everything_with_eggs.Item.FriedEgg.friedEgg;
import static first_archive.everything_with_eggs.Item.LimeBrick.limeBrick;
import static first_archive.everything_with_eggs.Item.Pebble.pebble;
import static first_archive.everything_with_eggs.Item.Quicklime.quicklime;
import static first_archive.everything_with_eggs.Item.Resin.resin;
import static first_archive.everything_with_eggs.Item.SandParticles.sandParticles;
import static first_archive.everything_with_eggs.Item.SlakedLime.slakedLime;
import static first_archive.everything_with_eggs.Item.Yolk.yolk;

public class ItemLoader {
    //使用构造函数注册物品
    public ItemLoader() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "broken_eggshell"), brokenEggshell);
        Registry.register(Registry.ITEM, new Identifier(MODID, "pebble"), pebble);
        Registry.register(Registry.ITEM, new Identifier(MODID, "egg_core"), eggCore);
        Registry.register(Registry.ITEM, new Identifier(MODID, "fried_egg"), friedEgg);
        Registry.register(Registry.ITEM, new Identifier(MODID, "boiled_egg"), boiledEgg);
        Registry.register(Registry.ITEM, new Identifier(MODID, "calcium_carbonate"), calciumCarbonate);
        Registry.register(Registry.ITEM, new Identifier(MODID, "quicklime"), quicklime);
        Registry.register(Registry.ITEM, new Identifier(MODID, "slaked_lime"), slakedLime);
        Registry.register(Registry.ITEM, new Identifier(MODID, "lime_brick"), limeBrick);
        Registry.register(Registry.ITEM, new Identifier(MODID, "yolk"), yolk);
        Registry.register(Registry.ITEM, new Identifier(MODID, "egg_white"), eggWhite);
        Registry.register(Registry.ITEM, new Identifier(MODID, "egg_tarts"), eggTarts);
        Registry.register(Registry.ITEM, new Identifier(MODID, "resin"), resin);
        Registry.register(Registry.ITEM, new Identifier(MODID, "egg_liquid_glue"), eggLiquidGlue);
        Registry.register(Registry.ITEM, new Identifier(MODID, "sand_particles"), sandParticles);

        Registry.register(Registry.ITEM, new Identifier(MODID, "eggshell_helmet"), Eggshell_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MODID, "eggshell_chestplate"), Eggshell_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MODID, "eggshell_leggings"), Eggshell_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MODID, "eggshell_boots"), Eggshell_BOOTS);
    }
}
