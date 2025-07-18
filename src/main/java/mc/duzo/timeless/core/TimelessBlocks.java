package mc.duzo.timeless.core;

import dev.amble.lib.block.ABlockSettings;
import dev.amble.lib.container.impl.BlockContainer;
import dev.amble.lib.item.AItemSettings;

import net.minecraft.block.Block;

import mc.duzo.timeless.block.SuitApplicationBlock;

public class TimelessBlocks extends BlockContainer {
    public static final Block SUIT_APPLICATION = new SuitApplicationBlock(ABlockSettings.create().itemSettings(new AItemSettings().group(TimelessItemGroups.GROUP)));
}
