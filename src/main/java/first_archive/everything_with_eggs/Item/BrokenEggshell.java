package first_archive.everything_with_eggs.Item;

import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//碎蛋壳
public class BrokenEggshell extends Item {
    public static final Item brokenEggshell = new Item(new Item.Settings().group(itemGROUP));

    public BrokenEggshell(Settings settings) {
        super(settings);
    }
}
