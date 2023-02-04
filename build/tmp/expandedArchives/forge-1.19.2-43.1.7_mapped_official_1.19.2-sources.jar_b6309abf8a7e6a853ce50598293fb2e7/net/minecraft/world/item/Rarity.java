package net.minecraft.world.item;

import net.minecraft.ChatFormatting;

public enum Rarity implements net.minecraftforge.common.IExtensibleEnum {
   COMMON(ChatFormatting.WHITE),
   UNCOMMON(ChatFormatting.YELLOW),
   RARE(ChatFormatting.AQUA),
   EPIC(ChatFormatting.LIGHT_PURPLE);

   /** @deprecated Forge: Use {@link #getStyleModifier()} */
   @Deprecated
   public final ChatFormatting color;
   private final java.util.function.UnaryOperator<net.minecraft.network.chat.Style> styleModifier;

   private Rarity(ChatFormatting p_43028_) {
      this.color = p_43028_;
      this.styleModifier = style -> style.withColor(p_43028_);
   }

   Rarity(java.util.function.UnaryOperator<net.minecraft.network.chat.Style> styleModifier) {
      this.color = ChatFormatting.BLACK;
      this.styleModifier = styleModifier;
   }

   public java.util.function.UnaryOperator<net.minecraft.network.chat.Style> getStyleModifier() {
      return this.styleModifier;
   }

   public static Rarity create(String name, ChatFormatting p_43028_) {
      throw new IllegalStateException("Enum not extended");
   }

   public static Rarity create(String name, java.util.function.UnaryOperator<net.minecraft.network.chat.Style> styleModifier) {
      throw new IllegalStateException("Enum not extended");
   }
}
