package com.mrtrollnugnug.bearwithme.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * Zombie - Unknown Created using Tabula 5.1.0
 */
public class ModelBearChest extends ModelArmorExtended {
	public ModelRenderer LeftShoulderCubeWHOLE;
	public ModelRenderer RightShoulderCubeWHOLE;
	public ModelRenderer ChestHangBottom;
	public ModelRenderer ChestBackTop;
	public ModelRenderer ChestFrontHangRight;
	public ModelRenderer ChestBackMid;
	public ModelRenderer ChestInsideBackEdgeRight;
	public ModelRenderer ChestInsideMid;
	public ModelRenderer ChestFrontMid;
	public ModelRenderer ChestInsideBackEdgeLeft;
	public ModelRenderer ChestFrontHangMidLeft;
	public ModelRenderer ChestFrontHangMidRight;
	public ModelRenderer ChestInsideMid_1;
	public ModelRenderer ChestInsideFrontHang;
	public ModelRenderer ChestFrontHangLeft;
	public ModelRenderer ChestBackHangRight;
	public ModelRenderer ChestBackHangMidLeft;
	public ModelRenderer ChestTop;
	public ModelRenderer ChestFrontTop;
	public ModelRenderer RightNecklaceWHOLE;
	public ModelRenderer LeftNecklaceWHOLE;
	public ModelRenderer MidNecklacePieceWHOLE;
	public ModelRenderer Outside;
	public ModelRenderer Inside;
	public ModelRenderer Front;
	public ModelRenderer Back;
	public ModelRenderer LeftWristWHOLE;
	public ModelRenderer FrontTop;
	public ModelRenderer TopInside;
	public ModelRenderer BottomInside;
	public ModelRenderer BackTop;
	public ModelRenderer BackBottom;
	public ModelRenderer BackMiddle;
	public ModelRenderer LeftBackClawTop;
	public ModelRenderer FrontMiddle;
	public ModelRenderer InsideMiddle;
	public ModelRenderer FrontBottom;
	public ModelRenderer LeftBackClawMid;
	public ModelRenderer LeftFrontClawTop;
	public ModelRenderer LeftFrontClawMid;
	public ModelRenderer LeftBackClawBottm;
	public ModelRenderer LeftFrontClawBottom;
	public ModelRenderer Inside_1;
	public ModelRenderer Outside_1;
	public ModelRenderer Front_1;
	public ModelRenderer Back_1;
	public ModelRenderer RightWristWHOLE;
	public ModelRenderer InsideTop;
	public ModelRenderer InsideBottom;
	public ModelRenderer FrontTop_1;
	public ModelRenderer FrontBottom_1;
	public ModelRenderer FrontMiddle_1;
	public ModelRenderer RightFrontClawTop;
	public ModelRenderer BackMiddle_1;
	public ModelRenderer InsideMiddle_1;
	public ModelRenderer BackBottom_1;
	public ModelRenderer RightFrontClawMid;
	public ModelRenderer RightBackClawTop;
	public ModelRenderer RightBackClawMid;
	public ModelRenderer RightFrontClawBottom;
	public ModelRenderer RightBackClawBottom;
	public ModelRenderer BackTop_1;
	public ModelRenderer RightNeckplacePieceBottom;
	public ModelRenderer RightNecklacePieceMid;
	public ModelRenderer LeftNecklacePieceBottom;
	public ModelRenderer LeftNecklacePieceMid;
	public ModelRenderer MidNecklacePieceBottom;
	public ModelRenderer MidNecklacePieceMid;

	public ModelBearChest() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.LeftFrontClawBottom = new ModelRenderer(this, 34, 6);
		this.LeftFrontClawBottom.setRotationPoint(-3.0F, 5.0F, 1.0F);
		this.LeftFrontClawBottom.addBox(0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(LeftFrontClawBottom, 0.0F, 0.0F, -0.5235987755982988F);
		this.InsideTop = new ModelRenderer(this, 6, 1);
		this.InsideTop.setRotationPoint(4.0F, 0.0F, 0.0F);
		this.InsideTop.addBox(-3.0F, -2.0F, -2.0F, 1, 1, 5, 0.0F);
		this.BackMiddle = new ModelRenderer(this, 20, 5);
		this.BackMiddle.setRotationPoint(1.0F, 2.0F, 4.0F);
		this.BackMiddle.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.ChestHangBottom = new ModelRenderer(this, 37, 43);
		this.ChestHangBottom.setRotationPoint(3.0F, 12.0F, 3.8F);
		this.ChestHangBottom.addBox(-4.0F, 0.0F, -2.0F, 3, 3, 1, 0.0F);
		this.Inside_1 = new ModelRenderer(this, 39, 17);
		this.Inside_1.setRotationPoint(-0.5F, 0.0F, 0.5F);
		this.Inside_1.addBox(-3.0F, -2.0F, -2.0F, 1, 5, 3, 0.0F);
		this.Outside_1 = new ModelRenderer(this, 39, 17);
		this.Outside_1.setRotationPoint(3.5F, 0.0F, 0.5F);
		this.Outside_1.addBox(-3.0F, -2.0F, -2.0F, 1, 5, 3, 0.0F);
		this.ChestFrontHangRight = new ModelRenderer(this, 25, 36);
		this.ChestFrontHangRight.setRotationPoint(7.0F, 12.0F, -0.8F);
		this.ChestFrontHangRight.addBox(-4.0F, 0.0F, -2.0F, 1, 2, 1, 0.0F);
		this.FrontTop_1 = new ModelRenderer(this, 20, 5);
		this.FrontTop_1.setRotationPoint(1.0F, 0.0F, 4.0F);
		this.FrontTop_1.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.LeftBackClawTop = new ModelRenderer(this, 39, 6);
		this.LeftBackClawTop.setRotationPoint(-0.5F, 3.0F, 3.0F);
		this.LeftBackClawTop.addBox(-3.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F);
		this.RightNecklacePieceMid = new ModelRenderer(this, 29, 5);
		this.RightNecklacePieceMid.setRotationPoint(0.0F, 0.0F, 0.2F);
		this.RightNecklacePieceMid.addBox(-0.5F, 1.0F, 0.0F, 1, 2, 1, 0.0F);
		this.BackBottom_1 = new ModelRenderer(this, 20, 5);
		this.BackBottom_1.setRotationPoint(1.0F, 4.0F, 0.0F);
		this.BackBottom_1.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.ChestInsideMid = new ModelRenderer(this, 3, 32);
		this.ChestInsideMid.setRotationPoint(-1.0F, 0.0F, 0.0F);
		this.ChestInsideMid.addBox(-4.0F, 0.0F, -2.0F, 1, 12, 4, 0.0F);
		this.Back = new ModelRenderer(this, 25, 19);
		this.Back.setRotationPoint(-0.5F, 0.0F, 3.5F);
		this.Back.addBox(-3.0F, -2.0F, -2.0F, 5, 5, 1, 0.0F);
		this.Back_1 = new ModelRenderer(this, 25, 19);
		this.Back_1.setRotationPoint(-0.5F, 0.0F, 3.5F);
		this.Back_1.addBox(-3.0F, -2.0F, -2.0F, 5, 5, 1, 0.0F);
		this.Inside = new ModelRenderer(this, 39, 17);
		this.Inside.setRotationPoint(3.5F, 0.0F, 0.5F);
		this.Inside.addBox(-3.0F, -2.0F, -2.0F, 1, 5, 3, 0.0F);
		this.FrontBottom = new ModelRenderer(this, 20, 5);
		this.FrontBottom.setRotationPoint(1.0F, 4.0F, 0.0F);
		this.FrontBottom.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.ChestInsideFrontHang = new ModelRenderer(this, 58, 36);
		this.ChestInsideFrontHang.setRotationPoint(8.0F, 12.0F, 0.0F);
		this.ChestInsideFrontHang.addBox(-4.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F);
		this.Front_1 = new ModelRenderer(this, 1, 19);
		this.Front_1.setRotationPoint(-0.5F, 0.0F, -0.5F);
		this.Front_1.addBox(-3.0F, -2.0F, -2.0F, 5, 5, 1, 0.0F);
		this.Front = new ModelRenderer(this, 1, 19);
		this.Front.setRotationPoint(-0.5F, 0.0F, -0.5F);
		this.Front.addBox(-3.0F, -2.0F, -2.0F, 5, 5, 1, 0.0F);
		this.ChestInsideMid_1 = new ModelRenderer(this, 14, 32);
		this.ChestInsideMid_1.setRotationPoint(8.0F, 0.0F, 0.0F);
		this.ChestInsideMid_1.addBox(-4.0F, 0.0F, -2.0F, 1, 12, 4, 0.0F);
		this.ChestBackHangMidLeft = new ModelRenderer(this, 30, 44);
		this.ChestBackHangMidLeft.setRotationPoint(1.0F, 12.0F, 3.8F);
		this.ChestBackHangMidLeft.addBox(-4.0F, 0.0F, -2.0F, 2, 2, 1, 0.0F);
		this.InsideMiddle_1 = new ModelRenderer(this, 6, 1);
		this.InsideMiddle_1.setRotationPoint(4.0F, 2.0F, 0.0F);
		this.InsideMiddle_1.addBox(-3.0F, -2.0F, -2.0F, 1, 1, 5, 0.0F);
		this.BottomInside = new ModelRenderer(this, 6, 1);
		this.BottomInside.setRotationPoint(4.0F, 4.0F, 0.0F);
		this.BottomInside.addBox(-3.0F, -2.0F, -2.0F, 1, 1, 5, 0.0F);
		this.RightNeckplacePieceBottom = new ModelRenderer(this, 34, 6);
		this.RightNeckplacePieceBottom.setRotationPoint(0.0F, 3.0F, 0.2F);
		this.RightNeckplacePieceBottom.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(RightNeckplacePieceBottom, 0.5235987755982988F, 0.0F, 0.0F);
		this.ChestFrontHangMidRight = new ModelRenderer(this, 30, 35);
		this.ChestFrontHangMidRight.setRotationPoint(5.0F, 12.0F, -0.8F);
		this.ChestFrontHangMidRight.addBox(-4.0F, 0.0F, -2.0F, 2, 4, 1, 0.0F);
		this.ChestInsideBackEdgeLeft = new ModelRenderer(this, 25, 44);
		this.ChestInsideBackEdgeLeft.setRotationPoint(0.0F, 12.0F, 3.8F);
		this.ChestInsideBackEdgeLeft.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F);
		this.TopInside = new ModelRenderer(this, 6, 1);
		this.TopInside.setRotationPoint(4.0F, 0.0F, 0.0F);
		this.TopInside.addBox(-3.0F, -2.0F, -2.0F, 1, 1, 5, 0.0F);
		this.LeftBackClawMid = new ModelRenderer(this, 29, 5);
		this.LeftBackClawMid.setRotationPoint(0.0F, 5.0F, 3.0F);
		this.LeftBackClawMid.addBox(-3.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F);
		this.BackTop_1 = new ModelRenderer(this, 20, 5);
		this.BackTop_1.setRotationPoint(-2.0F, 0.0F, -3.0F);
		this.BackTop_1.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.setRotateAngle(BackTop_1, 3.141592653589793F, 0.0F, 3.141592653589793F);
		this.FrontMiddle = new ModelRenderer(this, 20, 5);
		this.FrontMiddle.setRotationPoint(1.0F, 2.0F, 0.0F);
		this.FrontMiddle.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.RightFrontClawMid = new ModelRenderer(this, 29, 5);
		this.RightFrontClawMid.setRotationPoint(0.0F, 5.0F, 3.0F);
		this.RightFrontClawMid.addBox(-3.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F);
		this.RightWristWHOLE = new ModelRenderer(this, 52, 14);
		this.RightWristWHOLE.setRotationPoint(-1.5F, 7.0F, 0.5F);
		this.RightWristWHOLE.addBox(-3.0F, -2.0F, -2.0F, 1, 5, 5, 0.0F);
		this.setRotateAngle(RightWristWHOLE, 3.141592653589793F, 0.0F, 3.141592653589793F);
		this.BackTop = new ModelRenderer(this, 20, 5);
		this.BackTop.setRotationPoint(1.0F, 0.0F, 4.0F);
		this.BackTop.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.ChestFrontTop = new ModelRenderer(this, 2, 58);
		this.ChestFrontTop.setRotationPoint(-2.0F, 2.0F, -1.0F);
		this.ChestFrontTop.addBox(-3.0F, -2.0F, -2.0F, 10, 5, 1, 0.0F);
		this.RightFrontClawTop = new ModelRenderer(this, 39, 6);
		this.RightFrontClawTop.setRotationPoint(-0.5F, 3.0F, 3.0F);
		this.RightFrontClawTop.addBox(-3.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F);
		this.FrontTop = new ModelRenderer(this, 20, 5);
		this.FrontTop.setRotationPoint(0.5F, 7.0F, -0.5F);
		this.FrontTop.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.LeftFrontClawTop = new ModelRenderer(this, 39, 6);
		this.LeftFrontClawTop.setRotationPoint(-0.5F, 3.0F, 1.0F);
		this.LeftFrontClawTop.addBox(-3.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F);
		this.RightBackClawTop = new ModelRenderer(this, 29, 5);
		this.RightBackClawTop.setRotationPoint(-0.5F, 3.0F, 1.0F);
		this.RightBackClawTop.addBox(-3.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F);
		this.RightFrontClawBottom = new ModelRenderer(this, 34, 6);
		this.RightFrontClawBottom.setRotationPoint(-3.0F, 5.0F, 3.0F);
		this.RightFrontClawBottom.addBox(0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(RightFrontClawBottom, 0.0F, 0.0F, -0.5235987755982988F);
		this.BackMiddle_1 = new ModelRenderer(this, 20, 5);
		this.BackMiddle_1.setRotationPoint(1.0F, 2.0F, 0.0F);
		this.BackMiddle_1.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.InsideMiddle = new ModelRenderer(this, 6, 1);
		this.InsideMiddle.setRotationPoint(4.0F, 2.0F, 0.0F);
		this.InsideMiddle.addBox(-3.0F, -2.0F, -2.0F, 1, 1, 5, 0.0F);
		this.RightNecklaceWHOLE = new ModelRenderer(this, 1, 9);
		this.RightNecklaceWHOLE.setRotationPoint(1.6F, 2.0F, -4.0F);
		this.RightNecklaceWHOLE.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(RightNecklaceWHOLE, 0.0F, 0.0F, -0.5235987755982988F);
		this.RightBackClawMid = new ModelRenderer(this, 29, 5);
		this.RightBackClawMid.setRotationPoint(0.0F, 5.0F, 1.0F);
		this.RightBackClawMid.addBox(-3.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F);
		this.RightShoulderCubeWHOLE = new ModelRenderer(this, 1, 14);
		this.RightShoulderCubeWHOLE.setRotationPoint(8.0F, 1.5F, 0.0F);
		this.RightShoulderCubeWHOLE.addBox(-2.5F, -2.0F, -1.5F, 3, 1, 3, 0.0F);
		this.ChestTop = new ModelRenderer(this, 1, 26);
		this.ChestTop.setRotationPoint(-1.0F, 1.9F, 0.0F);
		this.ChestTop.addBox(-3.0F, -2.0F, -2.0F, 8, 1, 4, 0.0F);
		this.ChestBackHangRight = new ModelRenderer(this, 46, 44);
		this.ChestBackHangRight.setRotationPoint(6.0F, 12.0F, 3.8F);
		this.ChestBackHangRight.addBox(-4.0F, 0.0F, -2.0F, 2, 2, 1, 0.0F);
		this.LeftShoulderCubeWHOLE = new ModelRenderer(this, 1, 14);
		this.LeftShoulderCubeWHOLE.setRotationPoint(-6.0F, 1.5F, 0.0F);
		this.LeftShoulderCubeWHOLE.addBox(-2.5F, -2.0F, -1.5F, 3, 1, 3, 0.0F);
		this.MidNecklacePieceBottom = new ModelRenderer(this, 34, 6);
		this.MidNecklacePieceBottom.setRotationPoint(0.0F, 3.0F, 0.2F);
		this.MidNecklacePieceBottom.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(MidNecklacePieceBottom, 0.5235987755982988F, 0.0F, 0.0F);
		this.ChestInsideBackEdgeRight = new ModelRenderer(this, 52, 39);
		this.ChestInsideBackEdgeRight.setRotationPoint(8.0F, 12.0F, 2.0F);
		this.ChestInsideBackEdgeRight.addBox(-4.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
		this.FrontMiddle_1 = new ModelRenderer(this, 20, 5);
		this.FrontMiddle_1.setRotationPoint(1.0F, 2.0F, 4.0F);
		this.FrontMiddle_1.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.ChestFrontHangLeft = new ModelRenderer(this, 46, 37);
		this.ChestFrontHangLeft.setRotationPoint(0.0F, 12.0F, -0.8F);
		this.ChestFrontHangLeft.addBox(-4.0F, 0.0F, -2.0F, 2, 2, 1, 0.0F);
		this.RightBackClawBottom = new ModelRenderer(this, 34, 6);
		this.RightBackClawBottom.setRotationPoint(-3.0F, 5.0F, 1.0F);
		this.RightBackClawBottom.addBox(0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(RightBackClawBottom, 0.0F, 0.0F, -0.5235987755982988F);
		this.ChestBackTop = new ModelRenderer(this, 25, 58);
		this.ChestBackTop.setRotationPoint(-2.0F, 2.0F, 4.0F);
		this.ChestBackTop.addBox(-3.0F, -2.0F, -2.0F, 10, 5, 1, 0.0F);
		this.FrontBottom_1 = new ModelRenderer(this, 20, 5);
		this.FrontBottom_1.setRotationPoint(1.0F, 4.0F, 4.0F);
		this.FrontBottom_1.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.ChestFrontHangMidLeft = new ModelRenderer(this, 37, 36);
		this.ChestFrontHangMidLeft.setRotationPoint(2.0F, 12.0F, -0.8F);
		this.ChestFrontHangMidLeft.addBox(-4.0F, 0.0F, -2.0F, 3, 3, 1, 0.0F);
		this.Outside = new ModelRenderer(this, 39, 17);
		this.Outside.setRotationPoint(-0.5F, 0.0F, 0.5F);
		this.Outside.addBox(-3.0F, -2.0F, -2.0F, 1, 5, 3, 0.0F);
		this.InsideBottom = new ModelRenderer(this, 6, 1);
		this.InsideBottom.setRotationPoint(4.0F, 4.0F, 0.0F);
		this.InsideBottom.addBox(-3.0F, -2.0F, -2.0F, 1, 1, 5, 0.0F);
		this.LeftBackClawBottm = new ModelRenderer(this, 34, 6);
		this.LeftBackClawBottm.setRotationPoint(-3.0F, 5.0F, 3.0F);
		this.LeftBackClawBottm.addBox(0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(LeftBackClawBottm, 0.0F, 0.0F, -0.5235987755982988F);
		this.LeftNecklacePieceBottom = new ModelRenderer(this, 34, 6);
		this.LeftNecklacePieceBottom.setRotationPoint(0.0F, 3.0F, 0.2F);
		this.LeftNecklacePieceBottom.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(LeftNecklacePieceBottom, 0.5235987755982988F, 0.0F, 0.0F);
		this.MidNecklacePieceMid = new ModelRenderer(this, 29, 5);
		this.MidNecklacePieceMid.setRotationPoint(0.0F, 0.0F, 0.2F);
		this.MidNecklacePieceMid.addBox(-0.5F, 1.0F, 0.0F, 1, 2, 1, 0.0F);
		this.LeftNecklacePieceMid = new ModelRenderer(this, 29, 5);
		this.LeftNecklacePieceMid.setRotationPoint(0.0F, 0.0F, 0.2F);
		this.LeftNecklacePieceMid.addBox(-0.5F, 1.0F, 0.0F, 1, 2, 1, 0.0F);
		this.LeftWristWHOLE = new ModelRenderer(this, 52, 14);
		this.LeftWristWHOLE.setRotationPoint(-0.5F, 7.0F, -0.5F);
		this.LeftWristWHOLE.addBox(-3.0F, -2.0F, -2.0F, 1, 5, 5, 0.0F);
		this.ChestBackMid = new ModelRenderer(this, 4, 49);
		this.ChestBackMid.setRotationPoint(0.0F, 5.0F, 3.8F);
		this.ChestBackMid.addBox(-4.0F, 0.0F, -2.0F, 8, 7, 1, 0.0F);
		this.BackBottom = new ModelRenderer(this, 20, 5);
		this.BackBottom.setRotationPoint(1.0F, 4.0F, 4.0F);
		this.BackBottom.addBox(-3.0F, -2.0F, -2.0F, 3, 1, 1, 0.0F);
		this.LeftFrontClawMid = new ModelRenderer(this, 29, 5);
		this.LeftFrontClawMid.setRotationPoint(0.0F, 5.0F, 1.0F);
		this.LeftFrontClawMid.addBox(-3.0F, -2.0F, -2.0F, 1, 2, 1, 0.0F);
		this.LeftNecklaceWHOLE = new ModelRenderer(this, 1, 9);
		this.LeftNecklaceWHOLE.setRotationPoint(-1.4F, 2.0F, -4.0F);
		this.LeftNecklaceWHOLE.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(LeftNecklaceWHOLE, 0.0F, 0.0F, 0.5235987755982988F);
		this.ChestFrontMid = new ModelRenderer(this, 26, 49);
		this.ChestFrontMid.setRotationPoint(0.0F, 5.0F, -0.8F);
		this.ChestFrontMid.addBox(-4.0F, 0.0F, -2.0F, 8, 7, 1, 0.0F);
		this.MidNecklacePieceWHOLE = new ModelRenderer(this, 1, 9);
		this.MidNecklacePieceWHOLE.setRotationPoint(0.1F, 2.5F, -4.0F);
		this.MidNecklacePieceWHOLE.addBox(-0.5F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
		this.LeftWristWHOLE.addChild(this.LeftFrontClawBottom);
		this.RightWristWHOLE.addChild(this.InsideTop);
		this.LeftWristWHOLE.addChild(this.BackMiddle);
		this.RightShoulderCubeWHOLE.addChild(this.Inside_1);
		this.RightShoulderCubeWHOLE.addChild(this.Outside_1);
		this.RightWristWHOLE.addChild(this.FrontTop_1);
		this.LeftWristWHOLE.addChild(this.LeftBackClawTop);
		this.RightNecklaceWHOLE.addChild(this.RightNecklacePieceMid);
		this.RightWristWHOLE.addChild(this.BackBottom_1);
		this.LeftShoulderCubeWHOLE.addChild(this.Back);
		this.RightShoulderCubeWHOLE.addChild(this.Back_1);
		this.LeftShoulderCubeWHOLE.addChild(this.Inside);
		this.LeftWristWHOLE.addChild(this.FrontBottom);
		this.RightShoulderCubeWHOLE.addChild(this.Front_1);
		this.LeftShoulderCubeWHOLE.addChild(this.Front);
		this.RightWristWHOLE.addChild(this.InsideMiddle_1);
		this.LeftWristWHOLE.addChild(this.BottomInside);
		this.RightNecklaceWHOLE.addChild(this.RightNeckplacePieceBottom);
		this.LeftWristWHOLE.addChild(this.TopInside);
		this.LeftWristWHOLE.addChild(this.LeftBackClawMid);
		this.RightWristWHOLE.addChild(this.BackTop_1);
		this.LeftWristWHOLE.addChild(this.FrontMiddle);
		this.RightWristWHOLE.addChild(this.RightFrontClawMid);
		this.RightShoulderCubeWHOLE.addChild(this.RightWristWHOLE);
		this.LeftWristWHOLE.addChild(this.BackTop);
		this.RightWristWHOLE.addChild(this.RightFrontClawTop);
		this.LeftShoulderCubeWHOLE.addChild(this.FrontTop);
		this.LeftWristWHOLE.addChild(this.LeftFrontClawTop);
		this.RightWristWHOLE.addChild(this.RightBackClawTop);
		this.RightWristWHOLE.addChild(this.RightFrontClawBottom);
		this.RightWristWHOLE.addChild(this.BackMiddle_1);
		this.LeftWristWHOLE.addChild(this.InsideMiddle);
		this.RightWristWHOLE.addChild(this.RightBackClawMid);
		this.MidNecklacePieceWHOLE.addChild(this.MidNecklacePieceBottom);
		this.RightWristWHOLE.addChild(this.FrontMiddle_1);
		this.RightWristWHOLE.addChild(this.RightBackClawBottom);
		this.RightWristWHOLE.addChild(this.FrontBottom_1);
		this.LeftShoulderCubeWHOLE.addChild(this.Outside);
		this.RightWristWHOLE.addChild(this.InsideBottom);
		this.LeftWristWHOLE.addChild(this.LeftBackClawBottm);
		this.LeftNecklaceWHOLE.addChild(this.LeftNecklacePieceBottom);
		this.MidNecklacePieceWHOLE.addChild(this.MidNecklacePieceMid);
		this.LeftNecklaceWHOLE.addChild(this.LeftNecklacePieceMid);
		this.LeftShoulderCubeWHOLE.addChild(this.LeftWristWHOLE);
		this.LeftWristWHOLE.addChild(this.BackBottom);
		this.LeftWristWHOLE.addChild(this.LeftFrontClawMid);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		this.ChestHangBottom.render(f5);
		this.ChestFrontHangRight.render(f5);
		this.ChestInsideMid.render(f5);
		this.ChestInsideFrontHang.render(f5);
		this.ChestInsideMid_1.render(f5);
		this.ChestBackHangMidLeft.render(f5);
		this.ChestFrontHangMidRight.render(f5);
		this.ChestInsideBackEdgeLeft.render(f5);
		this.ChestFrontTop.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.RightNecklaceWHOLE.offsetX, this.RightNecklaceWHOLE.offsetY,
				this.RightNecklaceWHOLE.offsetZ);
		GlStateManager.translate(this.RightNecklaceWHOLE.rotationPointX * f5,
				this.RightNecklaceWHOLE.rotationPointY * f5, this.RightNecklaceWHOLE.rotationPointZ * f5);
		GlStateManager.scale(1.2D, 1.0D, 1.2D);
		GlStateManager.translate(-this.RightNecklaceWHOLE.offsetX, -this.RightNecklaceWHOLE.offsetY,
				-this.RightNecklaceWHOLE.offsetZ);
		GlStateManager.translate(-this.RightNecklaceWHOLE.rotationPointX * f5,
				-this.RightNecklaceWHOLE.rotationPointY * f5, -this.RightNecklaceWHOLE.rotationPointZ * f5);
		this.RightNecklaceWHOLE.render(f5);
		GlStateManager.popMatrix();
		this.RightShoulderCubeWHOLE.render(f5);
		this.ChestTop.render(f5);
		this.ChestBackHangRight.render(f5);
		this.LeftShoulderCubeWHOLE.render(f5);
		this.ChestInsideBackEdgeRight.render(f5);
		this.ChestFrontHangLeft.render(f5);
		this.ChestBackTop.render(f5);
		this.ChestFrontHangMidLeft.render(f5);
		this.ChestBackMid.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.LeftNecklaceWHOLE.offsetX, this.LeftNecklaceWHOLE.offsetY,
				this.LeftNecklaceWHOLE.offsetZ);
		GlStateManager.translate(this.LeftNecklaceWHOLE.rotationPointX * f5, this.LeftNecklaceWHOLE.rotationPointY * f5,
				this.LeftNecklaceWHOLE.rotationPointZ * f5);
		GlStateManager.scale(1.2D, 1.0D, 1.2D);
		GlStateManager.translate(-this.LeftNecklaceWHOLE.offsetX, -this.LeftNecklaceWHOLE.offsetY,
				-this.LeftNecklaceWHOLE.offsetZ);
		GlStateManager.translate(-this.LeftNecklaceWHOLE.rotationPointX * f5,
				-this.LeftNecklaceWHOLE.rotationPointY * f5, -this.LeftNecklaceWHOLE.rotationPointZ * f5);
		this.LeftNecklaceWHOLE.render(f5);
		GlStateManager.popMatrix();
		this.ChestFrontMid.render(f5);
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.MidNecklacePieceWHOLE.offsetX, this.MidNecklacePieceWHOLE.offsetY,
				this.MidNecklacePieceWHOLE.offsetZ);
		GlStateManager.translate(this.MidNecklacePieceWHOLE.rotationPointX * f5,
				this.MidNecklacePieceWHOLE.rotationPointY * f5, this.MidNecklacePieceWHOLE.rotationPointZ * f5);
		GlStateManager.scale(1.2D, 1.0D, 1.2D);
		GlStateManager.translate(-this.MidNecklacePieceWHOLE.offsetX, -this.MidNecklacePieceWHOLE.offsetY,
				-this.MidNecklacePieceWHOLE.offsetZ);
		GlStateManager.translate(-this.MidNecklacePieceWHOLE.rotationPointX * f5,
				-this.MidNecklacePieceWHOLE.rotationPointY * f5, -this.MidNecklacePieceWHOLE.rotationPointZ * f5);
		this.MidNecklacePieceWHOLE.render(f5);
		GlStateManager.popMatrix();
	}

	@Override
	public void addModelParts() {
		this.bipedBody = this.Front;
		this.bipedLeftArm = this.LeftWristWHOLE;
		this.bipedRightArm = this.RightWristWHOLE;
	}
}
