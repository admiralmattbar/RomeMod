package org.educraft.rome.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.educraft.rome.ModMain;
import org.educraft.rome.interfaces.IHasModel;

public class ModItem extends Item implements IHasModel
{

    public ModItem(String name, CreativeTabs ct)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(ct);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        ModMain.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
