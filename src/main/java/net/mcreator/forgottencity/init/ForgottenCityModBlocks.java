
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.forgottencity.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.forgottencity.block.TestBlock;
import net.mcreator.forgottencity.block.Test2Block;
import net.mcreator.forgottencity.ForgottenCityMod;

public class ForgottenCityModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ForgottenCityMod.MODID);
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
	public static final RegistryObject<Block> TEST_2 = REGISTRY.register("test_2", () -> new Test2Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
