package com.yakasov;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoBedTooFar implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("nobedtoofar");

    @Override
    public void onInitialize() {
        LOGGER.info("Loading NoBedTooFar...");
    }
}