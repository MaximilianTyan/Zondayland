package com.zondayland.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.zondayland.ZondayLand;
import com.zondayland.gui.CoinMachineMenu;
import net.minecraft.commands.CommandBuildContext;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.server.level.ServerPlayer;


public class CoinMachineCommand implements Command<CommandSourceStack> {

    public static void register(
            CommandDispatcher<CommandSourceStack> dispatcher, CommandBuildContext registryAccess,
            Commands.CommandSelection environment
    ) {
        LiteralArgumentBuilder<CommandSourceStack> command = LiteralArgumentBuilder.literal("coinmachine");
        dispatcher.register(command.executes(CoinMachineCommand::executes));
    }

    private static int executes(CommandContext<CommandSourceStack> objectCommandContext) {
        CommandSourceStack source = objectCommandContext.getSource();
        ServerPlayer player = source.getPlayer();
        if (player == null) {
            ZondayLand.LOGGER.warn("Coin Machine Command: player is null!");
            return 0;
        }
        ZondayLand.LOGGER.info("Opening Coin Machine Menu from command");
        player.openMenu(CoinMachineMenu.getMenuProvider());
        return 1;
    }

    @Override
    public int run(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        return 0;
    }
}
