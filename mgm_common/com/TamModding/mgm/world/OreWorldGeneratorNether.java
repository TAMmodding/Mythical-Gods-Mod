package com.TamModding.mgm.world;

import java.util.Random;

import com.TamModding.mgm.lib.BlockHelper;


import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreWorldGeneratorNether implements IWorldGenerator{
    
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	 {
	 switch(world.provider.dimensionId)
	 {
	 case - 1: generateNether(world, random, chunkX * 16, chunkZ * 16);
	 case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
	 case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
	}
}
    
	
    
	private void generateSurface() {
		
		
	}



	private void generateNether(World world, Random random, int i, int j) {
		
		for(int k = 0; k < 10; k++)
		{
		
		int Xcoord = j + random.nextInt(16);
		int Ycoord = random.nextInt(100);//16x16 area up to y = 100 
		int Zcoord = i + random.nextInt(16);
																	  //2 blocks per vein
		(new WorldGenNetherMinable(BlockHelper.NetherUnholyOre.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);		
		}
	}
	
		private void generateEnd(World world, Random random, int i, int j) {
			
			
		}



		private void generateSurface(World world, Random rand, int chunkX, int chunkZ){
		
	}
}
