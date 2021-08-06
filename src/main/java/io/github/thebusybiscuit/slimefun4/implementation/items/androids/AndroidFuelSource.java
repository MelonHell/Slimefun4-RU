package io.github.thebusybiscuit.slimefun4.implementation.items.androids;

import javax.annotation.Nonnull;

import io.github.thebusybiscuit.slimefun4.melonhell.MelonUtils;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;

/**
 * This enum covers all different fuel sources a {@link ProgrammableAndroid} can have.
 * 
 * @author TheBusyBiscuit
 *
 */
public enum AndroidFuelSource {

    /**
     * This {@link ProgrammableAndroid} runs on solid fuel, e.g. Wood or coal
     */
    SOLID(MelonUtils.splitLore("", "&fЭтот робот работает на сухом топливе, таком как уголь, дерево и прочее...")),

    /**
     * This {@link ProgrammableAndroid} runs on liquid fuel, e.g. Fuel, Oil or Lava
     */
    LIQUID(MelonUtils.splitLore("", "&fЭтот робот работает на жидком топливе, таком как лава, нефть, бензин и прочее...")),

    /**
     * This {@link ProgrammableAndroid} runs on nuclear fuel, e.g. Uranium
     */
    NUCLEAR(MelonUtils.splitLore("", "&fЭтот робот работает на радиоактивном топливе, таком как уран, нептуний, обогащенный уран"));

    private final String[] lore;

    AndroidFuelSource(@Nonnull String... lore) {
        this.lore = lore;
    }

    /**
     * This returns a display {@link ItemStack} for this {@link AndroidFuelSource}.
     * 
     * @return An {@link ItemStack} to display
     */
    @Nonnull
    public ItemStack getItem() {
        return new CustomItem(HeadTexture.GENERATOR.getAsItemStack(), "&8\u21E9 &cВвод топлива &8\u21E9", lore);
    }

}
