package me.km310.kotlinapi;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("KotlinAPI starting...");

        KotlinLoader.load(this);

        getLogger().info("KotlinAPI loaded Project Licensed under MIT and GNU GPLv3 (c) KM310/Julius");
    }
}