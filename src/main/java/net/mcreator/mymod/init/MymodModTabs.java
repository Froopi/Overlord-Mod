
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mymod.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MymodModTabs {
	public static CreativeModeTab TAB_OVERLORD;

	public static void load() {
		TAB_OVERLORD = new CreativeModeTab("taboverlord") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MymodModItems.MOMONSWORLD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
