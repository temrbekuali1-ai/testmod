package net.callidual.testmod.datagen;

import net.callidual.testmod.TestMod;
import net.callidual.testmod.food.ModFoods;
import net.callidual.testmod.sound.ModSounds;
import net.fabricmc.fabric.api.client.datagen.v1.builder.SoundTypeBuilder;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import org.lwjgl.system.windows.DATA_BLOB;

import java.util.concurrent.CompletableFuture;

public class ModSoundsProvider extends FabricSoundsProvider {
    public ModSoundsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registryLookup, SoundExporter exporter) {
        exporter.add(ModSounds.HEAL.value(), SoundTypeBuilder.of(ModSounds.HEAL.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "heal"))).subtitle("sounds.testmod.heal"));

        exporter.add(ModSounds.DAMAGE.value(), SoundTypeBuilder.of(ModSounds.DAMAGE.value())
                .sound(SoundTypeBuilder.RegistrationBuilder.ofFile(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "damage"))).subtitle("sounds.testmod.damage"));
    }

    @Override
    public String getName() {
        return "Testmod Sounds";
    }
}
