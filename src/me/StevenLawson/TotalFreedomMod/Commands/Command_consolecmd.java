/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.StevenLawson.TotalFreedomMod.Commands;

import static org.bukkit.Bukkit.getServer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Ender Ossel
 */
@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "do command as CONSOLE O_O", usage = "/<command>", aliases = "ccmd")
public class Command_consolecmd extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if(args.length == 2){
        sender_p.getServer().dispatchCommand(sender.getServer().getConsoleSender(), args[0] + args[2]);
        return true;
        }
        else{
            sender.sendMessage("you need to have two arguments command <command to run> <command argument if none just type random shit>");
        return false;
       }
    }
}
