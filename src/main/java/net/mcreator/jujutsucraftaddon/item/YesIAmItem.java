package net.mcreator.jujutsucraftaddon.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class YesIAmItem extends Item {
    public YesIAmItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
