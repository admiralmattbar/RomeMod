package org.educraft.rome.entity;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class EntitySpearExtend extends EntityThrowable
{
    private EntityLivingBase swinger;
    private int ticksAlive = 10;
    private float damage;

    public Entity hitEntity;

    public EntitySpearExtend(World worldIn) {
        super(worldIn);
    }

    public EntitySpearExtend(World worldIn, double x, double y, double z)
    {
        this(worldIn);
        this.setPosition(x, y, z);
    }

    public EntitySpearExtend(World worldIn, EntityLivingBase shooter, float size, double speed, float damage)
    {

        super(worldIn);

    }


    public EntitySpearExtend(World worldIn, EntityLivingBase swinger)
    {
        this(worldIn, swinger.posX, swinger.posY + (double)swinger.getEyeHeight() - 0.10000000149011612D, swinger.posZ);
        this.swinger = swinger;
    }

    public void stab()
    {
        this.motionX += swinger.motionX;
        this.motionZ += swinger.motionZ;
    }

    @Override
    protected void entityInit() {

    }

    @Override
    protected void onImpact(RayTraceResult result) {
        if(result.entityHit != null){
            result.entityHit.attackEntityFrom(DamageSource.ANVIL, 10f);
            swinger.sendMessage(new TextComponentString("Hit Entity."));
        }
        this.setDead();
    }
}
