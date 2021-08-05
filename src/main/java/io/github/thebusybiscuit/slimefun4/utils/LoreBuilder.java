package io.github.thebusybiscuit.slimefun4.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.annotation.Nonnull;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

/**
 * This utility class provides a few handy methods and constants to build the lore of any
 * {@link SlimefunItemStack}. It is mostly used directly inside the class {@link SlimefunItems}.
 * 
 * @author TheBusyBiscuit
 * 
 * @see SlimefunItems
 *
 */
public final class LoreBuilder {

    public static final String HAZMAT_SUIT_REQUIRED = "&8\u21E8 &4Требуется защитный костюм!";

    public static final String RIGHT_CLICK_TO_USE = "&eПКМ&7 - использовать";
    public static final String RIGHT_CLICK_TO_OPEN = "&eПКМ&7 - открыть";
    public static final String CROUCH_TO_USE = "&eShift&7 - использовать";

    private static final DecimalFormat hungerFormat = new DecimalFormat("#.0", DecimalFormatSymbols.getInstance(Locale.ROOT));

    private LoreBuilder() {}

    public static @Nonnull String radioactive(@Nonnull Radioactivity radioactivity) {
        return radioactivity.getLore();
    }

    public static @Nonnull String machine(@Nonnull MachineTier tier, @Nonnull MachineType type) {
        return tier + " " + type;
    }

    public static @Nonnull String speed(float speed) {
        return "&8\u21E8 &b\u26A1 &7Скорость: &b" + speed + 'x';
    }

    public static @Nonnull String powerBuffer(int power) {
        return power(power, " Буфер");
    }

    public static @Nonnull String powerPerSecond(int power) {
        return power(power, "/s");
    }

    public static @Nonnull String power(int power, @Nonnull String suffix) {
        return "&8\u21E8 &e\u26A1 &7" + power + " J" + suffix;
    }

    public static @Nonnull String powerCharged(int charge, int capacity) {
        return "&8\u21E8 &e\u26A1 &7" + charge + " / " + capacity + " J";
    }

    public static @Nonnull String material(@Nonnull String material) {
        return "&8\u21E8 &7Материал: &b" + material;
    }

    public static @Nonnull String hunger(double value) {
        return "&7&oВосстанавливает &b&o" + hungerFormat.format(value) + "&7&o сытости";
    }

    public static @Nonnull String range(int blocks) {
        return "&7Радиус действия: &c" + blocks + " " + russianHuita(blocks, "блок", "блока", "блоков");
    }

    public static @Nonnull String usesLeft(int usesLeft) {
        return "&7Осталось &e" + usesLeft + " &7" + russianHuita(usesLeft, "использование", "использования", "использований");
    }

    public static @Nonnull String russianHuita(int num, String a, String b, String c) {
        int preLastDigit = num % 100 / 10;
        if (preLastDigit == 1) return c;
        switch (num % 10) {
            case 1:
                return a;
            case 2:
            case 3:
            case 4:
                return b;
            default:
                return c;
        }
    }
}
