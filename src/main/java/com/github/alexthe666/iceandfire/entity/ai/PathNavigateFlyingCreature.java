package com.github.alexthe666.iceandfire.entity.ai;

import com.github.alexthe666.iceandfire.entity.EntityAmphithere;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateFlying;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PathNavigateFlyingCreature extends PathNavigateFlying {

    public PathNavigateFlyingCreature(EntityAmphithere entity, World world) {
        super(entity, world);
    }

    public boolean canEntityStandOnPos(BlockPos pos) {
        return this.world.isAirBlock(pos.down());
    }
}
