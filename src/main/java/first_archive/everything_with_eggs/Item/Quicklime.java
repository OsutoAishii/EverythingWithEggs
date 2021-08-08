package first_archive.everything_with_eggs.Item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//生石灰
public class Quicklime extends Item {
    public static final Item quicklime = new Item(new Item.Settings().group(itemGROUP));

    public Quicklime(Settings settings) {
        super(settings);
    }
}
