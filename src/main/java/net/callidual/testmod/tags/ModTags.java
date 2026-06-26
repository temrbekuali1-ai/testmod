package net.callidual.testmod.tags;

import net.callidual.testmod.TestMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> REPAIR = createTag("repair");
        public static final TagKey<Item> WEAPONS = createTag("weapons");
        public static final TagKey<Item> ARMORS = createTag("armors");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name));
        }
    }


}
