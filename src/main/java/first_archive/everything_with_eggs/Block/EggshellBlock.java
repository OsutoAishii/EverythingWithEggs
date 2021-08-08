package first_archive.everything_with_eggs.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

//蛋壳块
public class EggshellBlock extends Block {
    //硬度为1f
    public static final Block eggshellBlock = new Block(FabricBlockSettings.of(Material.STONE).hardness(1f));

    public EggshellBlock(Settings settings) {
        super(settings);
    }
}
