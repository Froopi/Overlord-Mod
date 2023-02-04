
package net.mcreator.mymod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.mymod.init.MymodModTabs;

public class MomonsworldItem extends SwordItem {
	public MomonsworldItem() {
		super(new Tier() {
			public int getUses() {
				return 300;
			}

			public float getSpeed() {
				return 6.5f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 10;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.7f, new Item.Properties().tab(MymodModTabs.TAB_OVERLORD).fireResistant());
	}
}
