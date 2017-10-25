package com.mrtrollnugnug.bearwithme.item;

import com.mrtrollnugnug.bearwithme.client.model.ModelBearChestCurrent;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemBlackChestArmor extends ItemArmor {

	public static final String BLACK_CHEST = "bearwithme:textures/models/armor/black_bear_chest.png";

	public ItemBlackChestArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
	}

	@Override
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default) {
		ModelBiped armorModel = new ModelBearChestCurrent();
		
		armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
		armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
		armorModel.bipedBody.showModel = (armorSlot == EntityEquipmentSlot.CHEST)
				|| (armorSlot == EntityEquipmentSlot.CHEST);
		armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
		armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.CHEST;
		armorModel.bipedRightLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS)
				|| (armorSlot == EntityEquipmentSlot.FEET);
		armorModel.bipedLeftLeg.showModel = (armorSlot == EntityEquipmentSlot.LEGS)
				|| (armorSlot == EntityEquipmentSlot.FEET);

		armorModel.isSneak = _default.isSneak;
		armorModel.isRiding = _default.isRiding;
		armorModel.isChild = _default.isChild;
		armorModel.rightArmPose = _default.rightArmPose;
		armorModel.leftArmPose = _default.leftArmPose;
		return armorModel;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return ItemBlackChestArmor.BLACK_CHEST;

	}
}
