package first_archive.everything_with_eggs.Item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//蛋黄
public class Yolk extends Item {
    public static final Item yolk = new Item(new Item.Settings().group(itemGROUP)
            .food((new FoodComponent.Builder())
                    .hunger(1)
                    .saturationModifier(0.6F)
                    .meat()
                    .snack()
                    .build())
            .maxCount(64));

    public Yolk(Settings settings) {
        super(settings);
    }
}
