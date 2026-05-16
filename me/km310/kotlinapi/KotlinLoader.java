package me.km310.kotlinapi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import org.bukkit.plugin.java.JavaPlugin;

public class KotlinLoader {

    public static void load(JavaPlugin plugin) {
        try {

            // Datei wo kotlin später landet
            File file = new File(plugin.getDataFolder(), "kotlin-stdlib.jar");

            // Falls noch nicht entpackt -> aus der Plugin JAR holen
            if (!file.exists()) {

                file.getParentFile().mkdirs();

                try (
                    InputStream in = plugin.getResource("lib/kotlin-stdlib.jar");
                    FileOutputStream out = new FileOutputStream(file)
                ) {

                    if (in == null) {
                        plugin.getLogger().warning("Embedded kotlin-stdlib.jar not found!");
                        return;
                    }

                    byte[] buffer = new byte[8192];
                    int len;

                    while ((len = in.read(buffer)) != -1) {
                        out.write(buffer, 0, len);
                    }
                }

                plugin.getLogger().info("Extracted Kotlin stdlib.");
            }

            // In System ClassLoader injecten
            URL url = file.toURI().toURL();

            URLClassLoader sysLoader =
                    (URLClassLoader) ClassLoader.getSystemClassLoader();

            Method method =
                    URLClassLoader.class.getDeclaredMethod("addURL", URL.class);

            method.setAccessible(true);
            method.invoke(sysLoader, url);

            plugin.getLogger().info("Injected Kotlin into system classloader!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}