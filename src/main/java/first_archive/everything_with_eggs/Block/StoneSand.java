package first_archive.everything_with_eggs.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SandBlock;

//石沙
public class StoneSand extends Block {
    //硬度为0.8f
    public static final Block stoneSand = new Block(FabricBlockSettings.of(Material.SOIL).hardness(0.8f));

    public StoneSand(int color, Settings settings) {
        super(settings);
    }
}
