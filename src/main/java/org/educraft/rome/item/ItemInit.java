package org.educraft.rome.item;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item.ToolMaterial roman_material = EnumHelper.addToolMaterial("roman_material", 1, 2000, 10.0F, 6.0F, 50);

    public static final Item ITEM_SPEAR = new ItemSpear();
}
