package com.mrtrollnugnug.bearwithme;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy {

	public void preInit() 
	{

	}
	public void init() {
		Collection<Biome> gList = new ArrayList<>();
		gList.addAll(BiomeDictionary.getBiomes(Type.PLAINS));
		gList.addAll(BiomeDictionary.getBiomes(Type.FOREST));
		gList.addAll(BiomeDictionary.getBiomes(Type.HILLS));
		EntityRegistry.registerModEntity(new ResourceLocation(BearWithMe.MOD_ID, "entity/new_grizzly_bear"), EntityGrizzlyBear.class, "grizzlybear", 1, BearWithMe.instance, 80, 3, true, new Color(255, 255, 255).getRGB(),
				new Color(119, 84, 57).getRGB());
		EntityRegistry.addSpawn(EntityGrizzlyBear.class, 2, 1, 1, EnumCreatureType.MONSTER,
				gList.toArray(new Biome[0]));
		
		
		Collection<Biome> bList = new ArrayList<>();
		bList.addAll(BiomeDictionary.getBiomes(Type.CONIFEROUS));
		bList.addAll(BiomeDictionary.getBiomes(Type.MESA));
		bList.addAll(BiomeDictionary.getBiomes(Type.SAVANNA));
		bList.addAll(BiomeDictionary.getBiomes(Type.SPOOKY));
		
		EntityRegistry.registerModEntity(new ResourceLocation(BearWithMe.MOD_ID, "entity/black_bear"), EntityBlackBear.class, "blackbear", 2,
				BearWithMe.instance, 80, 3, true, new Color(255, 255, 255).getRGB(),
				new Color(0, 0, 0).getRGB());
		EntityRegistry.addSpawn(EntityBlackBear.class, 2, 1, 1, EnumCreatureType.MONSTER,
				bList.toArray(new Biome[0]));
		
		//sounds
		
		
		
	}

	public void postInit() 
	{

	}

}