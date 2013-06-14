package com.TamModding.mgm.lib;

import java.util.ArrayList;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

import com.TamModding.mgm.item.HolyGem;
import com.TamModding.mgm.item.NetherDust;
import com.TamModding.mgm.item.NetherRod;
import com.TamModding.mgm.item.UnholyGem;
import com.TamModding.mgm.item.armor.HolyArmor;
import com.TamModding.mgm.item.armor.UnHolyArmor;
import com.TamModding.mgm.item.tools.HolySword;
import com.TamModding.mgm.item.tools.UnholySword;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Mythical-Gods-Mod
 * 
 * @author TAM Modding
 *         Copyright (c) 2013
 */
public class ItemHelper {
    // Names of all the items, in the same order as registered lower in the class.
    private static final String[] itemNames = new String[] { "\u00A76 Holy Gem", "\u00A7e Holy Sword", "\u00A71 Unholy Gem", "\u00A79 Unholy Sword", "\u00A74 Nether Dust", "\u00A74 Nether Rod", "\u00A7e Holy Helmet", "\u00A7e Holy Chestplate", "\u00A7e Holy Leggings",
            "\u00A7e Holy Boots", "\u00A79 UnHoly Helmet", "\u00A79 UnHoly Chestplate", "\u00A79 UnHoly Leggings", "\u00A79 UnHoly Boots" };

    // Arraylist for containing all registered items
    private static final ArrayList<Item> items = new ArrayList<Item>();

    // EnumArmorMaterial for different armors
    static EnumArmorMaterial holyARMOR = EnumHelper.addArmorMaterial("holyARMOR", 400, new int[] { 200, 700, 500, 300 }, 10);
    static EnumArmorMaterial unholyARMOR = EnumHelper.addArmorMaterial("unholyARMOR", 460, new int[] { 460, 460, 460, 460 }, 10);

    // EnumToolMaterial for different tools
    static EnumToolMaterial holyTOOL = EnumHelper.addToolMaterial("holyTOOL", 3, 3000, 12.0F, 888, 22);
    static EnumToolMaterial unholyTOOL = EnumHelper.addToolMaterial("unholyTOOL", 3, 2345, 12.0F, 550, 22);


    /*
     * Registering all the different items Use ReferenceID.ITEMNAME for the ID
     */
    public static final Item holyGem = new HolyGem(ReferenceID.HOLYGEM);
    public static final Item holySword = new HolySword(ReferenceID.HOLYSWORD, holyTOOL);
    public static final Item unholyGem = new UnholyGem(ReferenceID.UNHOLYGEM);
    public static final Item unholySword = new UnholySword(ReferenceID.UNHOLYSWORD, unholyTOOL);
    public static final Item netherDust = new NetherDust(ReferenceID.NETHERDUST);
    public static final Item netherRod = new NetherRod(ReferenceID.NETHERROD);
  

    private static int holyArmorRenderIndex = RenderingRegistry.addNewArmourRendererPrefix("Holy");
    public static Item helmetHoly = new HolyArmor(ReferenceID.HolyHelmet, holyARMOR, holyArmorRenderIndex, 0, "HolyHelmet");
    public static Item chestHoly = new HolyArmor(ReferenceID.HolyChest, holyARMOR, holyArmorRenderIndex, 1, "HolyChestplate");
    public static Item leggingsHoly = new HolyArmor(ReferenceID.HolyLeggings, holyARMOR, holyArmorRenderIndex, 2, "HolyLeggings");
    public static Item bootsHoly = new HolyArmor(ReferenceID.HolyShoes, holyARMOR, holyArmorRenderIndex, 3, "HolyBoots");

    private static int unholyArmorRenderIndex = RenderingRegistry.addNewArmourRendererPrefix("Unholy");
    public static Item helmetUnHoly = new UnHolyArmor(ReferenceID.UnHolyHelmet, unholyARMOR, unholyArmorRenderIndex, 0, "UnholyHelmet");
    public static Item chestUnHoly = new UnHolyArmor(ReferenceID.UnHolyChest, unholyARMOR, unholyArmorRenderIndex, 1, "UnholyChestplate");
    public static Item leggingsUnHoly = new UnHolyArmor(ReferenceID.UnHolyLeggings, unholyARMOR, unholyArmorRenderIndex, 2, "UnholyLeggings");
    public static Item bootsUnHoly = new UnHolyArmor(ReferenceID.UnHolyShoes, unholyARMOR, unholyArmorRenderIndex, 3, "UnholyBoots");

    /*
     * Adding all Items to the main ItemArray Make sure all items are registered here and that the NamesArray contains the same number of items,
     * otherwise this would end in a crash.
     */
    static {
        items.add(holyGem);
        items.add(holySword);
        items.add(unholyGem);
        items.add(unholySword);
        items.add(netherDust);
        items.add(netherRod);
        items.add(helmetHoly);
        items.add(chestHoly);
        items.add(leggingsHoly);
        items.add(bootsHoly);
        items.add(helmetUnHoly);
        items.add(chestUnHoly);
        items.add(leggingsUnHoly);
        items.add(bootsUnHoly);
 
    }

    /**
     * Initialize all Items and their names
     */
    public static void init() {
        // Give all items a unlocalizedName
        for (int i = 0; i < itemNames.length; i++) {
            items.get(i).setUnlocalizedName(itemNames[i].replaceAll(" ", ""));
        }
        // Register all the item names in the LangRegister
        for (int i = 0; i < itemNames.length; i++) {
            LanguageRegistry.addName(items.get(i), itemNames[i]);
        }

        // Setting the crafting materials for the TOOL and ARMOR Enums
        holyTOOL.customCraftingMaterial = holyGem;
        holyARMOR.customCraftingMaterial = holyGem;
        unholyTOOL.customCraftingMaterial = unholyGem;
        unholyARMOR.customCraftingMaterial = unholyGem;
    }
}
