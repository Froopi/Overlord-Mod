
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.mymod.item.MomonsworldItem;
import net.mcreator.mymod.MymodMod;

public class MymodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MymodMod.MODID);
	public static final RegistryObject<Item> MOMONSWORLD = REGISTRY.register("momonsworld", () -> new MomonsworldItem());
	public static final RegistryObject<Item> DEMIYRG = REGISTRY.register("demiyrg_spawn_egg",
			() -> new ForgeSpawnEggItem(MymodModEntities.DEMIYRG, -6750208, -26317, new Item.Properties().tab(MymodModTabs.TAB_OVERLORD)));
}
