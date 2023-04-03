package net.alox.magicmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class river_plant extends TallFlowerBlock implements net.minecraftforge.common.IPlantable, BonemealableBlock {

    public river_plant(Properties properties) {
        super(properties);
    }

   @Override
   public boolean canSurvive(BlockState state, LevelReader reader, BlockPos pos) { //POR ALGUNA RAZON SE ROMPE AL PONERLO Y POR ESO NO SPAWNEA, PORQUE SE ROMPE
       BlockState blockBelow = reader.getBlockState(pos.below());
       if (blockBelow.is(BlockTags.DIRT) || blockBelow.is(this) || blockBelow.is(Blocks.GRASS_BLOCK) || blockBelow.is(Blocks.SAND) || blockBelow.is(Blocks.RED_SAND)) {
           BlockPos blockpos = pos.below();
           for(Direction direction : Direction.Plane.HORIZONTAL) {
               BlockState blockstate1 = reader.getBlockState(blockpos.relative(direction));
               FluidState fluidstate = reader.getFluidState(blockpos.relative(direction));
               if (state.canBeHydrated(reader, pos, fluidstate, blockpos.relative(direction)) || blockstate1.is(Blocks.FROSTED_ICE)) {
                   return true;
               }
           }
       }
       return false;
   }

    @Override
    public net.minecraftforge.common.PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return net.minecraftforge.common.PlantType.BEACH;
    }

    @Override
    public BlockState getPlant(BlockGetter world, BlockPos pos) {
        return defaultBlockState();
    }




}
