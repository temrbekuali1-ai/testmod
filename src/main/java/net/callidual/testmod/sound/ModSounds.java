package net.callidual.testmod.sound;

import net.callidual.testmod.TestMod;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;

public class ModSounds {
    public static final Holder<SoundEvent> HEAL = Registry.registerForHolder(
            BuiltInRegistries.SOUND_EVENT,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "heal"),
            SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "heal"))
    );
    public static final Holder<SoundEvent> DAMAGE = Registry.registerForHolder(
            BuiltInRegistries.SOUND_EVENT,
            Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "damage"),
            SoundEvent.createVariableRangeEvent(Identifier.fromNamespaceAndPath(TestMod.MOD_ID, "damage"))
    );


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(TestMod.MOD_ID, name);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerSounds(){
        TestMod.LOGGER.info("Registering sounds for" + TestMod.MOD_ID);
    }
}
