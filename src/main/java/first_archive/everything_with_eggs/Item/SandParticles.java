package first_archive.everything_with_eggs.Item;

import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//沙粒
public class SandParticles extends Item {
    public static final Item sandParticles = new Item(new Item.Settings().group(itemGROUP));

    public SandParticles(Settings settings) {
        super(settings);
    }
}
