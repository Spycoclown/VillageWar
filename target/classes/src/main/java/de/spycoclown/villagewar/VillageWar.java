package de.spycoclown.villagewar;

import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;

// Imports for logger
import com.google.inject.Inject;
import org.slf4j.Logger;

@Plugin(id = "villagewar", name = "Village War Plugin", version = "1.0", description = "This Plugin is used to make war between to villages.")
public class VillageWar {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
        logger.info("Successfully running ExamplePlugin!!!");
    }

}
