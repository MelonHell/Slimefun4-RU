package io.github.thebusybiscuit.slimefun4.core.attributes;

import javax.annotation.Nonnull;

public enum MachineTier {

    BASIC("&eБазовый"),
    AVERAGE("&6Продвинутый"),
    MEDIUM("&aСредний"),
    GOOD("&2Модернезированный"),
    ADVANCED("&6Улучшенный"),
    END_GAME("&4Финальный");

    private final String prefix;

    MachineTier(@Nonnull String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return prefix;
    }

}
