package org.nrnr.neverdies;

import net.fabricmc.api.ClientModInitializer;

public class NeverdiesMod implements ClientModInitializer {
    public static final String MOD_NAME = "Neverdies";
    public static final String MOD_VER = "1.0.7";
    public static int finaluid = -1;

    @Override
    public void onInitializeClient() {
        Neverdies.init();
    }
}


