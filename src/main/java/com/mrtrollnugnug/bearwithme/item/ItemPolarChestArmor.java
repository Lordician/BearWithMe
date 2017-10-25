package com.mrtrollnugnug.bearwithme.item;

import com.mrtrollnugnug.bearwithme.client.model.ModelBearChestCurrent;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemPolarChestArmor extends ItemArmor {

	public static final String POLAR_CHEST = "bearwithme:textures/models/armor/polar_bear_chest.png";

	public ItemPolarChestArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
	}

	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default) {
		return new ModelBearChestCurrent();
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return ItemPolarChestArmor.POLAR_CHEST;

	}
}
