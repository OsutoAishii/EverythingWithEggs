package first_archive.everything_with_eggs.Block;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static first_archive.everything_with_eggs.Block.EggshellBlock.eggshellBlock;
import static first_archive.everything_with_eggs.Block.LimeBlock.limeBlock;
import static first_archive.everything_with_eggs.Block.RoughSand.roughSand;
import static first_archive.everything_with_eggs.Block.StoneSand.stoneSand;
import static first_archive.everything_with_eggs.EverythingWithEggs.MODID;
import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

public class BlockLoader {
    //使用构造函数注册方块，每个方块需要注册两次（一次方块，一次物品）
    public BlockLoader() {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "eggshell_block"), eggshellBlock);
        Registry.register(Registry.ITEM, new Identifier(MODID, "eggshell_block"), new BlockItem(eggshellBlock, new Item.Settings().group(itemGROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MODID, "lime_block"), limeBlock);
        Registry.register(Registry.ITEM, new Identifier(MODID, "lime_block"), new BlockItem(limeBlock, new Item.Settings().group(itemGROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MODID, "stone_sand"), stoneSand);
        Registry.register(Registry.ITEM, new Identifier(MODID, "stone_sand"), new BlockItem(stoneSand, new Item.Settings().group(itemGROUP)));

        Registry.register(Registry.BLOCK, new Identifier(MODID, "rough_sand"), roughSand);
        Registry.register(Registry.ITEM, new Identifier(MODID, "rough_sand"), new BlockItem(roughSand, new Item.Settings().group(itemGROUP)));
    }
}
