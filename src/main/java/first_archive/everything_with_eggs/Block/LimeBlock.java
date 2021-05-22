package first_archive.everything_with_eggs.Block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

//石灰块
public class LimeBlock extends Block {
    //石头类型，硬度为1f
    public static final Block limeBlock = new Block(FabricBlockSettings.of(Material.STONE).hardness(2f));

    public LimeBlock(Settings settings) {
        super(settings);
    }
}
