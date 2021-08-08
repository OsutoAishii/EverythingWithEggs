package first_archive.everything_with_eggs.Item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//煎蛋
public class FriedEgg extends Item {
    //设置为食物
    public static final Item friedEgg = new Item(new Item.Settings().group(itemGROUP)
            .food((new FoodComponent.Builder())
                    .hunger(4)
                    .saturationModifier(0.5F)
                    .meat()
                    .snack()
                    .build())
            .maxCount(64));

    public FriedEgg(Settings settings) {
        super(settings);
    }
}
