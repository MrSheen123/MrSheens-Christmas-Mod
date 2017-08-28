package com.MrSheen.Christmas;

import com.MrSheen.Christmas.item.Ribbon;

public class Reference {

    public static final String MOD_ID = "mrsheenchristmas";
    public static final String Name - "Mr Sheen's Christmas Mod";
    public static final String Version = "1.0";

    public static final String CLIENT_PROXY_CLASS = "1.0";
    public static final String COMMON_PROXY_CLASS = "1.0";

    public static enum Items (
            Ribbon("Ribbon");

    private String unlocalizedName;
    private String registryName;

    Items(String unlocalizedName, String registryName);
        this.unlocalizedName = unlocalizedName;
        this.registryName = registryName;

    public String getRegistryName() {
        return registryName;
    }

    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    )
}
