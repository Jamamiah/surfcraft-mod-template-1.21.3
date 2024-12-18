package net.jarb.surfcraftmod.sound;

import net.jarb.surfcraftmod.SurfcraftMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent JAM_SPACETIME = registerSoundEvent("jam_spacetime");
    public static final RegistryKey<JukeboxSong> JAM_SPACETIME_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(SurfcraftMod.MOD_ID, "jam_spacetime"));

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(SurfcraftMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        SurfcraftMod.LOGGER.info("Registering sounds for " + SurfcraftMod.MOD_ID);
    }
}
