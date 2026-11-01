package net.callidual.testmod.tags;

import net.callidual.testmod.TestMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        private static TagKey<Block> INCORRECT = createTag("incorrect_ph");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> REPAIR = createTag("repair");
        public static final TagKey<Item> WEAPONS = createTag("weapons");
        public static final TagKey<Item> ARMORS = createTag("armors");

        public static final TagKey<Item> REPAIR_STICK = createTag("repair_stick");
        public static final TagKey<Item> REPAIR_TOY = createTag("repair_toy");
        public static final TagKey<Item> REPAIR_GLOVE = createTag("repair_glove");
        public static final TagKey<Item> REPAIR_SHOES = createTag("repair_shoes");
        public static final TagKey<Item> REPAIR_NOTE = createTag("repair_note");
        public static final TagKey<Item> REPAIR_GUN = createTag("repair_gun");
        public static final TagKey<Item> REPAIR_PAN = createTag("repair_pan");
        public static final TagKey<Item> REPAIR_WORN = createTag("repair_worn");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name));
        }
    }


}
