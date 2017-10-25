package com.mrtrollnugnug.bearwithme.handler;

import java.util.ArrayList;
import java.util.Collection;

import com.mrtrollnugnug.bearwithme.BearWithMe;
import com.mrtrollnugnug.bearwithme.common.entity.EntityBlackBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityGrizzlyBear;
import com.mrtrollnugnug.bearwithme.common.entity.EntityPandaBear;
import com.mrtrollnugnug.bearwithme.item.ItemBlackBootsArmor;
import com.mrtrollnugnug.bearwithme.item.ItemBlackChestArmor;
import com.mrtrollnugnug.bearwithme.item.ItemBlackCowlArmor;
import com.mrtrollnugnug.bearwithme.item.ItemBlackLegsArmor;
import com.mrtrollnugnug.bearwithme.item.ItemGrizzlyBootsArmor;
import com.mrtrollnugnug.bearwithme.item.ItemGrizzlyChestArmor;
import com.mrtrollnugnug.bearwithme.item.ItemGrizzlyCowlArmor;
import com.mrtrollnugnug.bearwithme.item.ItemGrizzlyLegsArmor;
import com.mrtrollnugnug.bearwithme.item.ItemHide;
import com.mrtrollnugnug.bearwithme.item.ItemPandaBootsArmor;
import com.mrtrollnugnug.bearwithme.item.ItemPandaChestArmor;
import com.mrtrollnugnug.bearwithme.item.ItemPandaCowlArmor;
import com.mrtrollnugnug.bearwithme.item.ItemPandaLegsArmor;
import com.mrtrollnugnug.bearwithme.item.ItemPolarBootsArmor;
import com.mrtrollnugnug.bearwithme.item.ItemPolarChestArmor;
import com.mrtrollnugnug.bearwithme.item.ItemPolarCowlArmor;
import com.mrtrollnugnug.bearwithme.item.ItemPolarLegsArmor;
import com.mrtrollnugnug.bearwithme.lib.ModUtils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.SetCount;
import net.minecraft.world.storage.loot.functions.SetMetadata;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContentHandler {

	// Generic Items
	public static Item itemHide;

	// Armor Items
	public static Item itemPolarBearBoots;
	public static Item itemPolarBearLegs;
	public static Item itemPolarBearChest;
	public static Item itemPolarBearHead;

	public static Item itemGrizzlyBearBoots;
	public static Item itemGrizzlyBearLegs;
	public static Item itemGrizzlyBearChest;
	public static Item itemGrizzlyBearHead;

	public static Item itemBlackBearBoots;
	public static Item itemBlackBearLegs;
	public static Item itemBlackBearChest;
	public static Item itemBlackBearHead;

	public static Item itemPandaBearBoots;
	public static Item itemPandaBearLegs;
	public static Item itemPandaBearChest;
	public static Item itemPandaBearHead;

	public static final ResourceLocation ENTITIES_GRIZZLY_BEAR = LootTableList
			.register(new ResourceLocation("bearwithme:entities/grizzly_bear"));
	public static final ResourceLocation ENTITIES_BLACK_BEAR = LootTableList
			.register(new ResourceLocation("bearwithme:entities/black_bear"));
	public static final ResourceLocation ENTITIES_PANDA_BEAR = LootTableList
			.register(new ResourceLocation("bearwithme:entities/panda_bear"));

	public static final CreativeTabs CREATIVE_TAB = new CreativeTabs("BearWithMeTab") {
		public ItemStack getTabIconItem() {
			return new ItemStack(itemHide);
		}
	};
	
	public static void initBlocks() {
		//No blocks yet...
	}

	public static void initItems() {
		// Armor Materials
		ArmorMaterial POLAR_BEAR = EnumHelper.addArmorMaterial("polar_bear", "bearwithme:polar_bear", 5,
				new int[] { 3, 4, 5, 3 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		ArmorMaterial GRIZZLY_BEAR = EnumHelper.addArmorMaterial("grizzly_bear", "bearwithme:grizzly_bear", 5,
				new int[] { 3, 4, 6, 3 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		ArmorMaterial BLACK_BEAR = EnumHelper.addArmorMaterial("black_bear", "bearwithme:black_bear", 5,
				new int[] { 3, 4, 5, 2 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
		ArmorMaterial PANDA_BEAR = EnumHelper.addArmorMaterial("panda_bear", "bearwithme:panda_bear", 5,
				new int[] { 2, 2, 3, 1 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

		//Generic Items
				itemHide = new ItemHide();
				ModUtils.registerItem(itemHide, "hide_bear");
				
				//Armor Items
				itemPolarBearBoots = new ItemPolarBootsArmor(POLAR_BEAR, 0, EntityEquipmentSlot.FEET);
				itemPolarBearLegs = new ItemPolarLegsArmor(POLAR_BEAR, 0, EntityEquipmentSlot.LEGS);
				itemPolarBearChest = new ItemPolarChestArmor(POLAR_BEAR, 0, EntityEquipmentSlot.CHEST);
				itemPolarBearHead = new ItemPolarCowlArmor(POLAR_BEAR, 0, EntityEquipmentSlot.HEAD);

				ModUtils.registerItem(itemPolarBearBoots, "polar_bear_boots");
				ModUtils.registerItem(itemPolarBearLegs, "polar_bear_legs");
				ModUtils.registerItem(itemPolarBearChest, "polar_bear_chest");
				ModUtils.registerItem(itemPolarBearHead, "polar_bear_head");
				
				itemGrizzlyBearBoots = new ItemGrizzlyBootsArmor(GRIZZLY_BEAR, 0, EntityEquipmentSlot.FEET);
				itemGrizzlyBearLegs = new ItemGrizzlyLegsArmor(GRIZZLY_BEAR, 0, EntityEquipmentSlot.LEGS);
				itemGrizzlyBearChest = new ItemGrizzlyChestArmor(GRIZZLY_BEAR, 0, EntityEquipmentSlot.CHEST);
				itemGrizzlyBearHead = new ItemGrizzlyCowlArmor(GRIZZLY_BEAR, 0, EntityEquipmentSlot.HEAD);
				
				ModUtils.registerItem(itemGrizzlyBearBoots, "grizzly_bear_boots");
				ModUtils.registerItem(itemGrizzlyBearLegs, "grizzly_bear_legs");
				ModUtils.registerItem(itemGrizzlyBearChest, "grizzly_bear_chest");
				ModUtils.registerItem(itemGrizzlyBearHead, "grizzly_bear_head");		
				
				itemBlackBearBoots = new ItemBlackBootsArmor(BLACK_BEAR, 0, EntityEquipmentSlot.FEET);
				itemBlackBearLegs = new ItemBlackLegsArmor(BLACK_BEAR, 0, EntityEquipmentSlot.LEGS);
				itemBlackBearChest = new ItemBlackChestArmor(BLACK_BEAR, 0, EntityEquipmentSlot.CHEST);
				itemBlackBearHead = new ItemBlackCowlArmor(BLACK_BEAR, 0, EntityEquipmentSlot.HEAD);
				
				ModUtils.registerItem(itemBlackBearBoots, "black_bear_boots");
				ModUtils.registerItem(itemBlackBearLegs, "black_bear_legs");
				ModUtils.registerItem(itemBlackBearChest, "black_bear_chest");
				ModUtils.registerItem(itemBlackBearHead, "black_bear_head");
				
				itemPandaBearBoots = new ItemPandaBootsArmor(PANDA_BEAR, 0, EntityEquipmentSlot.FEET);
				itemPandaBearLegs = new ItemPandaLegsArmor(PANDA_BEAR, 0, EntityEquipmentSlot.LEGS);
				itemPandaBearChest = new ItemPandaChestArmor(PANDA_BEAR, 0, EntityEquipmentSlot.CHEST);
				itemPandaBearHead = new ItemPandaCowlArmor(PANDA_BEAR, 0, EntityEquipmentSlot.HEAD);
				
				ModUtils.registerItem(itemPandaBearBoots, "panda_bear_boots");
				ModUtils.registerItem(itemPandaBearLegs, "panda_bear_legs");
				ModUtils.registerItem(itemPandaBearChest, "panda_bear_chest");
				ModUtils.registerItem(itemPandaBearHead, "panda_bear_head");
	}
	
	@SubscribeEvent
	public void onLootTablesLoaded(LootTableLoadEvent event) {
		if (event.getName().equals(LootTableList.ENTITIES_POLAR_BEAR)) {
			final LootPool main = event.getTable().getPool("main");
			if (main != null) {
				main.addEntry(new LootEntryItem(ContentHandler.itemHide, 4, 0,
						new LootFunction[] { new SetCount(new LootCondition[0], new RandomValueRange(1, 4)),
								new SetMetadata(new LootCondition[0], new RandomValueRange(3, 3)) },
						new LootCondition[0], "loottable:polar_bear_hide"));
			}
		}
	}
	
	

	public static void initRecipes() {
	}

	@SideOnly(Side.CLIENT)
	public static void onClientPreInit() {
		ModUtils.registerItemInvModel(itemHide, "hide_bear", ItemHide.varients);

		ModUtils.registerItemInvModel(itemPolarBearBoots);
		ModUtils.registerItemInvModel(itemPolarBearLegs);
		ModUtils.registerItemInvModel(itemPolarBearChest);
		ModUtils.registerItemInvModel(itemPolarBearHead);

		ModUtils.registerItemInvModel(itemGrizzlyBearBoots);
		ModUtils.registerItemInvModel(itemGrizzlyBearLegs);
		ModUtils.registerItemInvModel(itemGrizzlyBearChest);
		ModUtils.registerItemInvModel(itemGrizzlyBearHead);

		ModUtils.registerItemInvModel(itemBlackBearBoots);
		ModUtils.registerItemInvModel(itemBlackBearLegs);
		ModUtils.registerItemInvModel(itemBlackBearChest);
		ModUtils.registerItemInvModel(itemBlackBearHead);

		ModUtils.registerItemInvModel(itemPandaBearBoots);
		ModUtils.registerItemInvModel(itemPandaBearLegs);
		ModUtils.registerItemInvModel(itemPandaBearChest);
		ModUtils.registerItemInvModel(itemPandaBearHead);
	}

	public static void initEntities() {
		
		final int redbrown = 10507321;
		final int white = 16777215;
		final int black = 0;

		// Second param in addSpawn controls entity spawn rate
		EntityRegistry.registerModEntity(ContentHandler.ENTITIES_GRIZZLY_BEAR, EntityGrizzlyBear.class, "grizzlybear",
				1, BearWithMe.instance, 80, 3, true, white, redbrown);
		EntityRegistry.addSpawn(EntityGrizzlyBear.class, 1, ConfigurationHandler.getSpawnRateGrizzly(), 1,
				EnumCreatureType.MONSTER, getBiomesForTypes(Type.PLAINS, Type.FOREST, Type.HILLS));

		EntityRegistry.registerModEntity(ContentHandler.ENTITIES_BLACK_BEAR, EntityBlackBear.class, "blackbear", 2,
				BearWithMe.instance, 80, 3, true, redbrown, black);
		EntityRegistry.addSpawn(EntityBlackBear.class, 1, ConfigurationHandler.getSpawnRateBlack(), 1,
				EnumCreatureType.MONSTER,
				getBiomesForTypes(Type.CONIFEROUS, Type.MESA, Type.SAVANNA, Type.SPOOKY));

		EntityRegistry.registerModEntity(ContentHandler.ENTITIES_PANDA_BEAR, EntityPandaBear.class, "pandabear", 3,
				BearWithMe.instance, 80, 3, true, white, black);
		EntityRegistry.addSpawn(EntityPandaBear.class, 1, ConfigurationHandler.getSpawnRatePanda(), 1,
				EnumCreatureType.CREATURE, getBiomesForTypes(Type.JUNGLE));
	}
	
	private static Biome[] getBiomesForTypes(Type... types) {

		final Collection<Biome> biomes = new ArrayList<>();

		for (final Type type : types) {

			biomes.addAll(BiomeDictionary.getBiomes(type));
		}

		return biomes.toArray(new Biome[0]);
	}
}
