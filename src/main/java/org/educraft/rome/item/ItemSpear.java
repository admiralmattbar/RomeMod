package org.educraft.rome.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import org.educraft.rome.entity.EntitySpearExtend;
import org.educraft.rome.interfaces.IExtendedReach;

public class ItemSpear extends ModItem implements IExtendedReach {

    public ItemSpear() {
        super("item_spear", CreativeTabs.COMBAT);
        this.setMaxStackSize(1);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) {

        ItemStack heldItem = player.getHeldItem(hand);
        if(!worldIn.isRemote) {
            EntitySpearExtend spear = new EntitySpearExtend(worldIn, player);
            spear.stab();
            player.sendMessage(new TextComponentString("Created extended spear entity."));
        }
        return super.onItemRightClick(worldIn, player, hand);
    }

    @Override
    public float getReach()
    {
        return 10.0f;
    }
}
