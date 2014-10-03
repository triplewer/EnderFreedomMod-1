/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author Ender Ossel
 */
@CommandPermissions(level = AdminLevel.OP, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "You will get some poop that you can build with", usage = "/<command>", aliases = "poop")
public class Command_poop  extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        ItemStack item = new ItemStack(Material.WOOL,1); 
        ItemMeta im = item.getItemMeta(); 
        im.setDisplayName(ChatColor.BOLD +""+ChatColor.RED + ""+ChatColor.UNDERLINE + "Here is Your Shit");
        item.setDurability((short) 12F);
        sender_p.getInventory().addItem(item);
        return true;
    }
    
}
