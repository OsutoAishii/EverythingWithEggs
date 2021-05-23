package first_archive.everything_with_eggs.Item;

import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//蛋液胶
public class EggLiquidGlue extends Item {
    public static final Item eggLiquidGlue = new Item(new Item.Settings().group(itemGROUP));

    public EggLiquidGlue(Settings settings) {
        super(settings);
    }
}
