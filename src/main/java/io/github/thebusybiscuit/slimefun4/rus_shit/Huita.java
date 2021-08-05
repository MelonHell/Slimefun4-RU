package io.github.thebusybiscuit.slimefun4.rus_shit;

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Huita {
     private static final String[] table = {
            "'!,.:;|i",
            "`l",
            " \"()*[]{}It",
            "<>fkгк",
            "-#$%&/?\\^_+=0123456789aAbBcCdDeEFgGhHjJKLmMnNoOpPqQrRsSTuUvVwWxXyYzZаАбБвВГеЕёЁжзЗиИйЙКлЛмМнНоОпПрРсСтТуУфхХцчЧшьЬэЭяЯ",
            "@~дДЦщъЪы",
            "ЖФШЫюЮ",
            "Щ",
            "№"
    };

//    public static void addLore(ItemStack itemStack, String... strings) {
//        ItemMeta meta = itemStack.getItemMeta();
//        List<String> lore = meta.getLore();
//        lore.addAll(Huita.generateLore(strings));
//        meta.setLore(lore);
//        itemStack.setItemMeta(meta);
//    }

    public static int getSize(String string) {
        int size = 0;
        for (int i = 0; i < string.length(); i++) {
            char charAt = string.charAt(i);
            if (charAt == '&') {
                i++;
                continue;
            }
            int charSize = 0;
            for (int j = 0; j < table.length; j++) {
                if (table[j].indexOf(charAt) >= 0) {
                    charSize = j + 1;
                }
            }
            size += charSize;
            if (i != string.length() -1) size++;
        }
        return size;
    }

    public static String[] generateLore(String... strings) {
        List<String> lore = new ArrayList<>();
        for (String string : strings) {
            String color = "";
            while (string.startsWith("&")) {
                color += "&" + string.charAt(1);
                string = string.replaceFirst("&" + string.charAt(1), "");
            }
            lore.addAll(huita(string, color, 192));
        }
        return lore.toArray(new String[0]);
    }

    public static List<String> huita(String string, String color, int maxLineSize) {
        String[] split = string.split(" ");
        List<String> result = new ArrayList<>();
        String buf = null;
        for (int i = 0; i < split.length; i++) {
            if (buf == null) buf = split[i];
            else buf += " " + split[i];

            if (i == split.length - 1 || getSize(buf + " " + split[i + 1]) >= maxLineSize) {
                result.add(ChatColor.translateAlternateColorCodes('&', color + buf));
                buf = null;
            }
        }
        return result;
    }
}
