package first_archive.everything_with_eggs.Item;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

import static first_archive.everything_with_eggs.EverythingWithEggs.itemGROUP;

//蛋壳装备
public class EggshellArmorMaterial extends Item {
    public static final Item Eggshell_HELMET = new ArmorItem(EggShell_ArmorMaterial.eggshell, EquipmentSlot.HEAD, (new Item.Settings().group(itemGROUP)));
    public static final Item Eggshell_CHESTPLATE = new ArmorItem(EggShell_ArmorMaterial.eggshell, EquipmentSlot.CHEST, (new Item.Settings().group(itemGROUP)));
    public static final Item Eggshell_LEGGINGS = new ArmorItem(EggShell_ArmorMaterial.eggshell, EquipmentSlot.LEGS, (new Item.Settings().group(itemGROUP)));
    public static final Item Eggshell_BOOTS = new ArmorItem(EggShell_ArmorMaterial.eggshell, EquipmentSlot.FEET, (new Item.Settings().group(itemGROUP)));

    public EggshellArmorMaterial(Settings settings) {
        super(settings);
    }
}

enum EggShell_ArmorMaterial implements ArmorMaterial {
    //定义材料的保护值等属性
    eggshell("eggshell", 5, new int[]{1,3,2,1}, 15, SoundEvents.BLOCK_WOOL_PLACE, 0.0F, () -> {
        return Ingredient.ofItems(Items.WHITE_WOOL);
    });

    //定义护甲的耐久，此处数据按照从头到脚的顺序
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantAbility;
    private final SoundEvent equipSound;
    private final float toughness;
    private final Lazy<Ingredient> repairIngredientSupplier;

    EggShell_ArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantAbility, SoundEvent equipSound, float toughness, Supplier<Ingredient> ingredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantAbility = enchantAbility;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.repairIngredientSupplier = new Lazy(ingredientSupplier);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantAbility;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    @Override
    @Environment(EnvType.CLIENT)
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
