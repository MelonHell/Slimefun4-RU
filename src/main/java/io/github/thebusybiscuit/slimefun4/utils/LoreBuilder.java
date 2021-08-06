package io.github.thebusybiscuit.slimefun4.utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.annotation.Nonnull;

import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.melonhell.MelonUtils;
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

    public static final String RIGHT_CLICK_TO_USE = "&eПКМ&7: Использовать";
    public static final String RIGHT_CLICK_TO_OPEN = "&eПКМ&7: Открыть";
    public static final String CROUCH_TO_USE = "&eShift&7: Использовать";

    private static final DecimalFormat hungerFormat = new DecimalFormat("#.0", DecimalFormatSymbols.getInstance(Locale.ROOT));

    private LoreBuilder() {}

    public static @Nonnull String radioactive(@Nonnull Radioactivity radioactivity) {
        return radioactivity.getLore();
    }

    public static @Nonnull String machine(@Nonnull MachineTier tier, @Nonnull MachineType type) {
        switch (type) {
            case GENERATOR:
                return tier + " генератор";
            case CAPACITOR:
                return tier + " конденсатор";
            case MACHINE:
                switch (tier) {
                    case BASIC:
                        return "&eБазовая машина";
                    case AVERAGE:
                        return "&6Продвинутая машина";
                    case MEDIUM:
                        return "&aСредняя машина";
                    case GOOD:
                        return "&2Модернезированная машина";
                    case ADVANCED:
                        return "&6Улучшенная машина";
                    case END_GAME:
                        return "&4Финальная машина";
                }
        }
        return tier + " " + type;
    }

    public static @Nonnull String speed(float speed) {
        return "&8\u21E8 &b\u26A1 &7Скорость: &b" + speed + 'x';
    }

    public static @Nonnull String powerBuffer(int power) {
        return "&8\u21E8 &e\u26A1 &7Буфер: " + power + " Дж";
    }

    public static @Nonnull String powerPerSecond(int power) {
        return power(power, "/сек");
    }

    public static @Nonnull String power(int power, @Nonnull String suffix) {
        return "&8\u21E8 &e\u26A1 &7" + power + " Дж" + suffix;
    }

    public static @Nonnull String powerCharged(int charge, int capacity) {
        return "&8\u21E8 &e\u26A1 &7" + charge + " / " + capacity + " Дж";
    }

    public static @Nonnull String material(@Nonnull String material) {
        return "&8\u21E8 &7Материал: &b" + material;
    }

    public static @Nonnull String hunger(double value) {
        return "&7&oВосстанавливает &b&o" + hungerFormat.format(value) + "&7&o сытости";
    }

    public static @Nonnull String range(int blocks) {
        return "&7Радиус действия: &c" + blocks + " " + MelonUtils.russianHuita(blocks, "блок", "блока", "блоков");
    }

    public static @Nonnull String usesLeft(int usesLeft) {
        return "&7Осталось &e" + usesLeft + " &7" + MelonUtils.russianHuita(usesLeft, "использование", "использования", "использований");
    }
}
