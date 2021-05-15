package first_archive.everything_with_eggs.Item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//蛋芯
public class EggCore extends Item {
    //设置为食物
    public static final Item eggCore = new Item(new Item.Settings().group(itemGROUP)
            .food((new FoodComponent.Builder())
                    .hunger(2)
                    .saturationModifier(0.3F)
                    .meat()
                    .snack()
                    .build())
            .maxCount(64));

    public EggCore(Settings settings) {
        super(settings);
    }
}
