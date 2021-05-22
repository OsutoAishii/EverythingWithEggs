package first_archive.everything_with_eggs.Item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//蛋挞
public class EggTarts extends Item {
    public static final Item eggTarts = new Item(new Item.Settings().group(itemGROUP)
            .food((new FoodComponent.Builder())
                    .hunger(3)
                    .saturationModifier(0.5F)
                    .meat()
                    .snack()
                    .build())
            .maxCount(64));

    public EggTarts(Settings settings) {
        super(settings);
    }
}
