package io.github.thebusybiscuit.slimefun4.implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.thebusybiscuit.slimefun4.melonhell.MelonUtils;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.staves.StormStaff;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import io.github.thebusybiscuit.slimefun4.utils.HeadTexture;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;

/**
 * This class holds a static references to every {@link SlimefunItemStack}
 * found in Slimefun.
 */
@SuppressWarnings("java:S1192") // Suppress "duplicate string literal" warnings
public final class SlimefunItems {

    private SlimefunItems() {}

    /* Items */
    public static final SlimefunItemStack PORTABLE_CRAFTER = new SlimefunItemStack("PORTABLE_CRAFTER", HeadTexture.PORTABLE_CRAFTER, "&6Портативный верстак", MelonUtils.splitLore("&a&oКарманная версия верстака", "", LoreBuilder.RIGHT_CLICK_TO_OPEN));
    public static final SlimefunItemStack PORTABLE_DUSTBIN = new SlimefunItemStack("PORTABLE_DUSTBIN", HeadTexture.TRASH_CAN, "&6Портативная мусорка", MelonUtils.splitLore("&fТвой портативный уничтожитель предметов", "", LoreBuilder.RIGHT_CLICK_TO_OPEN));
    public static final SlimefunItemStack ENDER_BACKPACK = new SlimefunItemStack("ENDER_BACKPACK", HeadTexture.ENDER_BACKPACK, "&6Эндер-рюкзак", MelonUtils.splitLore("&a&oПортативный Эндер-сундук", "", LoreBuilder.RIGHT_CLICK_TO_OPEN));
    public static final SlimefunItemStack MAGIC_EYE_OF_ENDER = new SlimefunItemStack("MAGIC_EYE_OF_ENDER", Material.ENDER_EYE, "&6&lМагическое око Эндера", MelonUtils.splitLore("&4&lТребуется полный комплект Эндер-брони", "", "&7&eПКМ&7: Бросить Эндер-жемчуг"));
    public static final SlimefunItemStack BROKEN_SPAWNER = new SlimefunItemStack("BROKEN_SPAWNER", Material.SPAWNER, "&cСломанный спаунер", "&7Тип: &b<Тип>", "", "&cСломан, необходимо отремонтировать в Древнем алтаре");
    public static final SlimefunItemStack REPAIRED_SPAWNER = new SlimefunItemStack("REINFORCED_SPAWNER", Material.SPAWNER, "&bАрмированный спаунер", "&7Тип: &b<Тип>");
    public static final SlimefunItemStack INFERNAL_BONEMEAL = new SlimefunItemStack("INFERNAL_BONEMEAL", Material.BONE_MEAL, "&4Костная мука Незера", "", "&cУскоряет рост Незерского нароста");
    public static final SlimefunItemStack TAPE_MEASURE = new SlimefunItemStack("TAPE_MEASURE", "180d5c43a6cf5bb7769fd0c8240e1e70d2ae38ef9d78a1db401aca6a2cb36f65", "&6Рулетка", "", "&eShift + ПКМ&7: Установить точку", "&eПКМ&7: Измерить");

    /* Gadgets */
    public static final SlimefunItemStack GOLD_PAN = new SlimefunItemStack("GOLD_PAN", Material.BOWL, "&6Сито", "", "&eПКМ&7: Собрать ресурсы с Гравия");
    public static final SlimefunItemStack NETHER_GOLD_PAN = new SlimefunItemStack("NETHER_GOLD_PAN", Material.BOWL, "&4Сито Незера", "", "&eПКМ&7: Собрать ресурсы с Песка душ");
    public static final SlimefunItemStack PARACHUTE = new SlimefunItemStack("PARACHUTE", Material.LEATHER_CHESTPLATE, Color.WHITE, "&f&lПарашют", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack GRAPPLING_HOOK = new SlimefunItemStack("GRAPPLING_HOOK", Material.LEAD, "&6Крюк-кошка", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SOLAR_HELMET = new SlimefunItemStack("SOLAR_HELMET", Material.IRON_HELMET, "&bСолнечный шлем", "", "&a&oЗаряжает хранимые предметы и броню");
    public static final SlimefunItemStack CLOTH = new SlimefunItemStack("CLOTH", Material.PAPER, "&bТкань");
    public static final SlimefunItemStack REINFORCED_CLOTH = new SlimefunItemStack("REINFORCED_CLOTH", Material.PAPER, "&bАрмированная ткань", MelonUtils.splitLore("", "&fЭта ткань укреплена &bСвинцом &fдля защиты от радиоактивных веществ"));
    public static final SlimefunItemStack TIN_CAN = new SlimefunItemStack("CAN", HeadTexture.TIN_CAN, "&fКонсервная банка");
    public static final SlimefunItemStack NIGHT_VISION_GOGGLES = new SlimefunItemStack("NIGHT_VISION_GOGGLES", Material.LEATHER_HELMET, Color.BLACK, "&aПрибор ночного видения", "", "&9+ Ночное зрение");
    public static final SlimefunItemStack ELYTRA_CAP = new SlimefunItemStack("ELYTRA_CAP", Material.LEATHER_HELMET, Color.PURPLE, "&5Противоударный шлем", MelonUtils.splitLore("", "&7Этот шлем защитит тебя от крушения на элитрах"));
    public static final SlimefunItemStack FARMER_SHOES = new SlimefunItemStack("FARMER_SHOES", Material.LEATHER_BOOTS, Color.YELLOW, "&eФермерские ботинки", "", "&6&oНе позволят затоптать посевы");
    public static final SlimefunItemStack INFUSED_MAGNET = new SlimefunItemStack("INFUSED_MAGNET", HeadTexture.MAGNET, "&aУсиленный магнит", MelonUtils.splitLore("", "&fБлагодаря усилению магией, этот магнит притягивает предметы в радиусе 6 блоков", "", LoreBuilder.CROUCH_TO_USE));
    public static final SlimefunItemStack RAG = new SlimefunItemStack("RAG", Material.PAPER, "&cБинт", "", "&aУровень I - Медицинская помощь", "", "&fВосстанавливает 2 сердечка", "&fТушит огонь", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack BANDAGE = new SlimefunItemStack("BANDAGE", Material.PAPER, "&cПовязка", "", "&aУровень II - Медицинская помощь", "", "&fВосстанавливает 4 сердечка", "&fТушит огонь", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack SPLINT = new SlimefunItemStack("SPLINT", Material.STICK, "&cШина", "", "&aУровень I - Медицинская помощь", "", "&fВосстанавливает 2 сердечка", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack VITAMINS = new SlimefunItemStack("VITAMINS", Material.NETHER_WART, "&cВитамины", "", "&aУровень III - Медицинская помощь", "", "&fВосстанавливает 4 сердечка", "&fТушит огонь", "&fИзлечивает от Отравления/Иссушения/Радиации", "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack MEDICINE = new SlimefunItemStack("MEDICINE", Material.POTION, Color.RED, "&cМикстура", "", "&aУровень III - Медицинская помощь", "", "&fВосстанавливает 4 сердечка", "&fТушит огонь", "&fИзлечивает от Отравления/Иссушения/Радиации");
    public static final SlimefunItemStack MAGICAL_ZOMBIE_PILLS = new SlimefunItemStack("MAGICAL_ZOMBIE_PILLS", Material.NETHER_WART, "&6Волшебные зомби-таблетки", MelonUtils.splitLore("", "&eПКМ &7по Зомби-крестьянину или по Зомби-пиглину, чтобы вылечить его"));

    public static final SlimefunItemStack FLASK_OF_KNOWLEDGE = new SlimefunItemStack("FLASK_OF_KNOWLEDGE", Material.GLASS_BOTTLE, "&cПустой пузырёк опыта", MelonUtils.splitLore("", "&fПозволяет поместить часть опыта в пузырёк", "&7Стоимость: &a1 Уровень"));
    public static final SlimefunItemStack FILLED_FLASK_OF_KNOWLEDGE = new SlimefunItemStack("FILLED_FLASK_OF_KNOWLEDGE", Material.EXPERIENCE_BOTTLE, "&aПузырёк опыта");

    /* Backpacks */
    private static final String BACKPACK_ID = "&7ID: <ID>";
    public static final SlimefunItemStack BACKPACK_SMALL = new SlimefunItemStack("SMALL_BACKPACK", HeadTexture.BACKPACK, "&eМаленький рюкзак", "", "&7Размер: &e9", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_MEDIUM = new SlimefunItemStack("MEDIUM_BACKPACK", HeadTexture.BACKPACK, "&eРюкзак", "", "&7Размер: &e18", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BACKPACK_LARGE = new SlimefunItemStack("LARGE_BACKPACK", HeadTexture.BACKPACK, "&eБольшой рюкзак", "", "&7Размер: &e27", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack WOVEN_BACKPACK = new SlimefunItemStack("WOVEN_BACKPACK", HeadTexture.BACKPACK, "&eТканый рюкзак", "", "&7Размер: &e36", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack GILDED_BACKPACK = new SlimefunItemStack("GILDED_BACKPACK", HeadTexture.BACKPACK, "&eПозолоченный рюкзак", "", "&7Размер: &e45", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack RADIANT_BACKPACK = new SlimefunItemStack("RADIANT_BACKPACK", HeadTexture.BACKPACK, "&eСияющий рюкзак", "", "&7Размер: &e54", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack BOUND_BACKPACK = new SlimefunItemStack("BOUND_BACKPACK", HeadTexture.ENDER_BACKPACK, "&cБезутратный рюкзак", "", "&7Размер: &e36", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack COOLER = new SlimefunItemStack("COOLER", HeadTexture.COOLER, "&bХолодильник", MelonUtils.splitLore("&fПозволяет хранить Соки и Смузи, восполняя ими голод когда он появляется", "", "&7Размер: &e27", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN));
    public static final SlimefunItemStack RESTORED_BACKPACK = new SlimefunItemStack("RESTORED_BACKPACK", HeadTexture.RESTORED_BACKPACK, "&eВосстановленный рюкзак", "", "&7Возвращает потерянные вещи", BACKPACK_ID, "", LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /* Jetpacks */
    public static final SlimefunItemStack DURALUMIN_JETPACK = new SlimefunItemStack("DURALUMIN_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Электрический реактивный ранец &7- &eI", "", LoreBuilder.material("Дюралюминий"), LoreBuilder.powerCharged(0, 20), "&8\u21E8 &7Тяга: &c0.35", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETPACK = new SlimefunItemStack("SOLDER_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Электрический реактивный ранец &7- &eII", "", LoreBuilder.material("Припой"), LoreBuilder.powerCharged(0, 30), "&8\u21E8 &7Тяга: &c0.4", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETPACK = new SlimefunItemStack("BILLON_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Электрический реактивный ранец &7- &eIII", "", LoreBuilder.material("Биллон"), LoreBuilder.powerCharged(0, 45), "&8\u21E8 &7Тяга: &c0.45", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETPACK = new SlimefunItemStack("STEEL_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Электрический реактивный ранец &7- &eIV", "", LoreBuilder.material("Сталь"), LoreBuilder.powerCharged(0, 60), "&8\u21E8 &7Тяга: &c0.5", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETPACK = new SlimefunItemStack("DAMASCUS_STEEL_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Электрический реактивный ранец &7- &eV", "", LoreBuilder.material("Дамасская сталь"), LoreBuilder.powerCharged(0, 75), "&8\u21E8 &7Тяга: &c0.55", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETPACK = new SlimefunItemStack("REINFORCED_ALLOY_JETPACK", Material.LEATHER_CHESTPLATE, Color.SILVER, "&9Электрический реактивный ранец &7- &eVI", "", LoreBuilder.material("Армированный сплав"), LoreBuilder.powerCharged(0, 100), "&8\u21E8 &7Тяга: &c0.6", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETPACK = new SlimefunItemStack("CARBONADO_JETPACK", Material.LEATHER_CHESTPLATE, Color.BLACK, "&9Электрический реактивный ранец &7- &eVII", "", LoreBuilder.material("Карбонад"), LoreBuilder.powerCharged(0, 150), "&8\u21E8 &7Тяга: &c0.7", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETPACK = new SlimefunItemStack("ARMORED_JETPACK", Material.IRON_CHESTPLATE, "&9Бронированный реактивный ранец", LoreBuilder.material("Сталь"), "", LoreBuilder.powerCharged(0, 50), "&8\u21E8 &7Тяга: &c0.45", "", LoreBuilder.CROUCH_TO_USE);

    /* Jetboots */
    public static final SlimefunItemStack DURALUMIN_JETBOOTS = new SlimefunItemStack("DURALUMIN_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные ботинки &7- &eI", "", LoreBuilder.material("Дюралюминий"), LoreBuilder.powerCharged(0, 20), LoreBuilder.speed(0.35F), "&8\u21E8 &7Стабильность: &c50%", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack SOLDER_JETBOOTS = new SlimefunItemStack("SOLDER_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные ботинки &7- &eII", "", LoreBuilder.material("Припой"), LoreBuilder.powerCharged(0, 30), LoreBuilder.speed(0.4F), "&8\u21E8 &7Стабильность: &660%", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack BILLON_JETBOOTS = new SlimefunItemStack("BILLON_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные ботинки &7- &eIII", "", LoreBuilder.material("Биллон"), LoreBuilder.powerCharged(0, 40), LoreBuilder.speed(0.45F), "&8\u21E8 &7Стабильность: &665%", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack STEEL_JETBOOTS = new SlimefunItemStack("STEEL_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные ботинки &7- &eIV", "", LoreBuilder.material("Сталь"), LoreBuilder.powerCharged(0, 50), LoreBuilder.speed(0.5F), "&8\u21E8 &7Стабильность: &e70%", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack DAMASCUS_STEEL_JETBOOTS = new SlimefunItemStack("DAMASCUS_STEEL_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные ботинки &7- &eV", "", LoreBuilder.material("Дамасская сталь"), LoreBuilder.powerCharged(0, 75), LoreBuilder.speed(0.55F), "&8\u21E8 &7Стабильность: &a75%", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack REINFORCED_ALLOY_JETBOOTS = new SlimefunItemStack("REINFORCED_ALLOY_JETBOOTS", Material.LEATHER_BOOTS, Color.SILVER, "&9Реактивные ботинки &7- &eVI", "", LoreBuilder.material("Армированный сплав"), LoreBuilder.powerCharged(0, 100), LoreBuilder.speed(0.6F), "&8\u21E8 &7Стабильность: &c80%", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack CARBONADO_JETBOOTS = new SlimefunItemStack("CARBONADO_JETBOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&9Реактивные ботинки &7- &eVII", "", LoreBuilder.material("Карбонад"), LoreBuilder.powerCharged(0, 125), LoreBuilder.speed(0.7F), "&8\u21E8 &7Стабильность: &c99.9%", "", LoreBuilder.CROUCH_TO_USE);
    public static final SlimefunItemStack ARMORED_JETBOOTS = new SlimefunItemStack("ARMORED_JETBOOTS", Material.IRON_BOOTS, "&9Бронированные реактивные ботинки", "", LoreBuilder.material("Steel"), LoreBuilder.powerCharged(0, 50), LoreBuilder.speed(0.45F), "&8\u21E8 &7Стабильность: &e70%", "", LoreBuilder.CROUCH_TO_USE);

    /* Multi Tools */
    private static final String MULTI_TOOL_LORE = "&eCrouch & Right Click&7 to switch modes";
    public static final SlimefunItemStack DURALUMIN_MULTI_TOOL = new SlimefunItemStack("DURALUMIN_MULTI_TOOL", Material.SHEARS, "&9Мультитул &7- &eI", "", LoreBuilder.material("Дюралюминий"), LoreBuilder.powerCharged(0, 20), "", LoreBuilder.RIGHT_CLICK_TO_USE, MULTI_TOOL_LORE);
    public static final SlimefunItemStack SOLDER_MULTI_TOOL = new SlimefunItemStack("SOLDER_MULTI_TOOL", Material.SHEARS, "&9Мультитул &7- &eII", "", LoreBuilder.material("Припой"), LoreBuilder.powerCharged(0, 30), "", LoreBuilder.RIGHT_CLICK_TO_USE, MULTI_TOOL_LORE);
    public static final SlimefunItemStack BILLON_MULTI_TOOL = new SlimefunItemStack("BILLON_MULTI_TOOL", Material.SHEARS, "&9Мультитул &7- &eIII", "", LoreBuilder.material("Биллон"), LoreBuilder.powerCharged(0, 40), "", LoreBuilder.RIGHT_CLICK_TO_USE, MULTI_TOOL_LORE);
    public static final SlimefunItemStack STEEL_MULTI_TOOL = new SlimefunItemStack("STEEL_MULTI_TOOL", Material.SHEARS, "&9Мультитул &7- &eIV", "", LoreBuilder.material("Сталь"), LoreBuilder.powerCharged(0, 50), "", LoreBuilder.RIGHT_CLICK_TO_USE, MULTI_TOOL_LORE);
    public static final SlimefunItemStack DAMASCUS_STEEL_MULTI_TOOL = new SlimefunItemStack("DAMASCUS_STEEL_MULTI_TOOL", Material.SHEARS, "&9Мультитул &7- &eV", "", LoreBuilder.material("Дамасская сталь"), LoreBuilder.powerCharged(0, 60), "", LoreBuilder.RIGHT_CLICK_TO_USE, MULTI_TOOL_LORE);
    public static final SlimefunItemStack REINFORCED_ALLOY_MULTI_TOOL = new SlimefunItemStack("REINFORCED_ALLOY_MULTI_TOOL", Material.SHEARS, "&9Мультитул &7- &eVI", "", LoreBuilder.material("Армированный сплав"), LoreBuilder.powerCharged(0, 75), "", LoreBuilder.RIGHT_CLICK_TO_USE, MULTI_TOOL_LORE);
    public static final SlimefunItemStack CARBONADO_MULTI_TOOL = new SlimefunItemStack("CARBONADO_MULTI_TOOL", Material.SHEARS, "&9Мультитул &7- &eVII", "", LoreBuilder.material("Карбонад"), LoreBuilder.powerCharged(0, 100), "", LoreBuilder.RIGHT_CLICK_TO_USE, MULTI_TOOL_LORE);

    static {
        ItemMeta duralumin = DURALUMIN_MULTI_TOOL.getItemMeta();
        duralumin.setUnbreakable(true);
        DURALUMIN_MULTI_TOOL.setItemMeta(duralumin);

        ItemMeta solder = SOLDER_MULTI_TOOL.getItemMeta();
        solder.setUnbreakable(true);
        SOLDER_MULTI_TOOL.setItemMeta(solder);

        ItemMeta billon = BILLON_MULTI_TOOL.getItemMeta();
        billon.setUnbreakable(true);
        BILLON_MULTI_TOOL.setItemMeta(billon);

        ItemMeta steel = STEEL_MULTI_TOOL.getItemMeta();
        steel.setUnbreakable(true);
        STEEL_MULTI_TOOL.setItemMeta(steel);

        ItemMeta damascus = DAMASCUS_STEEL_MULTI_TOOL.getItemMeta();
        damascus.setUnbreakable(true);
        DAMASCUS_STEEL_MULTI_TOOL.setItemMeta(damascus);

        ItemMeta reinforced = REINFORCED_ALLOY_MULTI_TOOL.getItemMeta();
        reinforced.setUnbreakable(true);
        REINFORCED_ALLOY_MULTI_TOOL.setItemMeta(reinforced);

        ItemMeta carbonado = CARBONADO_MULTI_TOOL.getItemMeta();
        carbonado.setUnbreakable(true);
        CARBONADO_MULTI_TOOL.setItemMeta(carbonado);
    }

    /* Food */
    public static final SlimefunItemStack FORTUNE_COOKIE = new SlimefunItemStack("FORTUNE_COOKIE", Material.COOKIE, "&6Печенье удачи", "", "&a&oРасскажет тебе о будущем :o");
    public static final SlimefunItemStack DIET_COOKIE = new SlimefunItemStack("DIET_COOKIE", Material.COOKIE, "&6Диетическое печенье", "", "&aОчень &oлёгкое &f&aпеченье");
    public static final SlimefunItemStack MAGIC_SUGAR = new SlimefunItemStack("MAGIC_SUGAR", Material.SUGAR, "&6Волшебный сахар", "", "&a&oПочувствуй силу Гермеса!");
    public static final SlimefunItemStack MONSTER_JERKY = new SlimefunItemStack("MONSTER_JERKY", Material.ROTTEN_FLESH, "&6Вяленая гниль", "", "&a&oБольше никакого голода");
    public static final SlimefunItemStack APPLE_JUICE = new SlimefunItemStack("APPLE_JUICE", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "&cЯблочный сок", "", LoreBuilder.hunger(3));
    public static final SlimefunItemStack MELON_JUICE = new SlimefunItemStack("MELON_JUICE", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "&cАрбузный сок", "", LoreBuilder.hunger(3));
    public static final SlimefunItemStack CARROT_JUICE = new SlimefunItemStack("CARROT_JUICE", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "&6Морковный сок", "", LoreBuilder.hunger(3));
    public static final SlimefunItemStack PUMPKIN_JUICE = new SlimefunItemStack("PUMPKIN_JUICE", Color.ORANGE, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "&6Тыквенный сок", "", LoreBuilder.hunger(3));
    public static final SlimefunItemStack SWEET_BERRY_JUICE = new SlimefunItemStack("SWEET_BERRY_JUICE", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 5, 0), "&cЯгодный сок", "", LoreBuilder.hunger(3));
    public static final SlimefunItemStack GOLDEN_APPLE_JUICE = new SlimefunItemStack("GOLDEN_APPLE_JUICE", Color.YELLOW, new PotionEffect(PotionEffectType.ABSORPTION, 20 * 20, 0), "&bЗолотой яблочный сок");

    public static final SlimefunItemStack BEEF_JERKY = new SlimefunItemStack("BEEF_JERKY", Material.COOKED_BEEF, "&6Вяленая говядина", "", "&fЭкстра насыщение!");
    public static final SlimefunItemStack PORK_JERKY = new SlimefunItemStack("PORK_JERKY", Material.COOKED_PORKCHOP, "&6Вяленая свинина", "", "&fЭкстра насыщение!");
    public static final SlimefunItemStack CHICKEN_JERKY = new SlimefunItemStack("CHICKEN_JERKY", Material.COOKED_CHICKEN, "&6Вяленая курица", "", "&fЭкстра насыщение!");
    public static final SlimefunItemStack MUTTON_JERKY = new SlimefunItemStack("MUTTON_JERKY", Material.COOKED_MUTTON, "&6Вяленая баранина", "", "&fЭкстра насыщение!");
    public static final SlimefunItemStack RABBIT_JERKY = new SlimefunItemStack("RABBIT_JERKY", Material.COOKED_RABBIT, "&6Вяленый кролик", "", "&fЭкстра насыщение!");
    public static final SlimefunItemStack FISH_JERKY = new SlimefunItemStack("FISH_JERKY", Material.COOKED_COD, "&6Вяленая рыба", "", "&fЭкстра насыщение!");

    public static final SlimefunItemStack KELP_COOKIE = new SlimefunItemStack("KELP_COOKIE", Material.COOKIE, "&2Печенье из ламинарии");

    /* Christmas */
    public static final SlimefunItemStack CHRISTMAS_MILK = new SlimefunItemStack("CHRISTMAS_MILK", Color.WHITE, new PotionEffect(PotionEffectType.SATURATION, 4, 0), "&6Стакан молока", "", LoreBuilder.hunger(2.5));
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_MILK = new SlimefunItemStack("CHRISTMAS_CHOCOLATE_MILK", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 11, 0), "&6Шоколадное молоко", "", LoreBuilder.hunger(6));
    public static final SlimefunItemStack CHRISTMAS_EGG_NOG = new SlimefunItemStack("CHRISTMAS_EGG_NOG", Color.GRAY, new PotionEffect(PotionEffectType.SATURATION, 6, 0), "&aЭгг-ног", "", LoreBuilder.hunger(3.5));
    public static final SlimefunItemStack CHRISTMAS_APPLE_CIDER = new SlimefunItemStack("CHRISTMAS_APPLE_CIDER", Color.RED, new PotionEffect(PotionEffectType.SATURATION, 13, 0), "&cЯблочный сидр", "", LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_COOKIE = new SlimefunItemStack("CHRISTMAS_COOKIE", Material.COOKIE, ChatUtils.christmas("Рождественское печенье"));
    public static final SlimefunItemStack CHRISTMAS_FRUIT_CAKE = new SlimefunItemStack("CHRISTMAS_FRUIT_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Фруктовый торт"));
    public static final SlimefunItemStack CHRISTMAS_APPLE_PIE = new SlimefunItemStack("CHRISTMAS_APPLE_PIE", Material.PUMPKIN_PIE, "&fЯблочный пирог");
    public static final SlimefunItemStack CHRISTMAS_HOT_CHOCOLATE = new SlimefunItemStack("CHRISTMAS_HOT_CHOCOLATE", Color.MAROON, new PotionEffect(PotionEffectType.SATURATION, 13, 0), "&6Горячий шоколад", "", LoreBuilder.hunger(7));
    public static final SlimefunItemStack CHRISTMAS_CAKE = new SlimefunItemStack("CHRISTMAS_CAKE", Material.PUMPKIN_PIE, ChatUtils.christmas("Рождественский пирог"));
    public static final SlimefunItemStack CHRISTMAS_CARAMEL = new SlimefunItemStack("CHRISTMAS_CARAMEL", Material.BRICK, "&6Карамель");
    public static final SlimefunItemStack CHRISTMAS_CARAMEL_APPLE = new SlimefunItemStack("CHRISTMAS_CARAMEL_APPLE", Material.APPLE, "&6Карамельное Яблоко");
    public static final SlimefunItemStack CHRISTMAS_CHOCOLATE_APPLE = new SlimefunItemStack("CHRISTMAS_CHOCOLATE_APPLE", Material.APPLE, "&6Шоколадное яблоко");
    public static final SlimefunItemStack CHRISTMAS_PRESENT = new SlimefunItemStack("CHRISTMAS_PRESENT", HeadTexture.CHRISTMAS_PRESENT, ChatUtils.christmas("Рождественский подарок"), "&7От: &cTheBusyBiscuit", "&7Кому: &eТебе", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);

    /* Easter */
    public static final SlimefunItemStack EASTER_EGG = new SlimefunItemStack("EASTER_EGG", HeadTexture.EASTER_EGG, "&fПасхальное яйцо", "&dСчастливой Пасхи! Держи сюрприз", "", LoreBuilder.RIGHT_CLICK_TO_OPEN);
    public static final SlimefunItemStack EASTER_CARROT_PIE = new SlimefunItemStack("CARROT_PIE", Material.PUMPKIN_PIE, "&6Морковный пирог");
    public static final SlimefunItemStack EASTER_APPLE_PIE = new SlimefunItemStack("EASTER_APPLE_PIE", Material.PUMPKIN_PIE, "&fЯблочный пирог");

    /* Weapons */
    public static final SlimefunItemStack GRANDMAS_WALKING_STICK = new SlimefunItemStack("GRANDMAS_WALKING_STICK", Material.STICK, "&7Бабушкина трость");
    public static final SlimefunItemStack GRANDPAS_WALKING_STICK = new SlimefunItemStack("GRANDPAS_WALKING_STICK", Material.STICK, "&7Дедушка трость");
    public static final SlimefunItemStack SWORD_OF_BEHEADING = new SlimefunItemStack("SWORD_OF_BEHEADING", Material.IRON_SWORD, "&6Трофейный меч", "&7Обезглавливание II", "", "&fИмеет шанс обезглавить противника");
    public static final SlimefunItemStack BLADE_OF_VAMPIRES = new SlimefunItemStack("BLADE_OF_VAMPIRES", Material.GOLDEN_SWORD, "&cВампирский клинок", MelonUtils.splitLore("&7Вампиризм I", "", "&fДаёт 45% шанс на восстановление двух сердечек здоровья при атаке противника"));
    public static final SlimefunItemStack SEISMIC_AXE = new SlimefunItemStack("SEISMIC_AXE", Material.IRON_AXE, "&aСейсмический топор", "", "&7&oМаленькое землетрясение...", "", LoreBuilder.RIGHT_CLICK_TO_USE);

    static {
        GRANDMAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 2);
        GRANDPAS_WALKING_STICK.addUnsafeEnchantment(Enchantment.KNOCKBACK, 5);

        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        BLADE_OF_VAMPIRES.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 2);
    }

    /* Bows */
    public static final SlimefunItemStack EXPLOSIVE_BOW = new SlimefunItemStack("EXPLOSIVE_BOW", Material.BOW, "&cВзрывной лук", MelonUtils.splitLore("&fСтрелы взрываются при попадании в противника"));
    public static final SlimefunItemStack ICY_BOW = new SlimefunItemStack("ICY_BOW", Material.BOW, "&bЛедяной лук", MelonUtils.splitLore("&fПри попадании замораживает, противника на 2 секунды"));

    /* Tools */
    public static final SlimefunItemStack SMELTERS_PICKAXE = new SlimefunItemStack("SMELTERS_PICKAXE", Material.DIAMOND_PICKAXE, "&6Плавящая кирка", "&c&lАвто-плавка", "", "&9Совместимо с Удачей");
    public static final SlimefunItemStack LUMBER_AXE = new SlimefunItemStack("LUMBER_AXE", Material.DIAMOND_AXE, "&6Топор лесоруба", "&a&oСрубает дерево целиком...");
    public static final SlimefunItemStack PICKAXE_OF_CONTAINMENT = new SlimefunItemStack("PICKAXE_OF_CONTAINMENT", Material.IRON_PICKAXE, "&cКирка заточения", "", "&9Может добывать спаунеры");
    public static final SlimefunItemStack HERCULES_PICKAXE = new SlimefunItemStack("HERCULES_PICKAXE", Material.IRON_PICKAXE, "&9Кирка Геркулеса", MelonUtils.splitLore("", "&fОбладает такой силой, что превращает всю добытую руду просто в пыль..."));
    public static final SlimefunItemStack EXPLOSIVE_PICKAXE = new SlimefunItemStack("EXPLOSIVE_PICKAXE", Material.DIAMOND_PICKAXE, "&eВзрывная кирка", MelonUtils.splitLore("", "&fДаёт возможность выкапывать несколько блоков за раз...", "", "&9Совместимо с Удачей"));
    public static final SlimefunItemStack EXPLOSIVE_SHOVEL = new SlimefunItemStack("EXPLOSIVE_SHOVEL", Material.DIAMOND_SHOVEL, "&eВзрывная лопата", MelonUtils.splitLore("", "&fДаёт возможность выкапывать несколько блоков за раз..."));
    public static final SlimefunItemStack PICKAXE_OF_THE_SEEKER = new SlimefunItemStack("PICKAXE_OF_THE_SEEKER", Material.DIAMOND_PICKAXE, "&aКирка искателя", MelonUtils.splitLore("&fНаправит тебя к ближайшей руде, при этом потратит прочность", "", "&7&eПКМ&7: Узнать направление к руде"));
    public static final SlimefunItemStack COBALT_PICKAXE = new SlimefunItemStack("COBALT_PICKAXE", Material.IRON_PICKAXE, "&9Кобальтовая кирка");
    public static final SlimefunItemStack PICKAXE_OF_VEIN_MINING = new SlimefunItemStack("PICKAXE_OF_VEIN_MINING", Material.DIAMOND_PICKAXE, "&eКирка рудниковой добычи", MelonUtils.splitLore("", "&fЭта кирка выкапывает всю жилу целиком..."));
    public static final SlimefunItemStack CLIMBING_PICK = new SlimefunItemStack("CLIMBING_PICK", Material.IRON_PICKAXE, "&bЛедоруб", "", "&fПозволяет карабкаться по стенам", "", LoreBuilder.RIGHT_CLICK_TO_USE);

    static {
        HERCULES_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        HERCULES_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 3);

        COBALT_PICKAXE.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        COBALT_PICKAXE.addUnsafeEnchantment(Enchantment.DIG_SPEED, 6);
    }

    /* Armor */
    public static final SlimefunItemStack GLOWSTONE_HELMET = new SlimefunItemStack("GLOWSTONE_HELMET", Material.LEATHER_HELMET, Color.YELLOW, "&e&lСветокаменный шлем", "", "&a&oСияет как солнце!", "", "&9+ Ночное зрение");
    public static final SlimefunItemStack GLOWSTONE_CHESTPLATE = new SlimefunItemStack("GLOWSTONE_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.YELLOW, "&e&lСветокаменный нагрудник", "", "&a&oСияет как солнце!", "", "&9+ Ночное зрение");
    public static final SlimefunItemStack GLOWSTONE_LEGGINGS = new SlimefunItemStack("GLOWSTONE_LEGGINGS", Material.LEATHER_LEGGINGS, Color.YELLOW, "&e&lСветокаменные поножи", "", "&a&oСияет как солнце!", "", "&9+ Ночное зрение");
    public static final SlimefunItemStack GLOWSTONE_BOOTS = new SlimefunItemStack("GLOWSTONE_BOOTS", Material.LEATHER_BOOTS, Color.YELLOW, "&e&lСветокаменные ботинки", "", "&a&oСияет как солнце!", "", "&9+ Ночное зрение");

    public static final SlimefunItemStack ENDER_HELMET = new SlimefunItemStack("ENDER_HELMET", Material.LEATHER_HELMET, Color.fromRGB(28, 25, 112), "&5&lЭндер-шлем", "", "&a&oИногда здесь, иногда там!");
    public static final SlimefunItemStack ENDER_CHESTPLATE = new SlimefunItemStack("ENDER_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.fromRGB(28, 25, 112), "&5&lЭндер-нагрудник", "", "&a&oИногда здесь, иногда там!");
    public static final SlimefunItemStack ENDER_LEGGINGS = new SlimefunItemStack("ENDER_LEGGINGS", Material.LEATHER_LEGGINGS, Color.fromRGB(28, 25, 112), "&5&lЭндер-поножи", "", "&a&oИногда здесь, иногда там!");
    public static final SlimefunItemStack ENDER_BOOTS = new SlimefunItemStack("ENDER_BOOTS", Material.LEATHER_BOOTS, Color.fromRGB(28, 25, 112), "&5&lЭндер-ботинки", "", "&a&oИногда здесь, иногда там!", "", "&9+ Защита от урона Эндер-жемчугом");

    public static final SlimefunItemStack SLIME_HELMET = new SlimefunItemStack("SLIME_HELMET", Material.LEATHER_HELMET, Color.LIME, "&a&lСлиезевый шлем", "", "&a&oХорошо отскакивает");
    public static final SlimefunItemStack SLIME_CHESTPLATE = new SlimefunItemStack("SLIME_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.LIME, "&a&lСлизевый нагрудник", "", "&a&oХорошо отскакивает");
    public static final SlimefunItemStack SLIME_LEGGINGS = new SlimefunItemStack("SLIME_LEGGINGS", Material.LEATHER_LEGGINGS, Color.LIME, "&a&lСлизевые поножи", "", "&a&oХорошо отскакивает", "", "&9+ Скорость");
    public static final SlimefunItemStack SLIME_BOOTS = new SlimefunItemStack("SLIME_BOOTS", Material.LEATHER_BOOTS, Color.LIME, "&a&lСвлизевые ботинки", "", "&a&oХорошо отскакивает", "", "&9+ Прыгучесть", "&9+ Защита от падения");

    public static final SlimefunItemStack CACTUS_HELMET = new SlimefunItemStack("CACTUS_HELMET", Material.LEATHER_HELMET, Color.GREEN, "&2Кактусовый шлем");
    public static final SlimefunItemStack CACTUS_CHESTPLATE = new SlimefunItemStack("CACTUS_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.GREEN, "&2Кактусовый нагрудник");
    public static final SlimefunItemStack CACTUS_LEGGINGS = new SlimefunItemStack("CACTUS_LEGGINGS", Material.LEATHER_LEGGINGS, Color.GREEN, "&2Кактусовые поножи");
    public static final SlimefunItemStack CACTUS_BOOTS = new SlimefunItemStack("CACTUS_BOOTS", Material.LEATHER_BOOTS, Color.GREEN, "&2Кактусовые ботинки");

    public static final SlimefunItemStack DAMASCUS_STEEL_HELMET = new SlimefunItemStack("DAMASCUS_STEEL_HELMET", Material.IRON_HELMET, "&7Шлем из дамасской стали");
    public static final SlimefunItemStack DAMASCUS_STEEL_CHESTPLATE = new SlimefunItemStack("DAMASCUS_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&7Нагрудник из дамасской стали");
    public static final SlimefunItemStack DAMASCUS_STEEL_LEGGINGS = new SlimefunItemStack("DAMASCUS_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&7Поножи из дамасской стали");
    public static final SlimefunItemStack DAMASCUS_STEEL_BOOTS = new SlimefunItemStack("DAMASCUS_STEEL_BOOTS", Material.IRON_BOOTS, "&7Ботинки из дамасской стали");

    public static final SlimefunItemStack REINFORCED_ALLOY_HELMET = new SlimefunItemStack("REINFORCED_ALLOY_HELMET", Material.IRON_HELMET, "&bАрмированный шлем");
    public static final SlimefunItemStack REINFORCED_ALLOY_CHESTPLATE = new SlimefunItemStack("REINFORCED_ALLOY_CHESTPLATE", Material.IRON_CHESTPLATE, "&bАрмированный нагрудник");
    public static final SlimefunItemStack REINFORCED_ALLOY_LEGGINGS = new SlimefunItemStack("REINFORCED_ALLOY_LEGGINGS", Material.IRON_LEGGINGS, "&bАрмированные поножи");
    public static final SlimefunItemStack REINFORCED_ALLOY_BOOTS = new SlimefunItemStack("REINFORCED_ALLOY_BOOTS", Material.IRON_BOOTS, "&bАрмированные ботинки");

    private static final List<String> hazmatLore = new ArrayList<>();

    static {
        hazmatLore.add("");
        hazmatLore.add(ChatColor.GOLD + "Эффекты полного комплекта:");
        hazmatLore.add(ChatColor.YELLOW + "- Иммунитет к радиации");

        if (Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_15)) {
            hazmatLore.add(ChatColor.YELLOW + "- Защита от укусов пчёл");
        }
    }

    public static final SlimefunItemStack SCUBA_HELMET = new SlimefunItemStack("SCUBA_HELMET", Material.LEATHER_HELMET, Color.ORANGE, "&cШлем-акваланг", "", "&7Позволяет дышать под водой");
    public static final SlimefunItemStack HAZMAT_CHESTPLATE = new SlimefunItemStack("HAZMAT_CHESTPLATE", Material.LEATHER_CHESTPLATE, Color.ORANGE, "&cЗащитная куртка", "", "&7Защищает от огня и лавы");
    public static final SlimefunItemStack HAZMAT_LEGGINGS = new SlimefunItemStack("HAZMAT_LEGGINGS", Material.LEATHER_LEGGINGS, Color.ORANGE, "&cЗащитные штаны", hazmatLore.toArray(new String[0]));
    public static final SlimefunItemStack HAZMAT_BOOTS = new SlimefunItemStack("RUBBER_BOOTS", Material.LEATHER_BOOTS, Color.BLACK, "&cРезиновые сапоги", hazmatLore.toArray(new String[0]));

    static {
        ItemMeta helmetMeta = SCUBA_HELMET.getItemMeta();
        List<String> helmetLore = helmetMeta.getLore();
        helmetLore.addAll(hazmatLore);
        helmetMeta.setLore(helmetLore);
        SCUBA_HELMET.setItemMeta(helmetMeta);

        ItemMeta chestplateMeta = HAZMAT_CHESTPLATE.getItemMeta();
        List<String> chestplateLore = chestplateMeta.getLore();
        chestplateLore.addAll(hazmatLore);
        chestplateMeta.setLore(chestplateLore);
        HAZMAT_CHESTPLATE.setItemMeta(chestplateMeta);
    }

    public static final SlimefunItemStack GILDED_IRON_HELMET = new SlimefunItemStack("GILDED_IRON_HELMET", Material.GOLDEN_HELMET, "&6Позолоченный железный шлем");
    public static final SlimefunItemStack GILDED_IRON_CHESTPLATE = new SlimefunItemStack("GILDED_IRON_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Позолоченный железный нагрудник");
    public static final SlimefunItemStack GILDED_IRON_LEGGINGS = new SlimefunItemStack("GILDED_IRON_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Позолоченные железные поножи");
    public static final SlimefunItemStack GILDED_IRON_BOOTS = new SlimefunItemStack("GILDED_IRON_BOOTS", Material.GOLDEN_BOOTS, "&6Позолоченные железные ботинки");

    public static final SlimefunItemStack GOLDEN_HELMET_12K = new SlimefunItemStack("GOLD_12K_HELMET", Material.GOLDEN_HELMET, "&6Золотой шлем &7(12 Карат)");
    public static final SlimefunItemStack GOLDEN_CHESTPLATE_12K = new SlimefunItemStack("GOLD_12K_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&6Золотой нагрудник &7(12 Карат)");
    public static final SlimefunItemStack GOLDEN_LEGGINGS_12K = new SlimefunItemStack("GOLD_12K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&6Золотые поножи &7(12 Карат)");
    public static final SlimefunItemStack GOLDEN_BOOTS_12K = new SlimefunItemStack("GOLD_12K_BOOTS", Material.GOLDEN_BOOTS, "&6Золотые ботинки &7(12 Карат)");

    public static final SlimefunItemStack SLIME_HELMET_STEEL = new SlimefunItemStack("SLIME_STEEL_HELMET", Material.IRON_HELMET, "&a&lСлиезевый шлем", "&7&oУсиленный", "", "&a&oХорошо отскакивает");
    public static final SlimefunItemStack SLIME_CHESTPLATE_STEEL = new SlimefunItemStack("SLIME_STEEL_CHESTPLATE", Material.IRON_CHESTPLATE, "&a&lСлиезевый нагрудник", "&7&oУсиленный", "", "&a&oХорошо отскакивает");
    public static final SlimefunItemStack SLIME_LEGGINGS_STEEL = new SlimefunItemStack("SLIME_STEEL_LEGGINGS", Material.IRON_LEGGINGS, "&a&lСлиезевые поножи", "&7&oУсиленные", "", "&a&oХорошо отскакивает", "", "&9+ Скорость");
    public static final SlimefunItemStack SLIME_BOOTS_STEEL = new SlimefunItemStack("SLIME_STEEL_BOOTS", Material.IRON_BOOTS, "&a&lСлиезевые ботинки", "&7&oУсиленные", "", "&a&oХорошо отскакивает", "", "&9+ Прыгучесть", "&9+ Защита от падения");

    public static final SlimefunItemStack BOOTS_OF_THE_STOMPER = new SlimefunItemStack("BOOTS_OF_THE_STOMPER", Material.LEATHER_BOOTS, Color.AQUA, "&bСапоги стражника", MelonUtils.splitLore("", "&9Урон от падения будет нанесён всем врагам поблизости", "", "&9+ Защита от падения"));

    public static final SlimefunItemStack BEE_HELMET = new SlimefunItemStack("BEE_HELMET", Material.GOLDEN_HELMET, "&e&lПчелиный шлем", " ", "&fБззззззз");
    public static final SlimefunItemStack BEE_WINGS = new SlimefunItemStack("BEE_WINGS", Material.ELYTRA, "&e&lПчелиные крылья", MelonUtils.splitLore("", "&fБззззззз", "", "&9Замедляет падение, когда ты приближаешься к земле"));
    public static final SlimefunItemStack BEE_LEGGINGS = new SlimefunItemStack("BEE_LEGGINGS", Material.GOLDEN_LEGGINGS, "&e&lПчелиные поножи", " ", "&fБззззззз");
    public static final SlimefunItemStack BEE_BOOTS = new SlimefunItemStack("BEE_BOOTS", Material.GOLDEN_BOOTS, "&e&lПчелиные ботинки", "", "&fБззззззз", "", "&9+ Прыгучесть", "&9+ Защита от падения");

    static {
        Map<Enchantment, Integer> cactusEnchs = new HashMap<>();
        cactusEnchs.put(Enchantment.THORNS, 3);
        cactusEnchs.put(Enchantment.DURABILITY, 6);

        CACTUS_HELMET.addUnsafeEnchantments(cactusEnchs);
        CACTUS_CHESTPLATE.addUnsafeEnchantments(cactusEnchs);
        CACTUS_LEGGINGS.addUnsafeEnchantments(cactusEnchs);
        CACTUS_BOOTS.addUnsafeEnchantments(cactusEnchs);

        Map<Enchantment, Integer> damascusEnchs = new HashMap<>();
        damascusEnchs.put(Enchantment.DURABILITY, 5);
        damascusEnchs.put(Enchantment.PROTECTION_ENVIRONMENTAL, 5);

        DAMASCUS_STEEL_HELMET.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_CHESTPLATE.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_LEGGINGS.addUnsafeEnchantments(damascusEnchs);
        DAMASCUS_STEEL_BOOTS.addUnsafeEnchantments(damascusEnchs);

        Map<Enchantment, Integer> reinforcedEnchs = new HashMap<>();
        reinforcedEnchs.put(Enchantment.DURABILITY, 9);
        reinforcedEnchs.put(Enchantment.PROTECTION_ENVIRONMENTAL, 9);

        REINFORCED_ALLOY_HELMET.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_CHESTPLATE.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_LEGGINGS.addUnsafeEnchantments(reinforcedEnchs);
        REINFORCED_ALLOY_BOOTS.addUnsafeEnchantments(reinforcedEnchs);

        Map<Enchantment, Integer> gildedEnchs = new HashMap<>();
        gildedEnchs.put(Enchantment.DURABILITY, 6);
        gildedEnchs.put(Enchantment.PROTECTION_ENVIRONMENTAL, 8);

        GILDED_IRON_HELMET.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_CHESTPLATE.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_LEGGINGS.addUnsafeEnchantments(gildedEnchs);
        GILDED_IRON_BOOTS.addUnsafeEnchantments(gildedEnchs);

        GOLDEN_HELMET_12K.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        GOLDEN_CHESTPLATE_12K.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        GOLDEN_LEGGINGS_12K.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        GOLDEN_BOOTS_12K.addUnsafeEnchantment(Enchantment.DURABILITY, 10);

        Map<Enchantment, Integer> slimeEnchs = new HashMap<>();
        slimeEnchs.put(Enchantment.DURABILITY, 4);
        slimeEnchs.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        SLIME_HELMET_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_CHESTPLATE_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_LEGGINGS_STEEL.addUnsafeEnchantments(slimeEnchs);
        SLIME_BOOTS_STEEL.addUnsafeEnchantments(slimeEnchs);

        Map<Enchantment, Integer> beeEnchs = new HashMap<>();
        beeEnchs.put(Enchantment.DURABILITY, 4);
        beeEnchs.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        BEE_HELMET.addUnsafeEnchantments(beeEnchs);
        BEE_WINGS.addUnsafeEnchantments(beeEnchs);
        BEE_LEGGINGS.addUnsafeEnchantments(beeEnchs);
        BEE_BOOTS.addUnsafeEnchantments(beeEnchs);
    }

    /* Magical components */
    public static final SlimefunItemStack MAGIC_LUMP_1 = new SlimefunItemStack("MAGIC_LUMP_1", Material.GOLD_NUGGET, "&6Волшебный кусочек &7- &eI", "", "&c&oЭтап: I");
    public static final SlimefunItemStack MAGIC_LUMP_2 = new SlimefunItemStack("MAGIC_LUMP_2", Material.GOLD_NUGGET, "&6Волшебный кусочек &7- &eII", "", "&c&oЭтап: II");
    public static final SlimefunItemStack MAGIC_LUMP_3 = new SlimefunItemStack("MAGIC_LUMP_3", Material.GOLD_NUGGET, "&6Волшебный кусочек &7- &eIII", "", "&c&oЭтап: III");
    public static final SlimefunItemStack ENDER_LUMP_1 = new SlimefunItemStack("ENDER_LUMP_1", Material.GOLD_NUGGET, "&5Эндер-кусочек &7- &eI", "", "&c&oЭтап: I");
    public static final SlimefunItemStack ENDER_LUMP_2 = new SlimefunItemStack("ENDER_LUMP_2", Material.GOLD_NUGGET, "&5Эндер-кусочек &7- &eII", "", "&c&oЭтап: II");
    public static final SlimefunItemStack ENDER_LUMP_3 = new SlimefunItemStack("ENDER_LUMP_3", Material.GOLD_NUGGET, "&5Эндер-кусочек &7- &eIII", "", "&c&oЭтап: III");
    public static final SlimefunItemStack MAGICAL_BOOK_COVER = new SlimefunItemStack("MAGICAL_BOOK_COVER", Material.PAPER, "&6Обложка волшебной книги", MelonUtils.splitLore("", "&a&oИспользуется для создания волшебных книг"));
    public static final SlimefunItemStack MAGICAL_GLASS = new SlimefunItemStack("MAGICAL_GLASS", Material.GLASS_PANE, "&6Волшебное стекло", MelonUtils.splitLore("", "&a&oИспользуется для создания магических гаджетов"));
    public static final SlimefunItemStack SYNTHETIC_SHULKER_SHELL = new SlimefunItemStack("SYNTHETIC_SHULKER_SHELL", Material.SHULKER_SHELL, "&dСинтетический панцирь шалкера", MelonUtils.splitLore("", "&fМожет быть использован как обычный панцирь шалкера"));

    /* Technical components */
    public static final SlimefunItemStack BASIC_CIRCUIT_BOARD = new SlimefunItemStack("BASIC_CIRCUIT_BOARD", Material.ACTIVATOR_RAIL, "&bБазовая печатная плата");
    public static final SlimefunItemStack ADVANCED_CIRCUIT_BOARD = new SlimefunItemStack("ADVANCED_CIRCUIT_BOARD", Material.POWERED_RAIL, "&bУлучшенная печатная плата");
    public static final SlimefunItemStack WHEAT_FLOUR = new SlimefunItemStack("WHEAT_FLOUR", Material.SUGAR, "&fПшеничная мука");
    public static final SlimefunItemStack STEEL_PLATE = new SlimefunItemStack("STEEL_PLATE", Material.PAPER, "&7&lСтальная пластина");
    public static final SlimefunItemStack BATTERY = new SlimefunItemStack("BATTERY", HeadTexture.BATTERY, "&6Аккумулятор");
    public static final SlimefunItemStack CARBON = new SlimefunItemStack("CARBON", HeadTexture.CARBON, "&eУглеволокно");
    public static final SlimefunItemStack COMPRESSED_CARBON = new SlimefunItemStack("COMPRESSED_CARBON", HeadTexture.COMPRESSED_CARBON, "&cУглеткань");
    public static final SlimefunItemStack CARBON_CHUNK = new SlimefunItemStack("CARBON_CHUNK", HeadTexture.COMPRESSED_CARBON, "&4Углепластик");
    public static final SlimefunItemStack STEEL_THRUSTER = new SlimefunItemStack("STEEL_THRUSTER", Material.BUCKET, "&7&lСтальной двигатель");
    public static final SlimefunItemStack POWER_CRYSTAL = new SlimefunItemStack("POWER_CRYSTAL", HeadTexture.POWER_CRYSTAL, "&c&lКристалл силы");
    public static final SlimefunItemStack CHAIN = new SlimefunItemStack("CHAIN", Material.STRING, "&bЦепь");
    public static final SlimefunItemStack HOOK = new SlimefunItemStack("HOOK", Material.FLINT, "&bКрюк");
    public static final SlimefunItemStack SIFTED_ORE = new SlimefunItemStack("SIFTED_ORE", Material.GUNPOWDER, "&6Просеянная руда");
    public static final SlimefunItemStack STONE_CHUNK = new SlimefunItemStack("STONE_CHUNK", HeadTexture.STONE_CHUNK, "&6Каменный кусок");
    public static final SlimefunItemStack LAVA_CRYSTAL = new SlimefunItemStack("LAVA_CRYSTAL", HeadTexture.LAVA_CRYSTAL, "&4Кристалл лавы");
    public static final SlimefunItemStack SALT = new SlimefunItemStack("SALT", Material.SUGAR, "&fСоль");
    public static final SlimefunItemStack CHEESE = new SlimefunItemStack("CHEESE", HeadTexture.CHEESE, "&fСыр");
    public static final SlimefunItemStack BUTTER = new SlimefunItemStack("BUTTER", HeadTexture.BUTTER, "&fМасло");
    public static final SlimefunItemStack DUCT_TAPE = new SlimefunItemStack("DUCT_TAPE", HeadTexture.DUCT_TAPE, "&8Скотч", MelonUtils.splitLore("", "&fПочинит любой предмет в Автоматической наковальне"));
    public static final SlimefunItemStack HEAVY_CREAM = new SlimefunItemStack("HEAVY_CREAM", Material.SNOWBALL, "&fВзбитые сливки");
    public static final SlimefunItemStack CRUSHED_ORE = new SlimefunItemStack("CRUSHED_ORE", Material.GUNPOWDER, "&6Дробленая руда");
    public static final SlimefunItemStack PULVERIZED_ORE = new SlimefunItemStack("PULVERIZED_ORE", Material.GUNPOWDER, "&6Пылевидная руда");
    public static final SlimefunItemStack PURE_ORE_CLUSTER = new SlimefunItemStack("PURE_ORE_CLUSTER", Material.GUNPOWDER, "&6Очищенная руда");
    public static final SlimefunItemStack SMALL_URANIUM = new SlimefunItemStack("SMALL_URANIUM", HeadTexture.URANIUM, "&cНебольшой кусок урана", "", LoreBuilder.radioactive(Radioactivity.MODERATE), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack TINY_URANIUM = new SlimefunItemStack("TINY_URANIUM", HeadTexture.URANIUM, "&cКрошечная кусочек урана", "", LoreBuilder.radioactive(Radioactivity.LOW));
    public static final SlimefunItemStack SOLAR_PANEL = new SlimefunItemStack("SOLAR_PANEL", Material.DAYLIGHT_DETECTOR, "&9Фотоэлектрическая ячейка", MelonUtils.splitLore("", "&7Важный компонент для создания &bСолнечного генератора"));
    public static final SlimefunItemStack PLASTIC_SHEET = new SlimefunItemStack("PLASTIC_SHEET", Material.PAPER, "&fЛист пластика");

    public static final SlimefunItemStack MAGNET = new SlimefunItemStack("MAGNET", HeadTexture.MAGNET, "&cМагнит");
    public static final SlimefunItemStack NECROTIC_SKULL = new SlimefunItemStack("NECROTIC_SKULL", HeadTexture.NECROTIC_SKULL, "&cНекротический череп");
    public static final SlimefunItemStack ESSENCE_OF_AFTERLIFE = new SlimefunItemStack("ESSENCE_OF_AFTERLIFE", Material.GUNPOWDER, "&4Эссенция загробной жизни");
    public static final SlimefunItemStack STRANGE_NETHER_GOO = new SlimefunItemStack("STRANGE_NETHER_GOO", Material.PURPLE_DYE, "&5Странная слизь Незера", MelonUtils.splitLore("", "&fСтранная биологическая материя, которую можно выторговать у Пиглинов"));
    public static final SlimefunItemStack ELECTRO_MAGNET = new SlimefunItemStack("ELECTRO_MAGNET", HeadTexture.MAGNET, "&cЭлектромагнит");
    public static final SlimefunItemStack HEATING_COIL = new SlimefunItemStack("HEATING_COIL", HeadTexture.HEATING_COIL, "&cНагревательная спираль");
    public static final SlimefunItemStack COOLING_UNIT = new SlimefunItemStack("COOLING_UNIT", HeadTexture.COOLING_UNIT, "&bБлок охлаждения");
    public static final SlimefunItemStack ELECTRIC_MOTOR = new SlimefunItemStack("ELECTRIC_MOTOR", HeadTexture.MOTOR, "&cЭлектромотор");
    public static final SlimefunItemStack CARGO_MOTOR = new SlimefunItemStack("CARGO_MOTOR", HeadTexture.CARGO_MOTOR, "&3Грузовой двигатель", MelonUtils.splitLore("", "&7Важный ингредиент для предметов, связанных с управлением грузом"));
    public static final SlimefunItemStack SCROLL_OF_DIMENSIONAL_TELEPOSITION = new SlimefunItemStack("SCROLL_OF_DIMENSIONAL_TELEPOSITION", Material.PAPER, "&6Свиток пространственной телепозиции", MelonUtils.splitLore("", "&cЭтот свиток временно создаёт небольшую Чёрную дыру, которая пульсирует и засасывает ближайшие сущности в себя и помещает их в параллельное измерение, где всё повёрнуто наоборот", "", "&fДругими словами: Разворачивает цель на 180 градусов"));
    public static final SlimefunItemStack TOME_OF_KNOWLEDGE_SHARING = new SlimefunItemStack("TOME_OF_KNOWLEDGE_SHARING", Material.ENCHANTED_BOOK, "&6Фолиант обмена знаниями", MelonUtils.splitLore("&7Автор: &bОтсутствует", "", "&eПКМ&7 - записать свои знания", "", "", "&eПКМ&7: Получить все исследования от предыдущего автора"));
    public static final SlimefunItemStack HARDENED_GLASS = new SlimefunItemStack("HARDENED_GLASS", Material.LIGHT_GRAY_STAINED_GLASS, "&7Закаленное стекло", "", "&fВыдерживает взрывы");
    public static final SlimefunItemStack WITHER_PROOF_OBSIDIAN = new SlimefunItemStack("WITHER_PROOF_OBSIDIAN", Material.OBSIDIAN, "&5Иссушениестойкий обсидиан", "", "&fВыдерживает взрывы", "&fВыдерживает взрывы Визеров");
    public static final SlimefunItemStack WITHER_PROOF_GLASS = new SlimefunItemStack("WITHER_PROOF_GLASS", Material.PURPLE_STAINED_GLASS, "&5Иссушениестойкое стекло", "", "&fВыдерживает взрывы", "&fВыдерживает взрывы Визеров");
    public static final SlimefunItemStack REINFORCED_PLATE = new SlimefunItemStack("REINFORCED_PLATE", Material.PAPER, "&7Армированная пластина");
    public static final SlimefunItemStack ANCIENT_PEDESTAL = new SlimefunItemStack("ANCIENT_PEDESTAL", Material.DISPENSER, "&dДревний пьедестал", "", "&5Часть древнего алтаря");
    public static final SlimefunItemStack ANCIENT_ALTAR = new SlimefunItemStack("ANCIENT_ALTAR", Material.ENCHANTING_TABLE, "&dДревний алтарь", "", "&5Постройка для магического крафта");
    public static final SlimefunItemStack COPPER_WIRE = new SlimefunItemStack("COPPER_WIRE", Material.STRING, "&6Медный провод", "", "&6Важнейший компонент в", "&6электрических модулях", "", "&7&oПритягивает бомжей...");
    public static final SlimefunItemStack CRAFTING_MOTOR = new SlimefunItemStack("CRAFTING_MOTOR", HeadTexture.CRAFTING_MOTOR, "&6Мотор Крафта", "", "&7Важный компонент авто-верстака");

    /* Rainbow blocks */
    private static final String RAINBOW = "&dПереливается всеми цветами радуги!";
    public static final SlimefunItemStack RAINBOW_WOOL = new SlimefunItemStack("RAINBOW_WOOL", Material.WHITE_WOOL, "&5Радужная шерсть", "", RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS = new SlimefunItemStack("RAINBOW_GLASS", Material.WHITE_STAINED_GLASS, "&5Радужное стекло", "", RAINBOW);
    public static final SlimefunItemStack RAINBOW_CLAY = new SlimefunItemStack("RAINBOW_CLAY", Material.WHITE_TERRACOTTA, "&5Радужная глина", "", RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE = new SlimefunItemStack("RAINBOW_GLASS_PANE", Material.WHITE_STAINED_GLASS_PANE, "&5Радужная стеклянная панель", "", RAINBOW);
    public static final SlimefunItemStack RAINBOW_CONCRETE = new SlimefunItemStack("RAINBOW_CONCRETE", Material.WHITE_CONCRETE, "&5Радужный бетон", "", RAINBOW);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA = new SlimefunItemStack("RAINBOW_GLAZED_TERRACOTTA", Material.WHITE_GLAZED_TERRACOTTA, "&5Радужная глазурованная керамика", "", RAINBOW);

    /* Seasonal */
    private static final String CHRISTMAS = ChatUtils.christmas("[Рождество]");
    public static final SlimefunItemStack RAINBOW_WOOL_XMAS = new SlimefunItemStack("RAINBOW_WOOL_XMAS", Material.WHITE_WOOL, "&5Радужная Шерсть &7(Рождество)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_XMAS = new SlimefunItemStack("RAINBOW_GLASS_XMAS", Material.WHITE_STAINED_GLASS, "&5Радужное стекло &7(Рождество)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CLAY_XMAS = new SlimefunItemStack("RAINBOW_CLAY_XMAS", Material.WHITE_TERRACOTTA, "&5Радужная глина &7(Рождество)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_XMAS = new SlimefunItemStack("RAINBOW_GLASS_PANE_XMAS", Material.WHITE_STAINED_GLASS_PANE, "&5Радужная стеклянная панель &7(Рождество)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_CONCRETE_XMAS = new SlimefunItemStack("RAINBOW_CONCRETE_XMAS", Material.WHITE_CONCRETE, "&5Радужный бетон &7(Рождество)", "", CHRISTMAS);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_XMAS = new SlimefunItemStack("RAINBOW_GLAZED_TERRACOTTA_XMAS", Material.WHITE_GLAZED_TERRACOTTA, "&5Радужная глазурованная керамика &7(Рождество)", "", CHRISTMAS);

    private static final String VALENTINES_DAY = "&5[&dДень Святого Валентина&5]";
    public static final SlimefunItemStack RAINBOW_WOOL_VALENTINE = new SlimefunItemStack("RAINBOW_WOOL_VALENTINE", Material.PINK_WOOL, "&5Радужная Шерсть &7(День Святого Валентина)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_VALENTINE = new SlimefunItemStack("RAINBOW_GLASS_VALENTINE", Material.PINK_STAINED_GLASS, "&5Радужное стекло &7(День Святого Валентина)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CLAY_VALENTINE = new SlimefunItemStack("RAINBOW_CLAY_VALENTINE", Material.PINK_TERRACOTTA, "&5Радужная глина &7(День Святого Валентина)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_VALENTINE = new SlimefunItemStack("RAINBOW_GLASS_PANE_VALENTINE", Material.PINK_STAINED_GLASS_PANE, "&5Радужная стеклянная панель &7(День Святого Валентина)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_CONCRETE_VALENTINE = new SlimefunItemStack("RAINBOW_CONCRETE_VALENTINE", Material.PINK_CONCRETE, "&5Радужный бетон &7(День Святого Валентина)", "", VALENTINES_DAY);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_VALENTINE = new SlimefunItemStack("RAINBOW_GLAZED_TERRACOTTA_VALENTINE", Material.PINK_GLAZED_TERRACOTTA, "&5Радужная глазурованная керамика &7(День Святого Валентина)", "", VALENTINES_DAY);

    private static final String HALLOWEEN = "&c[&6Хэллоуин&c]";
    public static final SlimefunItemStack RAINBOW_WOOL_HALLOWEEN = new SlimefunItemStack("RAINBOW_WOOL_HALLOWEEN", Material.ORANGE_WOOL, "&5Радужная Шерсть &7(Хэллоуин)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_HALLOWEEN = new SlimefunItemStack("RAINBOW_GLASS_HALLOWEEN", Material.ORANGE_STAINED_GLASS, "&5Радужное стекло &7(Хэллоуин)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CLAY_HALLOWEEN = new SlimefunItemStack("RAINBOW_CLAY_HALLOWEEN", Material.ORANGE_TERRACOTTA, "&5Радужная глина &7(Хэллоуин)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLASS_PANE_HALLOWEEN = new SlimefunItemStack("RAINBOW_GLASS_PANE_HALLOWEEN", Material.ORANGE_STAINED_GLASS_PANE, "&5Радужная стеклянная панель &7(Хэллоуин)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_CONCRETE_HALLOWEEN = new SlimefunItemStack("RAINBOW_CONCRETE_HALLOWEEN", Material.ORANGE_CONCRETE, "&5Радужный бетон &7(Хэллоуин)", "", HALLOWEEN);
    public static final SlimefunItemStack RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN = new SlimefunItemStack("RAINBOW_GLAZED_TERRACOTTA_HALLOWEEN", Material.ORANGE_GLAZED_TERRACOTTA, "&5Радужная глазурованная керамика &7(Хэллоуин)", "", HALLOWEEN);

    /* Ingots */
    public static final SlimefunItemStack COPPER_INGOT = new SlimefunItemStack("COPPER_INGOT", Material.BRICK, "&bМедный слиток");
    public static final SlimefunItemStack TIN_INGOT = new SlimefunItemStack("TIN_INGOT", Material.IRON_INGOT, "&bОловянный слиток");
    public static final SlimefunItemStack SILVER_INGOT = new SlimefunItemStack("SILVER_INGOT", Material.IRON_INGOT, "&bСеребряный слиток");
    public static final SlimefunItemStack ALUMINUM_INGOT = new SlimefunItemStack("ALUMINUM_INGOT", Material.IRON_INGOT, "&bАлюминиевый слиток");
    public static final SlimefunItemStack LEAD_INGOT = new SlimefunItemStack("LEAD_INGOT", Material.IRON_INGOT, "&bСвинцовый слиток");
    public static final SlimefunItemStack ZINC_INGOT = new SlimefunItemStack("ZINC_INGOT", Material.IRON_INGOT, "&bЦинковый слиток");
    public static final SlimefunItemStack MAGNESIUM_INGOT = new SlimefunItemStack("MAGNESIUM_INGOT", Material.IRON_INGOT, "&bМагниевый слиток");

    /* Alloy (Carbon + Iron) */
    public static final SlimefunItemStack STEEL_INGOT = new SlimefunItemStack("STEEL_INGOT", Material.IRON_INGOT, "&bСтальной слиток");
    /* Alloy (Copper + Tin) */
    public static final SlimefunItemStack BRONZE_INGOT = new SlimefunItemStack("BRONZE_INGOT", Material.BRICK, "&bБронзовый слиток");
    /* Alloy (Copper + Aluminum) */
    public static final SlimefunItemStack DURALUMIN_INGOT = new SlimefunItemStack("DURALUMIN_INGOT", Material.IRON_INGOT, "&bДюралюминиевый слиток");
    /* Alloy (Copper + Silver) */
    public static final SlimefunItemStack BILLON_INGOT = new SlimefunItemStack("BILLON_INGOT", Material.IRON_INGOT, "&bБилонный слиток");
    /* Alloy (Copper + Zinc) */
    public static final SlimefunItemStack BRASS_INGOT = new SlimefunItemStack("BRASS_INGOT", Material.GOLD_INGOT, "&bЛатунный слиток");
    /* Alloy (Aluminum + Brass) */
    public static final SlimefunItemStack ALUMINUM_BRASS_INGOT = new SlimefunItemStack("ALUMINUM_BRASS_INGOT", Material.GOLD_INGOT, "&bАлюминиево-латунный слиток");
    /* Alloy (Aluminum + Bronze) */
    public static final SlimefunItemStack ALUMINUM_BRONZE_INGOT = new SlimefunItemStack("ALUMINUM_BRONZE_INGOT", Material.GOLD_INGOT, "&bСлиток алюминиевой бронзы");
    /* Alloy (Gold + Silver + Copper) */
    public static final SlimefunItemStack CORINTHIAN_BRONZE_INGOT = new SlimefunItemStack("CORINTHIAN_BRONZE_INGOT", Material.GOLD_INGOT, "&bКоринфский бронзовый слиток");
    /* Alloy (Lead + Tin) */
    public static final SlimefunItemStack SOLDER_INGOT = new SlimefunItemStack("SOLDER_INGOT", Material.IRON_INGOT, "&bСлиток припоя");
    /* Alloy (Steel + Iron + Carbon) */
    public static final SlimefunItemStack DAMASCUS_STEEL_INGOT = new SlimefunItemStack("DAMASCUS_STEEL_INGOT", Material.IRON_INGOT, "&bСлиток дамасской стали");
    /* Alloy (Damascus Steel + Duralumin + Compressed Carbon + Aluminium Bronze) */
    public static final SlimefunItemStack HARDENED_METAL_INGOT = new SlimefunItemStack("HARDENED_METAL_INGOT", Material.IRON_INGOT, "&b&lЗакаленная сталь");
    /* Alloy (Hardened Metal + Corinthian Bronze + Solder + Billon + Damascus Steel) */
    public static final SlimefunItemStack REINFORCED_ALLOY_INGOT = new SlimefunItemStack("REINFORCED_ALLOY_INGOT", Material.IRON_INGOT, "&b&lСлиток армированного сплава");
    /* Alloy (Iron + Silicon) */
    public static final SlimefunItemStack FERROSILICON = new SlimefunItemStack("FERROSILICON", Material.IRON_INGOT, "&bФерросилиций");
    /* Alloy (Iron + Gold) */
    public static final SlimefunItemStack GILDED_IRON = new SlimefunItemStack("GILDED_IRON", Material.GOLD_INGOT, "&6&lПозолоченное железо");
    /* Alloy (Redston + Ferrosilicon) */
    public static final SlimefunItemStack REDSTONE_ALLOY = new SlimefunItemStack("REDSTONE_ALLOY", Material.BRICK, "&cСлиток сплава красного камня");
    /* Alloy (Iron + Copper) */
    public static final SlimefunItemStack NICKEL_INGOT = new SlimefunItemStack("NICKEL_INGOT", Material.IRON_INGOT, "&bНикелевый слиток");
    /* Alloy (Nickel + Iron + Copper) */
    public static final SlimefunItemStack COBALT_INGOT = new SlimefunItemStack("COBALT_INGOT", Material.IRON_INGOT, "&9Кобальтовый слиток");

    /* Gold */
    public static final SlimefunItemStack GOLD_4K = new SlimefunItemStack("GOLD_4K", Material.GOLD_INGOT, "&fЗолотой слиток &7(4 Карата)");
    public static final SlimefunItemStack GOLD_6K = new SlimefunItemStack("GOLD_6K", Material.GOLD_INGOT, "&fЗолотой слиток &7(6 Карат)");
    public static final SlimefunItemStack GOLD_8K = new SlimefunItemStack("GOLD_8K", Material.GOLD_INGOT, "&fЗолотой слиток &7(8 Карат)");
    public static final SlimefunItemStack GOLD_10K = new SlimefunItemStack("GOLD_10K", Material.GOLD_INGOT, "&fЗолотой слиток &7(10 Карат)");
    public static final SlimefunItemStack GOLD_12K = new SlimefunItemStack("GOLD_12K", Material.GOLD_INGOT, "&fЗолотой слиток &7(12 Карат)");
    public static final SlimefunItemStack GOLD_14K = new SlimefunItemStack("GOLD_14K", Material.GOLD_INGOT, "&fЗолотой слиток &7(14 Карат)");
    public static final SlimefunItemStack GOLD_16K = new SlimefunItemStack("GOLD_16K", Material.GOLD_INGOT, "&fЗолотой слиток &7(16 Карат)");
    public static final SlimefunItemStack GOLD_18K = new SlimefunItemStack("GOLD_18K", Material.GOLD_INGOT, "&fЗолотой слиток &7(18 Карат)");
    public static final SlimefunItemStack GOLD_20K = new SlimefunItemStack("GOLD_20K", Material.GOLD_INGOT, "&fЗолотой слиток &7(20 Карат)");
    public static final SlimefunItemStack GOLD_22K = new SlimefunItemStack("GOLD_22K", Material.GOLD_INGOT, "&fЗолотой слиток &7(22 Карата)");
    public static final SlimefunItemStack GOLD_24K = new SlimefunItemStack("GOLD_24K", Material.GOLD_INGOT, "&fЗолотой слиток &7(24 Карата)");

    /* Dusts */
    public static final SlimefunItemStack IRON_DUST = new SlimefunItemStack("IRON_DUST", Material.GUNPOWDER, "&6Железная пыль");
    public static final SlimefunItemStack GOLD_DUST = new SlimefunItemStack("GOLD_DUST", Material.GLOWSTONE_DUST, "&6Золотая пыль");
    public static final SlimefunItemStack TIN_DUST = new SlimefunItemStack("TIN_DUST", Material.SUGAR, "&6Оловянная пыль");
    public static final SlimefunItemStack COPPER_DUST = new SlimefunItemStack("COPPER_DUST", Material.GLOWSTONE_DUST, "&6Медная пыль");
    public static final SlimefunItemStack SILVER_DUST = new SlimefunItemStack("SILVER_DUST", Material.SUGAR, "&6Серебряная пыль");
    public static final SlimefunItemStack ALUMINUM_DUST = new SlimefunItemStack("ALUMINUM_DUST", Material.SUGAR, "&6Алюминиевая пыль");
    public static final SlimefunItemStack LEAD_DUST = new SlimefunItemStack("LEAD_DUST", Material.GUNPOWDER, "&6Свинцовая пыль");
    public static final SlimefunItemStack ZINC_DUST = new SlimefunItemStack("ZINC_DUST", Material.SUGAR, "&6Цинковая пыль");
    public static final SlimefunItemStack MAGNESIUM_DUST = new SlimefunItemStack("MAGNESIUM_DUST", Material.SUGAR, "&6Магний");

    public static final SlimefunItemStack SULFATE = new SlimefunItemStack("SULFATE", Material.GLOWSTONE_DUST, "&6Сульфат");
    public static final SlimefunItemStack SILICON = new SlimefunItemStack("SILICON", Material.FIREWORK_STAR, "&6Кремний");
    public static final SlimefunItemStack GOLD_24K_BLOCK = new SlimefunItemStack("GOLD_24K_BLOCK", Material.GOLD_BLOCK, "&fЗолотой блок &7(24 Карата)");

    /* Gems */
    public static final SlimefunItemStack SYNTHETIC_DIAMOND = new SlimefunItemStack("SYNTHETIC_DIAMOND", Material.DIAMOND, "&bСинтетический алмаз", MelonUtils.splitLore("", "&fМожет быть использован как обычный алмаз"));
    public static final SlimefunItemStack SYNTHETIC_EMERALD = new SlimefunItemStack("SYNTHETIC_EMERALD", Material.EMERALD, "&bСинтетический изумруд", MelonUtils.splitLore("", "&fМожет быть использован как обычный изумруд"));
    public static final SlimefunItemStack SYNTHETIC_SAPPHIRE = new SlimefunItemStack("SYNTHETIC_SAPPHIRE", HeadTexture.SAPPHIRE, "&bСинтетический сапфир", MelonUtils.splitLore("", "&fМожет быть использован как лазурит"));
    public static final SlimefunItemStack CARBONADO = new SlimefunItemStack("CARBONADO", HeadTexture.CARBONADO, "&b&lКарбонад", "", "&7&o\"Чёрный алмаз\"");
    public static final SlimefunItemStack RAW_CARBONADO = new SlimefunItemStack("RAW_CARBONADO", HeadTexture.RAW_CARBONADO, "&bСырой карбонад");

    public static final SlimefunItemStack URANIUM = new SlimefunItemStack("URANIUM", HeadTexture.URANIUM, "&4Уран", "", LoreBuilder.radioactive(Radioactivity.HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NEPTUNIUM = new SlimefunItemStack("NEPTUNIUM", HeadTexture.NEPTUNIUM, "&aНептуний", "", LoreBuilder.radioactive(Radioactivity.HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack PLUTONIUM = new SlimefunItemStack("PLUTONIUM", HeadTexture.PLUTONIUM, "&7Плутоний", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BOOSTED_URANIUM = new SlimefunItemStack("BOOSTED_URANIUM", HeadTexture.BOOSTED_URANIUM, "&2Обогащённый уран", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);

    /* Talisman */
    public static final SlimefunItemStack COMMON_TALISMAN = new SlimefunItemStack("COMMON_TALISMAN", Material.EMERALD, "&6Обычный талисман");
    public static final SlimefunItemStack ENDER_TALISMAN = new SlimefunItemStack("ENDER_TALISMAN", Material.EMERALD, "&5Эндер-талисман");

    public static final SlimefunItemStack TALISMAN_ANVIL = new SlimefunItemStack("ANVIL_TALISMAN", Material.EMERALD, "&aТалисман наковальни", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре предотвращает поломку одного инструмента, после чего исчезает", "", "&4&lВНИМАНИЕ:", "&4Талисман не работает со слишком мощными инструментами из-за их сложности"));
    public static final SlimefunItemStack TALISMAN_MINER = new SlimefunItemStack("MINER_TALISMAN", Material.EMERALD, "&aТалисман шахтёра", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 20% шанс удвоить любые добытые руды"));
    public static final SlimefunItemStack TALISMAN_FARMER = new SlimefunItemStack("FARMER_TALISMAN", Material.EMERALD, "&aТалисман фермера", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 20% шанс удвоить добытый урожай"));
    public static final SlimefunItemStack TALISMAN_HUNTER = new SlimefunItemStack("HUNTER_TALISMAN", Material.EMERALD, "&aТалисман охотника", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 20% шанс удвоить полученный дроп с мобов"));
    public static final SlimefunItemStack TALISMAN_LAVA = new SlimefunItemStack("LAVA_TALISMAN", Material.EMERALD, "&aТалисман лавы", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт Огнеупорность при соприкосновении с лавой, после чего талисман исчезает"));
    public static final SlimefunItemStack TALISMAN_WATER = new SlimefunItemStack("WATER_TALISMAN", Material.EMERALD, "&aТалисман воды", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даст возможность дышать под водой когда закончится воздух, после чего талисман исчезает"));
    public static final SlimefunItemStack TALISMAN_ANGEL = new SlimefunItemStack("ANGEL_TALISMAN", Material.EMERALD, "&aТалисман ангела", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 75% шанс поглотить урон от падения"));
    public static final SlimefunItemStack TALISMAN_FIRE = new SlimefunItemStack("FIRE_TALISMAN", Material.EMERALD, "&aТалисман огня", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт огнеупорность при контакте с огнём, после чего талисман исчезает"));
    public static final SlimefunItemStack TALISMAN_MAGICIAN = new SlimefunItemStack("MAGICIAN_TALISMAN", Material.EMERALD, "&aТалисман мага", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 80% к удаче при зачаровании", "Иногда будут появляться дополнительные зачарования"));
    public static final SlimefunItemStack TALISMAN_TRAVELLER = new SlimefunItemStack("TRAVELLER_TALISMAN", Material.EMERALD, "&aТалисман путешественника", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 60% шанс на значительное увеличение скорости при беге"));
    public static final SlimefunItemStack TALISMAN_WARRIOR = new SlimefunItemStack("WARRIOR_TALISMAN", Material.EMERALD, "&aТалисман воина", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт Силу III при получении урона, после чего талисман исчезает"));
    public static final SlimefunItemStack TALISMAN_KNIGHT = new SlimefunItemStack("KNIGHT_TALISMAN", Material.EMERALD, "&aТалисман рыцаря", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 30% шанс на Регенерацию в течение 5 секунд при получении урона, после чего талисман исчезает"));
    public static final SlimefunItemStack TALISMAN_WHIRLWIND = new SlimefunItemStack("WHIRLWIND_TALISMAN", Material.EMERALD, "&aТалисман вихря", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт возможность отразить 60% всех снарядов", "&e&oТрезубец может пробить эту защиту"));
    public static final SlimefunItemStack TALISMAN_WIZARD = new SlimefunItemStack("WIZARD_TALISMAN", Material.EMERALD, "&aТалисман чародея", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт возможность получить зачарования Удача IV или Удача V, уменьшая при этом уровень других зачарований"));
    public static final SlimefunItemStack TALISMAN_CAVEMAN = new SlimefunItemStack("CAVEMAN_TALISMAN", Material.EMERALD, "&aТалисман пещерного человека", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 50% шанс на Спешку III при добывании любой руды"));
    public static final SlimefunItemStack TALISMAN_WISE = new SlimefunItemStack("WISE_TALISMAN", Material.EMERALD, "&aТалисман мудрости", MelonUtils.splitLore("", "&fНаличие этого талисмана в инвентаре даёт 20% шанс удвоить полученный опыт"));

    /* Staves */
    public static final SlimefunItemStack STAFF_ELEMENTAL = new SlimefunItemStack("STAFF_ELEMENTAL", Material.STICK, "&6Посох элементаля");
    public static final SlimefunItemStack STAFF_WIND = new SlimefunItemStack("STAFF_ELEMENTAL_WIND", Material.STICK, "&6Посох элементаля &7- &b&oВетер", "", "&7Элемент: &b&oВетер", "", "&eПКМ&7: Толкнуть себя вперёд");
    public static final SlimefunItemStack STAFF_FIRE = new SlimefunItemStack("STAFF_ELEMENTAL_FIRE", Material.STICK, "&6Посох элементаля &7- &c&oОгонь", "", "&7Элемент: &c&oОгонь");
    public static final SlimefunItemStack STAFF_WATER = new SlimefunItemStack("STAFF_ELEMENTAL_WATER", Material.STICK, "&6Посох элементаля &7- &1&oВода", "", "&7Элемент: &1&oВода", "", "&eПКМ&7: Потушить себя");
    public static final SlimefunItemStack STAFF_STORM = new SlimefunItemStack("STAFF_ELEMENTAL_STORM", Material.STICK, "&6Посох элементаля &7- &8&oГроза", "", "&7Элемент: &8&oГроза", "", "&eПКМ&7: Вызвать молнию", LoreBuilder.usesLeft(StormStaff.MAX_USES));

    static {
        STAFF_WIND.addUnsafeEnchantment(Enchantment.LUCK, 1);
        STAFF_FIRE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);
        STAFF_WATER.addUnsafeEnchantment(Enchantment.WATER_WORKER, 1);
        STAFF_STORM.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
        for (SlimefunItemStack item : new SlimefunItemStack[]{STAFF_WIND, STAFF_FIRE, STAFF_WATER, STAFF_STORM}) {
            ItemMeta im = item.getItemMeta();
            im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            item.setItemMeta(im);
        }
    }

    /* Multiblocks */
    public static final SlimefunItemStack ENHANCED_CRAFTING_TABLE = new SlimefunItemStack("ENHANCED_CRAFTING_TABLE", Material.CRAFTING_TABLE, "&eУлучшенный верстак", MelonUtils.splitLore("", "&aОбычный верстак не в состоянии выдержать такое количество силы..."));
    public static final SlimefunItemStack GRIND_STONE = new SlimefunItemStack("GRIND_STONE", Material.DISPENSER, "&bЖёрнов", "", "&aПеремалывает предметы");
    public static final SlimefunItemStack ARMOR_FORGE = new SlimefunItemStack("ARMOR_FORGE", Material.ANVIL, "&6Конструктор доспехов", MelonUtils.splitLore("", "&aДаёт возможность создавать мощную броню"));
    public static final SlimefunItemStack MAKESHIFT_SMELTERY = new SlimefunItemStack("MAKESHIFT_SMELTERY", Material.BLAST_FURNACE, "&eСамодельная плавильня", MelonUtils.splitLore("", "&fИмпровизированный вариант Плавильни, который позволяет только выплавлять пыль в слитки"));
    public static final SlimefunItemStack SMELTERY = new SlimefunItemStack("SMELTERY", Material.FURNACE, "&6Плавильня", MelonUtils.splitLore("", "&fВысокотемпературная печь, позволяющая плавить пыль в слитки и создавать сплавы"));
    public static final SlimefunItemStack ORE_CRUSHER = new SlimefunItemStack("ORE_CRUSHER", Material.DISPENSER, "&bРудодробитель", "", "&aДробит руду, чтобы её удвоить");
    public static final SlimefunItemStack COMPRESSOR = new SlimefunItemStack("COMPRESSOR", Material.PISTON, "&bКомпрессор", "", "&aСжимает предметы");
    public static final SlimefunItemStack PRESSURE_CHAMBER = new SlimefunItemStack("PRESSURE_CHAMBER", Material.GLASS, "&bБарокамера", "", "&aСжимает предметы намного сильнее");
    public static final SlimefunItemStack MAGIC_WORKBENCH = new SlimefunItemStack("MAGIC_WORKBENCH", Material.CRAFTING_TABLE, "&6Волшебный верстак", MelonUtils.splitLore("", "&dНаполняет предметы магической энергией"));
    public static final SlimefunItemStack ORE_WASHER = new SlimefunItemStack("ORE_WASHER", Material.CAULDRON, "&6Рудопромывочная машина", MelonUtils.splitLore("", "&aПромывает просеянную руду, чтобы получить различные руды и камешки"));
    public static final SlimefunItemStack TABLE_SAW = new SlimefunItemStack("TABLE_SAW", Material.STONECUTTER, "&6Лесопилка", "", "&aИз 1 блока дерева получает 8 досок");
    public static final SlimefunItemStack JUICER = new SlimefunItemStack("JUICER", Material.GLASS_BOTTLE, "&aСоковыжималка", "", "&aДаёт возможность создавать вкусные соки");
    public static final SlimefunItemStack AUTOMATED_PANNING_MACHINE = new SlimefunItemStack("AUTOMATED_PANNING_MACHINE", Material.BOWL, "&eАвтоматическое сито", MelonUtils.splitLore("", "&fМашина для преобразования гравия и песка душ"));

    public static final SlimefunItemStack INDUSTRIAL_MINER = new SlimefunItemStack("INDUSTRIAL_MINER", Material.GOLDEN_PICKAXE, "&bЦифровой шахтёр", MelonUtils.splitLore("", "&fВыкапывает все руды в радиусе 7х7 блоков"));
    public static final SlimefunItemStack ADVANCED_INDUSTRIAL_MINER = new SlimefunItemStack("ADVANCED_INDUSTRIAL_MINER", Material.DIAMOND_PICKAXE, "&cУлучшенный цифровой шахтёр", MelonUtils.splitLore("", "&fВыкапывает все руды в радиусе 11х11 блоков", "Автоматически дробит руду", "", "&a+ Шёлковое касание"));

    static {
        ItemMeta meta = INDUSTRIAL_MINER.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        INDUSTRIAL_MINER.setItemMeta(meta);

        ItemMeta meta2 = ADVANCED_INDUSTRIAL_MINER.getItemMeta();
        meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        ADVANCED_INDUSTRIAL_MINER.setItemMeta(meta2);
    }

    /* Machines */
    public static final SlimefunItemStack COMPOSTER = new SlimefunItemStack("COMPOSTER", Material.CAULDRON, "&aКомпостер", MelonUtils.splitLore("", "&a&oМожет преобразовывать различные материалы с течением времени..."));
    public static final SlimefunItemStack CRUCIBLE = new SlimefunItemStack("CRUCIBLE", Material.CAULDRON, "&cТигель", MelonUtils.splitLore("", "&a&oИспользуется для плавления предметов в жидкости"));
    public static final SlimefunItemStack OUTPUT_CHEST = new SlimefunItemStack("OUTPUT_CHEST", Material.CHEST, "&4Сундук вывода", MelonUtils.splitLore("", "&c&oМашина будет складывать предметы в этот Сундук вывода, если он стоит у её раздатчика"));
    public static final SlimefunItemStack IGNITION_CHAMBER = new SlimefunItemStack("IGNITION_CHAMBER", Material.DROPPER, "&4Устройство поддержания огня", MelonUtils.splitLore("", "&fПосле потухания огня в Плавильне, зажигает его заново, если наполнить его Огнивом и поместить рядом с Раздатчиком"));
    public static final SlimefunItemStack HOLOGRAM_PROJECTOR = new SlimefunItemStack("HOLOGRAM_PROJECTOR", Material.QUARTZ_SLAB, "&bГолографический проектор", "", "&fПроектирует редактируемую голограмму");
    public static final SlimefunItemStack BLOCK_PLACER = new SlimefunItemStack("BLOCK_PLACER", Material.DISPENSER, "&aУстановщик блоков", MelonUtils.splitLore("", "&fВсе блоки в этом Раздатчике будут автоматически размещены"));

    /* Enhanced Furnaces */
    public static final SlimefunItemStack ENHANCED_FURNACE = new SlimefunItemStack("ENHANCED_FURNACE", Material.FURNACE, "&7Улучшенная печь - &eI", "", "&7Скорость: &e1x", "&7Экономия топлива: &e1x", "&7Множитель удачи: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_2 = new SlimefunItemStack("ENHANCED_FURNACE_2", Material.FURNACE, "&7Улучшенная печь - &eII", "", "&7Скорость: &e2x", "&7Экономия топлива: &e1x", "&7Множитель удачи: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_3 = new SlimefunItemStack("ENHANCED_FURNACE_3", Material.FURNACE, "&7Улучшенная печь - &eIII", "", "&7Скорость: &e2x", "&7Экономия топлива: &e2x", "&7Множитель удачи: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_4 = new SlimefunItemStack("ENHANCED_FURNACE_4", Material.FURNACE, "&7Улучшенная печь - &eIV", "", "&7Скорость: &e3x", "&7Экономия топлива: &e2x", "&7Множитель удачи: &e1x");
    public static final SlimefunItemStack ENHANCED_FURNACE_5 = new SlimefunItemStack("ENHANCED_FURNACE_5", Material.FURNACE, "&7Улучшенная печь - &eV", "", "&7Скорость: &e3x", "&7Экономия топлива: &e2x", "&7Множитель удачи: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_6 = new SlimefunItemStack("ENHANCED_FURNACE_6", Material.FURNACE, "&7Улучшенная печь - &eVI", "", "&7Скорость: &e3x", "&7Экономия топлива: &e3x", "&7Множитель удачи: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_7 = new SlimefunItemStack("ENHANCED_FURNACE_7", Material.FURNACE, "&7Улучшенная печь - &eVII", "", "&7Скорость: &e4x", "&7Экономия топлива: &e3x", "&7Множитель удачи: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_8 = new SlimefunItemStack("ENHANCED_FURNACE_8", Material.FURNACE, "&7Улучшенная печь - &eVIII", "", "&7Скорость: &e4x", "&7Экономия топлива: &e4x", "&7Множитель удачи: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_9 = new SlimefunItemStack("ENHANCED_FURNACE_9", Material.FURNACE, "&7Улучшенная печь - &eIX", "", "&7Скорость: &e5x", "&7Экономия топлива: &e4x", "&7Множитель удачи: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_10 = new SlimefunItemStack("ENHANCED_FURNACE_10", Material.FURNACE, "&7Улучшенная печь - &eX", "", "&7Скорость: &e5x", "&7Экономия топлива: &e5x", "&7Множитель удачи: &e2x");
    public static final SlimefunItemStack ENHANCED_FURNACE_11 = new SlimefunItemStack("ENHANCED_FURNACE_11", Material.FURNACE, "&7Улучшенная печь - &eXI", "", "&7Скорость: &e5x", "&7Экономия топлива: &e5x", "&7Множитель удачи: &e3x");
    public static final SlimefunItemStack REINFORCED_FURNACE = new SlimefunItemStack("REINFORCED_FURNACE", Material.FURNACE, "&7Армированная печь", "", "&7Скорость: &e10x", "&7Экономия топлива: &e10x", "&7Множитель удачи: &e3x");
    public static final SlimefunItemStack CARBONADO_EDGED_FURNACE = new SlimefunItemStack("CARBONADO_EDGED_FURNACE", Material.FURNACE, "&7Карбонадовая печь", "", "&7Скорость: &e20x", "&7Экономия топлива: &e10x", "&7Множитель удачи: &e3x");

    /* Soulbound Items */
    public static final SlimefunItemStack SOULBOUND_SWORD = new SlimefunItemStack("SOULBOUND_SWORD", Material.DIAMOND_SWORD, "&cБезутратный меч");
    public static final SlimefunItemStack SOULBOUND_BOW = new SlimefunItemStack("SOULBOUND_BOW", Material.BOW, "&cБезутратный лук");
    public static final SlimefunItemStack SOULBOUND_PICKAXE = new SlimefunItemStack("SOULBOUND_PICKAXE", Material.DIAMOND_PICKAXE, "&cБезутратная кирка");
    public static final SlimefunItemStack SOULBOUND_AXE = new SlimefunItemStack("SOULBOUND_AXE", Material.DIAMOND_AXE, "&cБезутратный топор");
    public static final SlimefunItemStack SOULBOUND_SHOVEL = new SlimefunItemStack("SOULBOUND_SHOVEL", Material.DIAMOND_SHOVEL, "&cБезутратная лопата");
    public static final SlimefunItemStack SOULBOUND_HOE = new SlimefunItemStack("SOULBOUND_HOE", Material.DIAMOND_HOE, "&cБезутратная мотыга");
    public static final SlimefunItemStack SOULBOUND_TRIDENT = new SlimefunItemStack("SOULBOUND_TRIDENT", Material.TRIDENT, "&cБезутратный трезубец");

    public static final SlimefunItemStack SOULBOUND_HELMET = new SlimefunItemStack("SOULBOUND_HELMET", Material.DIAMOND_HELMET, "&cБезутратный шлем");
    public static final SlimefunItemStack SOULBOUND_CHESTPLATE = new SlimefunItemStack("SOULBOUND_CHESTPLATE", Material.DIAMOND_CHESTPLATE, "&cБезутратный нагрудник");
    public static final SlimefunItemStack SOULBOUND_LEGGINGS = new SlimefunItemStack("SOULBOUND_LEGGINGS", Material.DIAMOND_LEGGINGS, "&cБезутратные поножи");
    public static final SlimefunItemStack SOULBOUND_BOOTS = new SlimefunItemStack("SOULBOUND_BOOTS", Material.DIAMOND_BOOTS, "&cБезутратные ботинки");

    /* Runes */
    public static final SlimefunItemStack BLANK_RUNE = new SlimefunItemStack("BLANK_RUNE", new ColoredFireworkStar(Color.BLACK, "&8Чистая руна"));

    public static final SlimefunItemStack AIR_RUNE = new SlimefunItemStack("ANCIENT_RUNE_AIR", new ColoredFireworkStar(Color.AQUA, "&7Древняя руна &8&l[&b&lВоздух&8&l]"));
    public static final SlimefunItemStack WATER_RUNE = new SlimefunItemStack("ANCIENT_RUNE_WATER", new ColoredFireworkStar(Color.BLUE, "&7Древняя руна &8&l[&1&lВода&8&l]"));
    public static final SlimefunItemStack FIRE_RUNE = new SlimefunItemStack("ANCIENT_RUNE_FIRE", new ColoredFireworkStar(Color.RED, "&7Древняя руна &8&l[&4&lОгонь&8&l]"));
    public static final SlimefunItemStack EARTH_RUNE = new SlimefunItemStack("ANCIENT_RUNE_EARTH", new ColoredFireworkStar(Color.fromRGB(112, 47, 7), "&7Древняя руна &8&l[&c&lЗемля&8&l]"));
    public static final SlimefunItemStack ENDER_RUNE = new SlimefunItemStack("ANCIENT_RUNE_ENDER", new ColoredFireworkStar(Color.PURPLE, "&7Древняя руна &8&l[&5&lЭндер&8&l]"));

    public static final SlimefunItemStack RAINBOW_RUNE = new SlimefunItemStack("ANCIENT_RUNE_RAINBOW", new ColoredFireworkStar(Color.FUCHSIA, "&7Древняя руна &8&l[&d&lРадуга&8&l]"));
    public static final SlimefunItemStack LIGHTNING_RUNE = new SlimefunItemStack("ANCIENT_RUNE_LIGHTNING", new ColoredFireworkStar(Color.fromRGB(255, 255, 95), "&7Древняя руна &8&l[&e&lМолния&8&l]"));
    public static final SlimefunItemStack SOULBOUND_RUNE = new SlimefunItemStack("ANCIENT_RUNE_SOULBOUND", new ColoredFireworkStar(Color.fromRGB(47, 0, 117), "&7Древняя руна &8&l[&5&lБезутратность&8&l]", MelonUtils.splitLore("&eБросьте эту руну на предмет лежащий на земле, чтобы &5привязать &eего своей душе", " ", "&eРекомендуется использовать эту руну только на &6важных &eпредметах", " ", "&eПредметы, привязанные к вашей душе, не упадут после смерти")));
    public static final SlimefunItemStack ENCHANTMENT_RUNE = new SlimefunItemStack("ANCIENT_RUNE_ENCHANTMENT", new ColoredFireworkStar(Color.fromRGB(255, 217, 25), "&7Древняя руна &8&l[&6&lЗачарование&8&l]", MelonUtils.splitLore("&eБросьте эту руну на предмет лежащий на земле, чтобы наложить на него случайные чары")));
    public static final SlimefunItemStack VILLAGER_RUNE = new SlimefunItemStack("ANCIENT_RUNE_VILLAGERS", new ColoredFireworkStar(Color.fromRGB(160, 20, 5), "&7Древняя руна &8&l[&4&lКрестьяне&8&l]", MelonUtils.splitLore("&eЩелкните правой кнопкой мыши по Крестьянину, чтобы очистить его текущую работу и торги", "&eПо прошествии некоторого времени Крестьянин снова начнет искать работу")));

    /* Electricity */
    public static final SlimefunItemStack SOLAR_GENERATOR = new SlimefunItemStack("SOLAR_GENERATOR", Material.DAYLIGHT_DETECTOR, "&bСолнечный генератор", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack SOLAR_GENERATOR_2 = new SlimefunItemStack("SOLAR_GENERATOR_2", Material.DAYLIGHT_DETECTOR, "&cУлучшенный солнечный генератор", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack SOLAR_GENERATOR_3 = new SlimefunItemStack("SOLAR_GENERATOR_3", Material.DAYLIGHT_DETECTOR, "&4Карбонадовый солнечный генератор", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(64));
    public static final SlimefunItemStack SOLAR_GENERATOR_4 = new SlimefunItemStack("SOLAR_GENERATOR_4", Material.DAYLIGHT_DETECTOR, "&eЭнергичный солнечный генератор", "", "&9Работает ночью", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(0), LoreBuilder.powerPerSecond(256) + " (День)", LoreBuilder.powerPerSecond(128) + " (Ночь)");

    public static final SlimefunItemStack COAL_GENERATOR = new SlimefunItemStack("COAL_GENERATOR", HeadTexture.GENERATOR, "&cУгольный генератор", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR), LoreBuilder.powerBuffer(64), LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack COAL_GENERATOR_2 = new SlimefunItemStack("COAL_GENERATOR_2", HeadTexture.GENERATOR, "&cУгольный генератор &7(&eII&7)", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack LAVA_GENERATOR = new SlimefunItemStack("LAVA_GENERATOR", HeadTexture.GENERATOR, "&4Лавовый генератор", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack LAVA_GENERATOR_2 = new SlimefunItemStack("LAVA_GENERATOR_2", HeadTexture.GENERATOR, "&4Лавовый генератор &7(&eII&7)", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR), LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_FURNACE = new SlimefunItemStack("ELECTRIC_FURNACE", Material.FURNACE, "&cЭлектрическая печь", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_FURNACE_2 = new SlimefunItemStack("ELECTRIC_FURNACE_2", Material.FURNACE, "&cЭлектрическая печь &7- &eII", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_FURNACE_3 = new SlimefunItemStack("ELECTRIC_FURNACE_3", Material.FURNACE, "&cЭлектрическая печь &7- &eIII", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(10));

    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER = new SlimefunItemStack("ELECTRIC_ORE_GRINDER", Material.FURNACE, "&cЭлектрический дробитель", "", "&fРаботает как рудодробитель и жёрнов", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(12));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_2 = new SlimefunItemStack("ELECTRIC_ORE_GRINDER_2", Material.FURNACE, "&cЭлектрический дробитель &7(&eII&7)", "", "&fРаботает как рудодробитель и жёрнов", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(30));
    public static final SlimefunItemStack ELECTRIC_ORE_GRINDER_3 = new SlimefunItemStack("ELECTRIC_ORE_GRINDER_3", Material.FURNACE, "&cЭлектрический дробитель &7(&eIII&7)", "", "&fРаботает как рудодробитель и жёрнов", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(10), LoreBuilder.powerPerSecond(90));
    public static final SlimefunItemStack ELECTRIC_INGOT_PULVERIZER = new SlimefunItemStack("ELECTRIC_INGOT_PULVERIZER", Material.FURNACE, "&cЭлектрический измельчитель слитков", "", "&fПревращает слитки в пыль", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack AUTO_DRIER = new SlimefunItemStack("AUTO_DRIER", Material.SMOKER, "&6Автоматическая сушилка", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack AUTO_ENCHANTER = new SlimefunItemStack("AUTO_ENCHANTER", Material.ENCHANTING_TABLE, "&5Автоматический зачаровыватель", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_ENCHANTER_2 = new SlimefunItemStack("AUTO_ENCHANTER_2", Material.ENCHANTING_TABLE, "&5Автоматический зачаровыватель &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_DISENCHANTER = new SlimefunItemStack("AUTO_DISENCHANTER", Material.ENCHANTING_TABLE, "&5Автоматический расчаровыватель", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack AUTO_DISENCHANTER_2 = new SlimefunItemStack("AUTO_DISENCHANTER_2", Material.ENCHANTING_TABLE, "&5Автоматический расчаровыватель &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack AUTO_ANVIL = new SlimefunItemStack("AUTO_ANVIL", Material.IRON_BLOCK, "&7Автоматическая наковальня", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &7Фактор ремонта: 10%", LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack AUTO_ANVIL_2 = new SlimefunItemStack("AUTO_ANVIL_2", Material.IRON_BLOCK, "&7Автоматическая наковальня Mk.II", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Фактор ремонта: 25%", LoreBuilder.powerPerSecond(32));
    public static final SlimefunItemStack AUTO_BREWER = new SlimefunItemStack("AUTO_BREWER", Material.SMOKER, "&6Автоматическая зельеварка", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(12));

    public static final SlimefunItemStack BOOK_BINDER = new SlimefunItemStack("BOOK_BINDER", Material.BOOKSHELF, "&6Книжный переплётчик", "", "&fСвязывает несколько зачарованных книг в одну", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(16));

    public static final SlimefunItemStack BIO_REACTOR = new SlimefunItemStack("BIO_REACTOR", Material.LIME_TERRACOTTA, "&2Био-реактор", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.GENERATOR), LoreBuilder.powerBuffer(128), LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack MULTIMETER = new SlimefunItemStack("MULTIMETER", Material.CLOCK, "&eМультиметр", MelonUtils.splitLore("", "&fИзмеряет количество сохраненной энергии в блоке"));

    public static final SlimefunItemStack SMALL_CAPACITOR = new SlimefunItemStack("SMALL_CAPACITOR", HeadTexture.CAPACITOR_25, "&aМаленький конденсатор", LoreBuilder.range(6), "", LoreBuilder.machine(MachineTier.BASIC, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7Ёмкость: 128 Дж");
    public static final SlimefunItemStack MEDIUM_CAPACITOR = new SlimefunItemStack("MEDIUM_CAPACITOR", HeadTexture.CAPACITOR_25, "&aСредний конденсатор", LoreBuilder.range(6), "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7Ёмкость: 512 Дж");
    public static final SlimefunItemStack BIG_CAPACITOR = new SlimefunItemStack("BIG_CAPACITOR", HeadTexture.CAPACITOR_25, "&aБольшой конденсатор", LoreBuilder.range(6), "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7Ёмкость: 1024 Дж");
    public static final SlimefunItemStack LARGE_CAPACITOR = new SlimefunItemStack("LARGE_CAPACITOR", HeadTexture.CAPACITOR_25, "&aОгромный конденсатор", LoreBuilder.range(6), "", LoreBuilder.machine(MachineTier.GOOD, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7Ёмкость: 8192 Дж");
    public static final SlimefunItemStack CARBONADO_EDGED_CAPACITOR = new SlimefunItemStack("CARBONADO_EDGED_CAPACITOR", HeadTexture.CAPACITOR_25, "&aКарбонадовый конденсатор", LoreBuilder.range(6), "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7Ёмкость: 65536 Дж");
    public static final SlimefunItemStack ENERGIZED_CAPACITOR = new SlimefunItemStack("ENERGIZED_CAPACITOR", HeadTexture.CAPACITOR_25, "&aЭнергетический конденсатор", LoreBuilder.range(6), "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR), "&8\u21E8 &e\u26A1 &7Ёмкость: 524288 Дж");

    /* Robots */
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID = new SlimefunItemStack("PROGRAMMABLE_ANDROID", HeadTexture.PROGRAMMABLE_ANDROID, "&cПрограммируемый робот &7(Обычный)", "", "&8\u21E8 &7Функция: Отсутствует", "&8\u21E8 &7Экономия топлива: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FARMER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_FARMER", HeadTexture.PROGRAMMABLE_ANDROID_FARMER, "&cПрограммируемый робот &7(Фермер)", "", "&8\u21E8 &7Функция: Фермерство", "&8\u21E8 &7Экономия топлива: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_MINER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_MINER", HeadTexture.PROGRAMMABLE_ANDROID_MINER, "&cПрограммируемый робот &7(Шахтёр)", "", "&8\u21E8 &7Функция: Шахтёрство", "&8\u21E8 &7Экономия топлива: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_WOODCUTTER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_WOODCUTTER", HeadTexture.PROGRAMMABLE_ANDROID_WOODCUTTER, "&cПрограммируемый робот &7(Лесоруб)", "", "&8\u21E8 &7Функция: Лесорубство", "&8\u21E8 &7Экономия топлива: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_BUTCHER", HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER, "&cПрограммируемый робот &7(Мясник)", "", "&8\u21E8 &7Функция: Животноводство", "&8\u21E8 &7Урон: 4", "&8\u21E8 &7Экономия топлива: 1.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_FISHERMAN", HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN, "&cПрограммируемый робот &7(Рыбак)", "", "&8\u21E8 &7Функция: Рыбалка", "&8\u21E8 &7Шанс успеха: 10%", "&8\u21E8 &7Экономия топлива: 1.0x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2 = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2", HeadTexture.PROGRAMMABLE_ANDROID, "&cУлучшенный программируемый робот &7(Обычный)", "", "&8\u21E8 &7Функция: Отсутствует", "&8\u21E8 &7Экономия топлива: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_FISHERMAN", HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN, "&cУлучшенный программируемый робот &7(Рыбак)", "", "&8\u21E8 &7Функция: Рыбалка", "&8\u21E8 &7Шанс успеха: 20%", "&8\u21E8 &7Экономия топлива: 1.5x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_FARMER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_FARMER", HeadTexture.PROGRAMMABLE_ANDROID_FARMER, "&cУлучшенный программируемый робот &7(Фермер)", "", "&8\u21E8 &7Функция: Фермерство", "&8\u21E8 &7Экономия топлива: 1.5x", "&8\u21E8 &7Также можно собирать растения из экзотического сада");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_2_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_2_BUTCHER", HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER, "&cУлучшенный программируемый робот &7(Мясник)", "", "&8\u21E8 &7Функция: Животноводство", "&8\u21E8 &7Урон: 8", "&8\u21E8 &7Экономия топлива: 1.5x");

    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3 = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3", HeadTexture.PROGRAMMABLE_ANDROID, "&eУсиленный программируемый робот &7(Обычный)", "", "&8\u21E8 &7Функция: Отсутствует", "&8\u21E8 &7Экономия топлива: 3.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_FISHERMAN = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3_FISHERMAN", HeadTexture.PROGRAMMABLE_ANDROID_FISHERMAN, "&eУсиленный программируемый робот &7(Рыбак)", "", "&8\u21E8 &7Функция: Рыбалка", "&8\u21E8 &7Шанс успеха: 30%", "&8\u21E8 &7Экономия топлива: 8.0x");
    public static final SlimefunItemStack PROGRAMMABLE_ANDROID_3_BUTCHER = new SlimefunItemStack("PROGRAMMABLE_ANDROID_3_BUTCHER", HeadTexture.PROGRAMMABLE_ANDROID_BUTCHER, "&eУсиленный программируемый робот &7(Мясник)", "", "&8\u21E8 &7Функция: Животноводство", "&8\u21E8 &7Урон: 20", "&8\u21E8 &7Экономия топлива: 8.0x");

    /* GPS */
    public static final SlimefunItemStack GPS_TRANSMITTER = new SlimefunItemStack("GPS_TRANSMITTER", HeadTexture.GPS_TRANSMITTER, "&bGPS передатчик", "", LoreBuilder.powerBuffer(16), LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack GPS_TRANSMITTER_2 = new SlimefunItemStack("GPS_TRANSMITTER_2", HeadTexture.GPS_TRANSMITTER, "&cУлученный GPS передатчик", "", LoreBuilder.powerBuffer(64), LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack GPS_TRANSMITTER_3 = new SlimefunItemStack("GPS_TRANSMITTER_3", HeadTexture.GPS_TRANSMITTER, "&4Карбонадовый GPS передатчик", "", LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(22));
    public static final SlimefunItemStack GPS_TRANSMITTER_4 = new SlimefunItemStack("GPS_TRANSMITTER_4", HeadTexture.GPS_TRANSMITTER, "&eЭнергетический GPS передатчик", "", LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(92));

    public static final SlimefunItemStack GPS_MARKER_TOOL = new SlimefunItemStack("GPS_MARKER_TOOL", Material.REDSTONE_TORCH, "&bGPS инструмент отметок", MelonUtils.splitLore("", "&fДаёт возможность установить отметку в практически любом месте"));
    public static final SlimefunItemStack GPS_CONTROL_PANEL = new SlimefunItemStack("GPS_CONTROL_PANEL", HeadTexture.GPS_CONTROL_PANEL, "&bGPS панель управления", MelonUtils.splitLore("", "&fДаёт возможность связываться со спутниками и управлять своими отметками"));
    public static final SlimefunItemStack GPS_EMERGENCY_TRANSMITTER = new SlimefunItemStack("GPS_EMERGENCY_TRANSMITTER", HeadTexture.GPS_TRANSMITTER, "&cЭкстренный GPS передатчик", MelonUtils.splitLore("", "&fНоси его в инвентаре, он автоматически установит отметку, в месте твоей внезапной смерти"));

    public static final SlimefunItemStack ANDROID_INTERFACE_FUEL = new SlimefunItemStack("ANDROID_INTERFACE_FUEL", Material.DISPENSER, "&7Интерфейс робота &c(Топливо)", MelonUtils.splitLore("", "&fПредметы из этого интерфейса попадают в слот топлива робота, когда это будет указано в скрипте"));
    public static final SlimefunItemStack ANDROID_INTERFACE_ITEMS = new SlimefunItemStack("ANDROID_INTERFACE_ITEMS", Material.DISPENSER, "&7Интерфейс робота &9(Предметы)", MelonUtils.splitLore("", "&fПредметы из инвентаря робота будут помещены в этот интерфейс, когда это будет указано в скрипте"));

    public static final SlimefunItemStack GPS_GEO_SCANNER = new SlimefunItemStack("GPS_GEO_SCANNER", HeadTexture.GEO_SCANNER, "&bGPS гео-сканнер", MelonUtils.splitLore("", "&fСканирует чанк в поисках ресурсов, таких как &8нефть"));
    public static final SlimefunItemStack PORTABLE_GEO_SCANNER = new SlimefunItemStack("PORTABLE_GEO_SCANNER", Material.CLOCK, "&bПортативный гео-сканнер", MelonUtils.splitLore("", "&fСканирует чанк в поисках ресурсов", "", "&eПКМ&7: Сканировать"));
    public static final SlimefunItemStack GEO_MINER = new SlimefunItemStack("GEO_MINER", HeadTexture.GEO_MINER, "&6Гео-шахтёр", MelonUtils.splitLore("", "&eДобывает ресурсы из чанка, которые невозможно добыть киркой", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(48), "", "&c&l! &cТребуется гео-сканирование чанка"));
    public static final SlimefunItemStack OIL_PUMP = new SlimefunItemStack("OIL_PUMP", HeadTexture.OIL_PUMP, "&4Нефтяной насос", MelonUtils.splitLore("", "&7Накачивает Нефть и заливает её в ведра", "", "&c&l! &cТребуется гео-сканирование чанка"));
    public static final SlimefunItemStack OIL_BUCKET = new SlimefunItemStack("BUCKET_OF_OIL", HeadTexture.OIL_BUCKET, "&fВедро нефти");
    public static final SlimefunItemStack FUEL_BUCKET = new SlimefunItemStack("BUCKET_OF_FUEL", HeadTexture.FUEL_BUCKET, "&fВедро бензина");

    public static final SlimefunItemStack REFINERY = new SlimefunItemStack("REFINERY", Material.PISTON, "&cТопливный завод", "", "&fИспользует Нефть, чтобы создать бензин");
    public static final SlimefunItemStack COMBUSTION_REACTOR = new SlimefunItemStack("COMBUSTION_REACTOR", HeadTexture.GENERATOR, "&cРеактор горения", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(24));
    public static final SlimefunItemStack ANDROID_MEMORY_CORE = new SlimefunItemStack("ANDROID_MEMORY_CORE", HeadTexture.ENERGY_REGULATOR, "&bЯдро памяти робота");

    public static final SlimefunItemStack GPS_TELEPORTER_PYLON = new SlimefunItemStack("GPS_TELEPORTER_PYLON", Material.PURPLE_STAINED_GLASS, "&5GPS опора телепорта", "", "&7Компонент телепорта");
    public static final SlimefunItemStack GPS_TELEPORTATION_MATRIX = new SlimefunItemStack("GPS_TELEPORTATION_MATRIX", Material.IRON_BLOCK, "&bGPS матрица телепорта", MelonUtils.splitLore("", "&fЭто главный компонент вашего телепорта", "&fЭта матрица позволяет перемещаться по отметкам, которые установил владелец телепорта при помощи этой машины"));
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_SHARED = new SlimefunItemStack("GPS_ACTIVATION_DEVICE_SHARED", Material.STONE_PRESSURE_PLATE, "&fGPS устройство активации &3(Публичное)", MelonUtils.splitLore("", "&fУстанови это на матрицу телепорта и встань на плиту, чтобы активировать процесс телепортации"));
    public static final SlimefunItemStack GPS_ACTIVATION_DEVICE_PERSONAL = new SlimefunItemStack("GPS_ACTIVATION_DEVICE_PERSONAL", Material.STONE_PRESSURE_PLATE, "&fGPS устройство активации &a(Личное)", MelonUtils.splitLore("", "&fУстанови это на матрицу телепорта и встань на плиту, чтобы активировать процесс телепортации", "", "&fЭту версию может активировать только тот, кто её установит на матрицу"));
    public static final SlimefunItemStack PORTABLE_TELEPORTER = new SlimefunItemStack("PORTABLE_TELEPORTER", Material.COMPASS, "&bПортативный телепорт", MelonUtils.splitLore("", "&fЭто устройство позволяет телепортироваться к твоим отметкам из любого места", "", LoreBuilder.powerCharged(0, 50), "", LoreBuilder.RIGHT_CLICK_TO_USE));

    public static final SlimefunItemStack ELEVATOR_PLATE = new SlimefunItemStack("ELEVATOR_PLATE", Material.STONE_PRESSURE_PLATE, "&bЛифтовая плита", MelonUtils.splitLore("", "&fУстанови по плите лифта на каждом этаже, и ты сможешь перемещаться между этажами", "", "&eПКМ&7 на этот блок, чтобы назвать его"));
    public static final SlimefunItemStack INFUSED_HOPPER = new SlimefunItemStack("INFUSED_HOPPER", Material.HOPPER, "&5Усиленная воронка", MelonUtils.splitLore("", "&fАвтоматически собирает предметы в радиусе 7x7x7 возле себя"));

    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER = new SlimefunItemStack("HEATED_PRESSURE_CHAMBER", Material.LIGHT_GRAY_STAINED_GLASS, "&cТермическая барокамера", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack HEATED_PRESSURE_CHAMBER_2 = new SlimefunItemStack("HEATED_PRESSURE_CHAMBER_2", Material.LIGHT_GRAY_STAINED_GLASS, "&cТермическая барокамера &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5), LoreBuilder.powerPerSecond(44));

    public static final SlimefunItemStack ELECTRIC_SMELTERY = new SlimefunItemStack("ELECTRIC_SMELTERY", Material.FURNACE, "&cЭлектрическая плавильня", "", "&4Только сплавы, не изготавливает слитки из пыли", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack ELECTRIC_SMELTERY_2 = new SlimefunItemStack("ELECTRIC_SMELTERY_2", Material.FURNACE, "&cЭлектрическая плавильня &7- &eII", "", "&4Только сплавы, не изготавливает слитки из пыли", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIC_PRESS = new SlimefunItemStack("ELECTRIC_PRESS", HeadTexture.ELECTRIC_PRESS, "&eЭлектрический пресс", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack ELECTRIC_PRESS_2 = new SlimefunItemStack("ELECTRIC_PRESS_2", HeadTexture.ELECTRIC_PRESS, "&eЭлектрический пресс &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE", Material.RED_TERRACOTTA, "&cЭлектрофицированный тигель", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(48));
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_2 = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE_2", Material.RED_TERRACOTTA, "&cЭлектрофицированный тигель &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(80));
    public static final SlimefunItemStack ELECTRIFIED_CRUCIBLE_3 = new SlimefunItemStack("ELECTRIFIED_CRUCIBLE_3", Material.RED_TERRACOTTA, "&cЭлектрофицированный тигель &7- &eIII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(120));

    public static final SlimefunItemStack CARBON_PRESS = new SlimefunItemStack("CARBON_PRESS", Material.BLACK_STAINED_GLASS, "&cКарбоновый пресс", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack CARBON_PRESS_2 = new SlimefunItemStack("CARBON_PRESS_2", Material.BLACK_STAINED_GLASS, "&cКарбоновый пресс &7- &eII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(50));
    public static final SlimefunItemStack CARBON_PRESS_3 = new SlimefunItemStack("CARBON_PRESS_3", Material.BLACK_STAINED_GLASS, "&cКарбоновый пресс &7- &eIII", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15), LoreBuilder.powerPerSecond(180));

    public static final SlimefunItemStack BLISTERING_INGOT = new SlimefunItemStack("BLISTERING_INGOT", Material.GOLD_INGOT, "&6Пузырящийся слиток &7(33%)", "", LoreBuilder.radioactive(Radioactivity.HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_2 = new SlimefunItemStack("BLISTERING_INGOT_2", Material.GOLD_INGOT, "&6Пузырящийся слиток &7(66%)", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack BLISTERING_INGOT_3 = new SlimefunItemStack("BLISTERING_INGOT_3", Material.GOLD_INGOT, "&6Пузырящийся слиток", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);

    public static final SlimefunItemStack ENERGY_REGULATOR = new SlimefunItemStack("ENERGY_REGULATOR", HeadTexture.ENERGY_REGULATOR, "&6Регулятор энергии", "", "&fОсновной компонент любой энергетической сети");
    public static final SlimefunItemStack ENERGY_CONNECTOR = new SlimefunItemStack("ENERGY_CONNECTOR", HeadTexture.ENERGY_CONNECTOR, "&eКоннектор энергии", MelonUtils.splitLore(LoreBuilder.range(6), "", "&fПоместите это между машинами и генераторами, чтобы подключить их к регулятору"));
    public static final SlimefunItemStack DEBUG_FISH = new SlimefunItemStack("DEBUG_FISH", Material.SALMON, "&3Как много рыбы?", "", "&eПКМ&f: Посмотреть BlockData", "&eЛКМ&f: Сломать блок", "&eShift + ЛКМ&f: Стереть BlockData", "&eShift + ПКМ&f: Установить Placeholder Block");

    public static final SlimefunItemStack NETHER_ICE = new SlimefunItemStack("NETHER_ICE", HeadTexture.NETHER_ICE, "&eЛёд Незера", "", LoreBuilder.radioactive(Radioactivity.MODERATE), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack ENRICHED_NETHER_ICE = new SlimefunItemStack("ENRICHED_NETHER_ICE", HeadTexture.ENRICHED_NETHER_ICE, "&eОбогащённый лёд Незера", "", LoreBuilder.radioactive(Radioactivity.VERY_HIGH), LoreBuilder.HAZMAT_SUIT_REQUIRED);
    public static final SlimefunItemStack NETHER_ICE_COOLANT_CELL = new SlimefunItemStack("NETHER_ICE_COOLANT_CELL", HeadTexture.NETHER_ICE_COOLANT_CELL, "&6Охлаждающий элемент льда Незера");

    // Cargo
    public static final SlimefunItemStack CARGO_MANAGER = new SlimefunItemStack("CARGO_MANAGER", HeadTexture.CARGO_MANAGER, "&6Грузовой контроллер", "", "&fОсновной компонент грузовой сети");
    public static final SlimefunItemStack CARGO_CONNECTOR_NODE = new SlimefunItemStack("CARGO_NODE", HeadTexture.CARGO_CONNECTOR_NODE, "&7Грузовой модуль &c(Соединение)", "", "&fСоединяет компоненты грузовой сети");
    public static final SlimefunItemStack CARGO_INPUT_NODE = new SlimefunItemStack("CARGO_NODE_INPUT", HeadTexture.CARGO_INPUT_NODE, "&7Грузовой модуль &c(Ввод)", "", "&fГрузовой порт ввода");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE = new SlimefunItemStack("CARGO_NODE_OUTPUT", HeadTexture.CARGO_OUTPUT_NODE, "&7Грузовой модуль &c(Вывод)", "", "&fГрузовой порт вывода");
    public static final SlimefunItemStack CARGO_OUTPUT_NODE_2 = new SlimefunItemStack("CARGO_NODE_OUTPUT_ADVANCED", HeadTexture.CARGO_OUTPUT_NODE, "&6Улучшенный грузовой модуль &c(Вывод)", "", "&fГрузовой порт вывода");

    // Animal farm
    public static final SlimefunItemStack AUTO_BREEDER = new SlimefunItemStack("AUTO_BREEDER", Material.HAY_BLOCK, "&eАвтоматический разводчик", "", "&fРаботает на &aОрганической еде", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerBuffer(1024), "&8\u21E8 &e\u26A1 &760 Дж/Животное");
    public static final SlimefunItemStack PRODUCE_COLLECTOR = new SlimefunItemStack("PRODUCE_COLLECTOR", Material.HAY_BLOCK, "&bСборщик продукции", MelonUtils.splitLore("", "&fЭта машина позволяет собирать продукты у ближайших животных", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(32)));

    public static final SlimefunItemStack ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD", HeadTexture.FILLED_CAN, "&aОрганическая еда", "&7Состав: &9???");
    public static final SlimefunItemStack WHEAT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_WHEAT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Пшеница");
    public static final SlimefunItemStack CARROT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_CARROT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Морковь");
    public static final SlimefunItemStack POTATO_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_POTATO", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Картофель");
    public static final SlimefunItemStack SEEDS_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_SEEDS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Семена");
    public static final SlimefunItemStack BEETROOT_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_BEETROOT", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Свёкла");
    public static final SlimefunItemStack MELON_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_MELON", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Арбуз");
    public static final SlimefunItemStack APPLE_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_APPLE", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Яблоко");
    public static final SlimefunItemStack SWEET_BERRIES_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_SWEET_BERRIES", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Сладкие ягоды");
    public static final SlimefunItemStack KELP_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_KELP", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Сушёная ламинария");
    public static final SlimefunItemStack COCOA_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_COCOA", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Какао-бобы");
    public static final SlimefunItemStack SEAGRASS_ORGANIC_FOOD = new SlimefunItemStack("ORGANIC_FOOD_SEAGRASS", HeadTexture.FILLED_CAN, ORGANIC_FOOD.getDisplayName(), "&7Состав: &9Морская трава");

    public static final SlimefunItemStack FERTILIZER = new SlimefunItemStack("FERTILIZER", HeadTexture.FILLED_CAN, "&aОрганическое удобрение", "&7Состав: &9???");
    public static final SlimefunItemStack WHEAT_FERTILIZER = new SlimefunItemStack("FERTILIZER_WHEAT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Пшеница");
    public static final SlimefunItemStack CARROT_FERTILIZER = new SlimefunItemStack("FERTILIZER_CARROT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Морковь");
    public static final SlimefunItemStack POTATO_FERTILIZER = new SlimefunItemStack("FERTILIZER_POTATO", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Картофель");
    public static final SlimefunItemStack SEEDS_FERTILIZER = new SlimefunItemStack("FERTILIZER_SEEDS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Семена");
    public static final SlimefunItemStack BEETROOT_FERTILIZER = new SlimefunItemStack("FERTILIZER_BEETROOT", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Свёкла");
    public static final SlimefunItemStack MELON_FERTILIZER = new SlimefunItemStack("FERTILIZER_MELON", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Арбуз");
    public static final SlimefunItemStack APPLE_FERTILIZER = new SlimefunItemStack("FERTILIZER_APPLE", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Яблоко");
    public static final SlimefunItemStack SWEET_BERRIES_FERTILIZER = new SlimefunItemStack("FERTILIZER_SWEET_BERRIES", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Сладкие ягоды");
    public static final SlimefunItemStack KELP_FERTILIZER = new SlimefunItemStack("FERTILIZER_KELP", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Сушёная ламинария");
    public static final SlimefunItemStack COCOA_FERTILIZER = new SlimefunItemStack("FERTILIZER_COCOA", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Какао-бобы");
    public static final SlimefunItemStack SEAGRASS_FERTILIZER = new SlimefunItemStack("FERTILIZER_SEAGRASS", HeadTexture.FILLED_CAN, FERTILIZER.getDisplayName(), "&7Состав: &9Морская трава");

    public static final SlimefunItemStack ANIMAL_GROWTH_ACCELERATOR = new SlimefunItemStack("ANIMAL_GROWTH_ACCELERATOR", Material.HAY_BLOCK, "&bУскоритель роста животных", "", "&fРаботает на &aОрганической еде", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(28));
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR = new SlimefunItemStack("CROP_GROWTH_ACCELERATOR", Material.LIME_TERRACOTTA, "&aУскоритель роста посевов", "", "&fРаботает на &aОрганическом удобрении", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Radius: 7x7", "&8\u21E8 &7Speed: &a3/time", LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(50));
    public static final SlimefunItemStack CROP_GROWTH_ACCELERATOR_2 = new SlimefunItemStack("CROP_GROWTH_ACCELERATOR_2", Material.LIME_TERRACOTTA, "&aУскоритель роста посевов &7(&eII&7)", "", "&fРаботает на &aОрганическом удобрении", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Radius: 9x9", "&8\u21E8 &7Speed: &a4/time", LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(60));
    public static final SlimefunItemStack TREE_GROWTH_ACCELERATOR = new SlimefunItemStack("TREE_GROWTH_ACCELERATOR", Material.BROWN_TERRACOTTA, "&aУскоритель роста деревьев", "", "&fРаботает на &aОрганическом удобрении", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Radius: 9x9", "&8\u21E8 &7Speed: &a4/time", LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_FABRICATOR = new SlimefunItemStack("FOOD_FABRICATOR", Material.GREEN_STAINED_GLASS, "&cФабрика еды", "", "&fПроизводит &aОрганическую еду", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack FOOD_FABRICATOR_2 = new SlimefunItemStack("FOOD_FABRICATOR_2", Material.GREEN_STAINED_GLASS, "&cФабрика еды &7(&eII&7)", "", "&fПроизводит &aОрганическую еду", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(48));

    public static final SlimefunItemStack FOOD_COMPOSTER = new SlimefunItemStack("FOOD_COMPOSTER", Material.GREEN_TERRACOTTA, "&cПищевой компостер", "", "&fПроизводит &aОрганическое удобрение", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(16));
    public static final SlimefunItemStack FOOD_COMPOSTER_2 = new SlimefunItemStack("FOOD_COMPOSTER_2", Material.GREEN_TERRACOTTA, "&cПищевой компостер &7(&eII&7)", "", "&fПроизводит &aОрганическое удобрение", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(10), LoreBuilder.powerBuffer(512), LoreBuilder.powerPerSecond(52));

    public static final SlimefunItemStack EXP_COLLECTOR = new SlimefunItemStack("XP_COLLECTOR", HeadTexture.EXP_COLLECTOR, "&aСборщик опыта", "", "&fСобирает ближайший опыт и хранит его", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerBuffer(1024), LoreBuilder.powerPerSecond(20));
    public static final SlimefunItemStack REACTOR_COOLANT_CELL = new SlimefunItemStack("REACTOR_COLLANT_CELL", HeadTexture.COOLANT_CELL, "&bРеакторная ячейка охлаждения");

    public static final SlimefunItemStack NUCLEAR_REACTOR = new SlimefunItemStack("NUCLEAR_REACTOR", HeadTexture.NUCLEAR_REACTOR, "&2Ядерный реактор", MelonUtils.splitLore("", "&fНуждается в охлаждении!", "&8\u21E8 &bДолжен быть окружен водой", "&8\u21E8 &bДолжен содержать элементы охдаждения реактора", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(16384), LoreBuilder.powerPerSecond(500)));
    public static final SlimefunItemStack NETHER_STAR_REACTOR = new SlimefunItemStack("NETHERSTAR_REACTOR", HeadTexture.NETHER_STAR_REACTOR, "&fРектор звезды Незера", MelonUtils.splitLore("", "&fРаботает на Звёздах Незера", "&8\u21E8 &bДолжен быть окружен водой", "&8\u21E8 &bДолжен содержать элементы охдаждения из Льда Незера", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR), LoreBuilder.powerBuffer(32768), LoreBuilder.powerPerSecond(1024), "&8\u21E8 &4Иссушает всех поблизости"));
    public static final SlimefunItemStack REACTOR_ACCESS_PORT = new SlimefunItemStack("REACTOR_ACCESS_PORT", Material.CYAN_TERRACOTTA, "&2Реакторный порт доступа", MelonUtils.splitLore("", "&fПозволяет взаимодействовать с реактором при помощи грузовой сети, также можно использовать как буфер", "", "&8\u21E8 &eОбязательно установить на &a3 блока &eвыше реактора"));

    public static final SlimefunItemStack FREEZER = new SlimefunItemStack("FREEZER", Material.LIGHT_BLUE_STAINED_GLASS, "&bМорозильная камера", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(18));
    public static final SlimefunItemStack FREEZER_2 = new SlimefunItemStack("FREEZER_2", Material.LIGHT_BLUE_STAINED_GLASS, "&bМорозильная камера &7(&eII&7)", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerBuffer(256), LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack ELECTRIC_GOLD_PAN = new SlimefunItemStack("ELECTRIC_GOLD_PAN", Material.BROWN_TERRACOTTA, "&6Электрическое сито", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(2));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_2 = new SlimefunItemStack("ELECTRIC_GOLD_PAN_2", Material.BROWN_TERRACOTTA, "&6Электрическое сито &7(&eII&7)", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(4));
    public static final SlimefunItemStack ELECTRIC_GOLD_PAN_3 = new SlimefunItemStack("ELECTRIC_GOLD_PAN_3", Material.BROWN_TERRACOTTA, "&6Электрическое сито &7(&eIII&7)", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(10), LoreBuilder.powerPerSecond(14));

    public static final SlimefunItemStack ELECTRIC_DUST_WASHER = new SlimefunItemStack("ELECTRIC_DUST_WASHER", Material.BLUE_STAINED_GLASS, "&3Электрическая рудопромывочная машина", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(6));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_2 = new SlimefunItemStack("ELECTRIC_DUST_WASHER_2", Material.BLUE_STAINED_GLASS, "&3Электрическая рудопромывочная машина &7(&eII&7)", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(10));
    public static final SlimefunItemStack ELECTRIC_DUST_WASHER_3 = new SlimefunItemStack("ELECTRIC_DUST_WASHER_3", Material.BLUE_STAINED_GLASS, "&3Электрическая рудопромывочная машина &7(&eIII&7)", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(10), LoreBuilder.powerPerSecond(30));

    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY", Material.RED_TERRACOTTA, "&cЭлектрическая фабрика слитков", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(8));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_2 = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY_2", Material.RED_TERRACOTTA, "&cЭлектрическая фабрика слитков &7(&eII&7)", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(14));
    public static final SlimefunItemStack ELECTRIC_INGOT_FACTORY_3 = new SlimefunItemStack("ELECTRIC_INGOT_FACTORY_3", Material.RED_TERRACOTTA, "&cЭлектрическая фабрика слитков &7(&eIII&7)", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(8), LoreBuilder.powerPerSecond(40));

    public static final SlimefunItemStack FLUID_PUMP = new SlimefunItemStack("FLUID_PUMP", Material.BLUE_TERRACOTTA, "&9Жидкостный насос", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &732 Дж/Блок");
    public static final SlimefunItemStack CHARGING_BENCH = new SlimefunItemStack("CHARGING_BENCH", Material.CRAFTING_TABLE, "&6Зарядная станция", "", "&fЗаряжает такие предметы, как реактивные ранцы", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerBuffer(128), "&8\u21E8 &e\u26A1 &7Потеря энергии: &c50%");

    public static final SlimefunItemStack VANILLA_AUTO_CRAFTER = new SlimefunItemStack("VANILLA_AUTO_CRAFTER", HeadTexture.VANILLA_AUTO_CRAFTER, "&2Авто-верстак &8(Обычный)", MelonUtils.splitLore("", "&fПоместите эту машину на сундук или что-то подобное и заставьте ее создать все, что можно создать используя обычный &eВерстак", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &716 Дж/Предмет"));
    public static final SlimefunItemStack ENHANCED_AUTO_CRAFTER = new SlimefunItemStack("ENHANCED_AUTO_CRAFTER", HeadTexture.ENHANCED_AUTO_CRAFTER, "&2Авто-верстак &8(Улучшенный)", MelonUtils.splitLore("", "&fПоместите эту машину на сундук или что-то подобное и заставьте ее создать все, что можно создать используя &eУлучшенный верстак", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &716 Дж/Предмет"));
    public static final SlimefunItemStack ARMOR_AUTO_CRAFTER = new SlimefunItemStack("ARMOR_AUTO_CRAFTER", HeadTexture.ARMOR_AUTO_CRAFTER, "&2Авто-верстак &8(Конструктор доспехов)", MelonUtils.splitLore("", "&fПоместите эту машину на сундук или что-то подобное и заставьте ее создать все, что можно создать используя &eКонструктор доспехов", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), "&8\u21E8 &e\u26A1 &732 Дж/Предмет"));

    public static final SlimefunItemStack IRON_GOLEM_ASSEMBLER = new SlimefunItemStack("IRON_GOLEM_ASSEMBLER", Material.IRON_BLOCK, "&6Сборщик железных големов", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Задержка: &b30 Секунд", LoreBuilder.powerBuffer(4096), "&8\u21E8 &e\u26A1 &72048 Дж/Голем");
    public static final SlimefunItemStack WITHER_ASSEMBLER = new SlimefunItemStack("WITHER_ASSEMBLER", Material.OBSIDIAN, "&5Сборщик иссушителей", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), "&8\u21E8 &7Задержка: &b30 Секунд", LoreBuilder.powerBuffer(4096), "&8\u21E8 &e\u26A1 &74096 Дж/Визер");

    public static final SlimefunItemStack TRASH_CAN = new SlimefunItemStack("TRASH_CAN_BLOCK", HeadTexture.TRASH_CAN, "&3Мусорка", "", "&fУничтожит все предметы, помещенные в него");

    public static final SlimefunItemStack ELYTRA_SCALE = new SlimefunItemStack("ELYTRA_SCALE", Material.FEATHER, "&bЧешуя элитр");
    public static final SlimefunItemStack INFUSED_ELYTRA = new SlimefunItemStack("INFUSED_ELYTRA", Material.ELYTRA, "&5Усиленные элитры");
    public static final SlimefunItemStack SOULBOUND_ELYTRA = new SlimefunItemStack("SOULBOUND_ELYTRA", Material.ELYTRA, "&cБезутратные элитры");

    public static final SlimefunItemStack MAGNESIUM_SALT = new SlimefunItemStack("MAGNESIUM_SALT", Material.SUGAR, "&cМагниевая соль", MelonUtils.splitLore("", "&7Особый вид топлива, который может быть использован в магниевом генераторе"));
    public static final SlimefunItemStack MAGNESIUM_GENERATOR = new SlimefunItemStack("MAGNESIUM_GENERATOR", HeadTexture.GENERATOR, "&cМагниевый генератор", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.GENERATOR), LoreBuilder.powerBuffer(128), LoreBuilder.powerPerSecond(36));

    static {
        INFUSED_ELYTRA.addUnsafeEnchantment(Enchantment.MENDING, 1);
    }
}
