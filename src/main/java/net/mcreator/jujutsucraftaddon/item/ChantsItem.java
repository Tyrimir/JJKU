package net.mcreator.jujutsucraftaddon.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ChantsItem extends Item {
    public ChantsItem() {
        super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
    }
}
