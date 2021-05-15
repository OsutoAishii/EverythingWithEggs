package first_archive.everything_with_eggs.Item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//碳酸钙
public class CalciumCarbonate extends Item {
    //设置为食物(???)
    public static final Item calciumCarbonate = new Item(new Item.Settings().group(itemGROUP)
            .food((new FoodComponent.Builder())
                    .hunger(0)
                    .saturationModifier(0.3F)
                    .meat()
                    .build())
            .maxCount(64));

    public CalciumCarbonate(Settings settings) {
        super(settings);
    }
}
