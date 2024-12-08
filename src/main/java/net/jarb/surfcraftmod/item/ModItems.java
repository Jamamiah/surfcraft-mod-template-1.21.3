package net.jarb.surfcraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jarb.surfcraftmod.SurfcraftMod;
import net.jarb.surfcraftmod.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item JAM_SPACETIME_MUSIC_DISC =
            registerItem("jam_spacetime_music_disc", new Item(new Item.Settings()
                    .jukeboxPlayable(ModSounds.JAM_SPACETIME_KEY)
                    .maxCount(1)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SurfcraftMod.MOD_ID, "jam_spacetime_music_disc")))
            ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SurfcraftMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SurfcraftMod.LOGGER.info("Registering items for " + SurfcraftMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(JAM_SPACETIME_MUSIC_DISC);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(JAM_SPACETIME_MUSIC_DISC);
        });
    }
}
