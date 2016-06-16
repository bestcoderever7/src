package com.camp.block;

import com.camp.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class NewBlock extends Block{
	

	protected NewBlock(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setBlockTextureName(Strings.MODID + ":" + "WaffleBlock");
		this.setBlockName("Waffle Block");
		// TODO Auto-generated constructor stub
	}

}
