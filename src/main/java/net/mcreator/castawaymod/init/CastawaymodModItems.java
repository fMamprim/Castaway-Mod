
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.castawaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.castawaymod.item.CastawayCoconutItem;
import net.mcreator.castawaymod.CastawaymodMod;

public class CastawaymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CastawaymodMod.MODID);
	public static final RegistryObject<Item> CASTAWAY_COCONUT = REGISTRY.register("castaway_coconut", () -> new CastawayCoconutItem());
}
