/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.StevenLawson.TotalFreedomMod.Commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 *
 * @author Ender Ossel
 */
@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Get the latest Nightcore hits that the owner lissens O_O", usage = "/<command>", aliases = "endernator10")
public class Command_nightcore extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        File file = new File(plugin.getDataFolder(), "nightcore_songs.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        else{
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(file.getAbsolutePath()));
                
                sender_p.sendMessage("This Week  Top Nightcore Song the eyes of EnderNator10 is:");
                sender_p.sendMessage(reader.readLine());
            }
            catch (FileNotFoundException ex)
            {
                Logger.getLogger(Command_nightcore.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch (IOException ex)
            {
                Logger.getLogger(Command_nightcore.class.getName()).log(Level.SEVERE, null, ex);
            }
            
    }
           
    return true;
}
}