package first_archive.everything_with_eggs.Item;

import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//石灰砖
public class LimeBrick extends Item {
    public static final Item limeBrick = new Item(new Item.Settings().group(itemGROUP));

    public LimeBrick(Settings settings) {
        super(settings);
    }
}
