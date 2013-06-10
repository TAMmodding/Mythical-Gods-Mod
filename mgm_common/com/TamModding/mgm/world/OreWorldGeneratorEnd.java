package com.TamModding.mgm.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import com.TamModding.mgm.lib.BlockHelper;

import cpw.mods.fml.common.IWorldGenerator;

public class OreWorldGeneratorEnd implements IWorldGenerator{
    
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
		
		
	}
	
		private void generateEnd(World world, Random random, int i, int j) {
			
			for(int k = 0; k < 10; k++)
			{
			//16x16 area up to y = 100 
			int Xcoord = j + random.nextInt(16);
			int Ycoord = random.nextInt(100);
			int Zcoord = i + random.nextInt(16);
			//9 blocks per vein
			(new WorldGenEndMinable(BlockHelper.EndUnholyOre.blockID, 2)).generate(world, random, Xcoord, Ycoord, Zcoord);		
			}
		}



		private void generateSurface(World world, Random rand, int chunkX, int chunkZ){
		
	}
}
