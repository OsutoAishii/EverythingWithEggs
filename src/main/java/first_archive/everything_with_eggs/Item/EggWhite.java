package first_archive.everything_with_eggs.Item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//蛋清
public class EggWhite extends Item {
    public static final Item eggWhite = new Item(new Item.Settings().group(itemGROUP)
            .food((new FoodComponent.Builder())
                    .hunger(1)
                    .saturationModifier(0.3F)
                    .meat()
                    .snack()
                    .build())
            .maxCount(64));

    public EggWhite(Settings settings) {
        super(settings);
    }
}
