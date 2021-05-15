package first_archive.everything_with_eggs.Item;

import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

public class Pebble extends Item {
    public static final Item pebble = new Item(new Item.Settings().group(itemGROUP));

    public Pebble(Settings settings) {
        super(settings);
    }
}
