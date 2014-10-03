/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Ender Ossel
 */
@CommandPermissions(level = AdminLevel.OP, source = SourceType.BOTH)
@CommandParameters(description = "TROLOLO", usage = "/<command>", aliases = "trolme")
public class Command_trollme extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.getServer().broadcastMessage(sender_p.getName() + ChatColor.AQUA + "" + ChatColor.BOLD + "Got Troled Realy bad by " + sender_p.getName());
        TFM_PlayerData.getPlayerData(sender_p).setHalted(true);
        sender_p.damage(9999999999999999999999F);
        
        sender_p.teleport(new Location(sender_p.getWorld(),sender_p.getLocation().getX(),sender_p.getLocation().getY() +10000,sender_p.getLocation().getZ()));
        sender_p.kickPlayer(ChatColor.AQUA + "" + ChatColor.BOLD + "You Mad Bro?");
        return true;
    }
    
}
