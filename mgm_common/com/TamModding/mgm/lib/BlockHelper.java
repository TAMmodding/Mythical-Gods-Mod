package com.TamModding.mgm.lib;

import java.util.ArrayList;

import net.minecraft.block.Block;

import com.TamModding.mgm.block.CheckedBlock;
import com.TamModding.mgm.block.CloudBlock;
import com.TamModding.mgm.block.CrackedMossy;
import com.TamModding.mgm.block.ENDUnholyOre;
import com.TamModding.mgm.block.HolyBlock;
import com.TamModding.mgm.block.LimeStoneBlock;
import com.TamModding.mgm.block.MarbleBlock;
import com.TamModding.mgm.block.NetherUnholyOre;
import com.TamModding.mgm.block.OlympusPillar;
import com.TamModding.mgm.block.UnholyBlock;
import com.TamModding.mgm.block.UnholyOre;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class BlockHelper {
    // Names of all the blocks, in the same order as registered lower in the class
    private static final String[] blockNames = new String[] { "\u00A76 Holy Block", "Olympus Pillar", "\u00A71 Unholy Block", "\u00A71 Unholy Ore", "\u00A77 Cloud Block", "Cracked MossyStone Brick", "Marble", "LimeStone",
            "Checked Block", "\u00A71 Nether Unholy Ore", "\u00A71 End Unholy Ore" };

    // Arraylist for containing all registered blocks
    private static final ArrayList<Block> blocks = new ArrayList<Block>();

    /*
     * Registering all the different blocks Use ReferenceID.BLOCKNAME for the ID
     */
    public static final Block unholyBlock = new UnholyBlock(ReferenceID.UNHOLYBLOCK);
    public static final Block unholyOre = new UnholyOre(ReferenceID.UNHOLYORE);
    public static final Block olympusPillar = new OlympusPillar(ReferenceID.OLYMPUSPILLAR);
    public static final Block holyBlock = new HolyBlock(ReferenceID.HOLYBLOCK);
    public static final Block cloudBlock = new CloudBlock(ReferenceID.CLOUDBLOCK);
    public static final Block crackedMossy = new CrackedMossy(ReferenceID.CRACKEDMOSSY);
    public static final Block MarbleBlock = new MarbleBlock(ReferenceID.MARBLE);
    public static final Block LimeStoneBlock = new LimeStoneBlock(ReferenceID.LIMESTONE);
    public static final Block CheckedBlock = new CheckedBlock(ReferenceID.CHECKEDBLOCK);
    public static final Block NetherUnholyOre = new NetherUnholyOre(ReferenceID.NETHERUNHOLYORE);
    public static final Block EndUnholyOre = new ENDUnholyOre(ReferenceID.ENDUNHOLYORE);

    /*
     * Adding all Blocks to the main BlockArray Make sure all blocks are registered here and that the NamesArray contains the same number of items,
     * otherwise this would end in a crash.
     */
    static {
        blocks.add(holyBlock);
        blocks.add(olympusPillar);
        blocks.add(unholyBlock);
        blocks.add(unholyOre);
        blocks.add(cloudBlock);
        blocks.add(crackedMossy);
        blocks.add(MarbleBlock);
        blocks.add(LimeStoneBlock);
        blocks.add(CheckedBlock);
        blocks.add(NetherUnholyOre);
        blocks.add(EndUnholyOre);
    }

    /**
     * Initialize all the Blocks and their names.
     */
    public static void init() {
        // Give all blocks a unlocalizedName
        for (int i = 0; i < blockNames.length; i++) {
            blocks.get(i).setUnlocalizedName(blockNames[i].replaceAll(" ", ""));
        }
        // Add all blocks to the GameRegister
        for (final Block block : blocks) {
            GameRegistry.registerBlock(block, Reference.MOD_ID + "_" + block.getUnlocalizedName().substring(block.getUnlocalizedName().indexOf(".") + 1));
        }
        // Add all blocks to the LangRegister
        for (int i = 0; i < blockNames.length; i++) {
            LanguageRegistry.addName(blocks.get(i), blockNames[i]);
        }
    }
}
