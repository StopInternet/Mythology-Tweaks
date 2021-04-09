
package net.mcreator.mythologytweaks.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.mythologytweaks.creativetab.TabMythology;
import net.mcreator.mythologytweaks.ElementsMythologytweaksMod;

@ElementsMythologytweaksMod.ModElement.Tag
public class ItemBlackholeCatalyst extends ElementsMythologytweaksMod.ModElement {
	@GameRegistry.ObjectHolder("mythologytweaks:blackhole_catalyst")
	public static final Item block = null;
	public ItemBlackholeCatalyst(ElementsMythologytweaksMod instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("mythologytweaks:blackhole_catalyst", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("blackhole_catalyst");
			setRegistryName("blackhole_catalyst");
			setCreativeTab(TabMythology.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
