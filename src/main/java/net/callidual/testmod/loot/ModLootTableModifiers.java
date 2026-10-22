package net.callidual.testmod.loot;

import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.callidual.testmod.items.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

public class ModLootTableModifiers {
    public static void modifyLootTables(ResourceKey<LootTable> key, FabricLootTableBuilder builder,
                                        LootTableSource source, HolderLookup.Provider provider) {
        if (key.identifier().equals(Identifier.withDefaultNamespace("blocks/oak_leaves"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1f))
                    .when(LootItemRandomChanceCondition.randomChance(0.2f))
                    .add(LootItem.lootTableItem(ModItems.STICK))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1f, 2f)).build());

            builder.pool(poolBuilder.build());
        }


        if(BuiltInLootTables.IGLOO_CHEST.equals(key)) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.1f))
                    .add(LootItem.lootTableItem(ModItems.SNOWPIS))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1f, 2f)).build());

            builder.pool(poolBuilder.build());
        }

        if(BuiltInLootTables.UNDERWATER_RUIN_SMALL.equals(key)) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.35f))
                    .add(LootItem.lootTableItem(ModItems.CRABAP))
                    .add(LootItem.lootTableItem(ModItems.SEA_TEA))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0f,1f)).build());

            builder.pool(poolBuilder.build());
        }


        if(key.identifier().equals(Identifier.withDefaultNamespace("entities/zombie"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(0.1f))
                    .add(LootItem.lootTableItem(ModItems.JUNK_FOOD))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(0f, 1f)).build());

            builder.pool(poolBuilder.build());
        }
    }
}