package first_archive.everything_with_eggs.Item;

import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//树脂
public class Resin extends Item {
    public static final Item resin = new Item(new Item.Settings().group(itemGROUP));

    public Resin(Settings settings) {
        super(settings);
    }
}
