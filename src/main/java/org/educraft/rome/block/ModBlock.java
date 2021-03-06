package org.educraft.rome.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import org.educraft.rome.ModMain;
import org.educraft.rome.item.ItemInit;
import org.educraft.rome.interfaces.IHasModel;

public class ModBlock extends Block implements IHasModel
{
    public ModBlock(String name, Material material, CreativeTabs ct)
    {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ct);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        ModMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
