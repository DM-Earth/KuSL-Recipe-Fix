package com.dm.earth.modid;

import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Modid implements ModInitializer {
	public static final String MODID = "modid";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize(ModContainer mod) {
	}

	public static Identifier asIdentifier(String id) {
		return new Identifier(MODID, id);
	}
}
