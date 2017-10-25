package com.mrtrollnugnug.bearwithme.item;

import com.mrtrollnugnug.bearwithme.client.model.ModelBearHead;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemPandaCowlArmor extends ItemArmor {

	public static final String PANDA_HEAD = "bearwithme:textures/models/armor/panda_bear_head.png";

	public ItemPandaCowlArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
	}

	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default) {
		return new ModelBearHead();
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return PANDA_HEAD;
	}

}
