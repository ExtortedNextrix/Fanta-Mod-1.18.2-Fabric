package net.nextrix.fantamod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class DowsingRodItem extends Item {

    public DowsingRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()) { //check if client
            BlockPos positionClicked = context.getBlockPos(); // get block
            PlayerEntity player = context.getPlayer(); // get player
            boolean foundBlock = false; // set boolean

            for(int i = 0; i <= positionClicked.getY() + 64; i++) { // get the pos clicked and count all the way up on the Y (+64)
                Block blockBelow = context.getWorld().getBlockState(positionClicked.down(i)).getBlock(); // get the block below the block you clicked

                if(isValuableBlock(blockBelow)) {  // checks if it is valuable
                    outputValubleCoordinates(positionClicked.down(i), player, blockBelow); // output block stuff
                    foundBlock = true; // true
                    break; // breaks out of loop
                }
            }
            if(!foundBlock) {
                player.sendMessage(new TranslatableText("item.tutorialmod.dowsing_rod.no_valuables"), false);
            }
        }

        context.getStack().damage(1, context.getPlayer(),  // damage item
                (player) -> player.sendToolBreakStatus(player.getActiveHand()));

        return super.useOnBlock(context);
    }

    private void outputValubleCoordinates(BlockPos blockPos, PlayerEntity player, Block blockBelow) {
        player.sendMessage(new LiteralText("Found " + blockBelow.asItem().getName().getString() + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"), false);
    }

    private boolean isValuableBlock(Block block) {
        return block == Blocks.COAL_ORE || block == Blocks.COPPER_ORE
                || block == Blocks.DIAMOND_ORE || block == Blocks.IRON_ORE;
    }
}
