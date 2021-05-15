package first_archive.everything_with_eggs.Item;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static first_archive.everything_with_eggs.EverythingWithEggs.MODID;
import static first_archive.everything_with_eggs.Item.BoiledEgg.boiledEgg;
import static first_archive.everything_with_eggs.Item.BrokenEggshell.brokenEggshell;
import static first_archive.everything_with_eggs.Item.CalciumCarbonate.calciumCarbonate;
import static first_archive.everything_with_eggs.Item.EggCore.eggCore;
import static first_archive.everything_with_eggs.Item.FriedEgg.friedEgg;
import static first_archive.everything_with_eggs.Item.Pebble.pebble;
import static first_archive.everything_with_eggs.Item.Quicklime.quicklime;

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
    }
}
