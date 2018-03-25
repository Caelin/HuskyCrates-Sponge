package com.codehusky.huskycrates.command;

import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.action.TextActions;
import org.spongepowered.api.text.format.TextColors;
import org.spongepowered.api.text.format.TextStyles;

import java.net.MalformedURLException;
import java.net.URL;

public class MainCommand implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        try {
            src.sendMessages(Text.of(TextColors.GOLD,"HuskyCrates Commands"),
                    Text.of(TextColors.YELLOW,"/hc reload"),
                    Text.of(TextColors.YELLOW,"/hc lock <crate> [block id] [user]"),
                    Text.of(TextColors.YELLOW,"/hc key <crate> [amount] [user or @a]"),
                    Text.of(TextColors.YELLOW,"/hc vkey <crate> <amount>"),
                    Text.of(TextColors.GRAY,"For more information or command aliases, review the documentation ",Text.builder().onClick(TextActions.openUrl(new URL("https://huskycrates.readthedocs.io/"))).append(Text.of(TextStyles.UNDERLINE,"here")).onHover(TextActions.showText(Text.of("https://huskycrates.readthedocs.io/"))).build(),"."));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return CommandResult.success();
    }
}