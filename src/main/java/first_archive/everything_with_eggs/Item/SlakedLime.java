package first_archive.everything_with_eggs.Item;

import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//消石灰
public class SlakedLime extends Item {
    public static final Item slakedLime = new Item(new Item.Settings().group(itemGROUP));

    public SlakedLime(Settings settings) {
        super(settings);
    }
}
