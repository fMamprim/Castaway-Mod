
package net.mcreator.castawaymod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;

public class CastawayMariscoItem extends Item {
	public CastawayMariscoItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(8.2f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 40;
	}
}
