/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.WeatherType;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "TROLOLO", usage = "/<command>", aliases = "storm")
/**
 *
 * @author Ender Ossel
 */
public class Command_Storm extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        
        sender_p.getWorld().spawnEntity(sender_p.getLocation(), EntityType.LIGHTNING);
        return true;
    }
    
}
