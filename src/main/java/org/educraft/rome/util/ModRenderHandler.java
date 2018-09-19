package org.educraft.rome.util;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ModRenderHandler
{
    public static void registerEntityRenders()
    {
        /*
        RenderingRegistry.registerEntityRenderingHandler(EntityBrian.class, new IRenderFactory<EntityBrian>()
        {
            @Override
            public Render<? super EntityBrian> createRenderFor(RenderManager manager)
            {
                return new RenderBrian(manager);
            }
        });
        */
    }
}
