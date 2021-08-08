package first_archive.everything_with_eggs.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SandBlock;

//粗糙的沙子
public class RoughSand extends Block {
    //硬度为0.5f
    public static final Block roughSand = new Block(FabricBlockSettings.of(Material.SOIL).hardness(0.5f));

    public RoughSand(int color, Settings settings) {
        super(settings);
    }
}
