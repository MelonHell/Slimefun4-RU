package io.github.thebusybiscuit.slimefun4.rus_shit;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Huita {

    public static void main(String[] args) {
        System.out.println(getSize("pipi&4daster"));
//        String[] split = huita("Когда у тебя есть этот талисман в ячейке инвентаря, он будет добавлять 80% бонус удачи при зачаровании Ты переодически будешь получать дополнительные зачаровывания", "", 192);
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }
    }

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

    public static void addLore(ItemStack itemStack, String string, String color) {
        ItemMeta meta = itemStack.getItemMeta();
        List<String> lore = meta.getLore();
        lore.addAll(Huita.huita(string, color));
        meta.setLore(lore);
        itemStack.setItemMeta(meta);
    }

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

    public static List<String> huita(String string, String color) {
        return huita(string, color, 192);
    }

    public static List<String> huita(String string, String color, int maxLineSize) {
        String[] split = string.split(" ");
        List<String> result = new ArrayList<>();
        String buf = null;
        for (int i = 0; i < split.length; i++) {
            if (buf == null) buf = split[i];
            else buf += " " + split[i];

            if (i != split.length - 1) {
                if (getSize(buf + " " + split[i + 1]) >= maxLineSize) {
                    result.add(color + buf);
                    buf = null;
                }
            } else {
                result.add(color + buf);
                buf = null;
            }
        }
        return result;
    }
}
