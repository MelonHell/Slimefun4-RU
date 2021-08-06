package io.github.thebusybiscuit.slimefun4.melonhell;

import org.bukkit.ChatColor;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class MelonUtils {
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

    private static int getSize(String string) {
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

    public static String[] splitLore(String... strings) {
        List<String> lore = new ArrayList<>();
        for (String string : strings) {
            String color = "";
            while (string.startsWith("&")) {
                color += "&" + string.charAt(1);
                string = string.replaceFirst("&" + string.charAt(1), "");
            }
            lore.addAll(split(string, color, 192));
        }
        return lore.toArray(new String[0]);
    }

    private static List<String> split(String string, String color, int maxLineSize) {
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

    public static @Nonnull
    String russianHuita(int num, String a, String b, String c) {
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
