package net.callidual.testmod.compat;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.entry.EntryRegistry;
import me.shedaniel.rei.api.common.entry.EntryStack;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.callidual.testmod.items.ModItems;

public class TestModREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerEntries(EntryRegistry registry) {
        // Pass the item directly using EntryStacks.of()
        registry.removeEntry(EntryStacks.of(ModItems.CHISEL));
    }
}