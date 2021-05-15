package first_archive.everything_with_eggs;

import first_archive.everything_with_eggs.Block.BlockLoader;
import first_archive.everything_with_eggs.Item.ItemLoader;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static first_archive.everything_with_eggs.Item.BrokenEggshell.brokenEggshell;

public class EverythingWithEggs implements ModInitializer {
    //设置MODID
    public static final String MODID = "everything_with_eggs";
    //设置创造模式物品栏
    public static final ItemGroup itemGROUP = FabricItemGroupBuilder.build(new Identifier("everything_with_eggs", "main"), () -> new ItemStack(brokenEggshell));
    //初始化函数
    @Override
    public void onInitialize() {
        //注册物品
        new ItemLoader();
        //注册方块
        new BlockLoader();
    }
}