package me.mchiappinam.pdghautoshutdownmods;

import java.util.Calendar;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;

public class Main extends JavaPlugin {
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoShutdownMods] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoShutdownMods] §2Acesse: http://pdgh.net/");
	}
	
	@Override
    public void onEnable() {

	    getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		//Fechar
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
				if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==01)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==02)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==03)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==04)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==05)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==06)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==07)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==8)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==9)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==10)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==11)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==12)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==13)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==14)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==15)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==16)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==17)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==18)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==19)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==20)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==21)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==22)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==23)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==00)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==00) {
			                getServer().dispatchCommand(getServer().getConsoleSender(), "save-all");
			                getServer().dispatchCommand(getServer().getConsoleSender(), "plugin unload SimpleNoRelog");
							getServer().setWhitelist(true);
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O SERVIDOR §c§lAGORA§6!");
							getServer().broadcastMessage(" ");
							ConnectLobby();
						}
					}
			}
		}, 0, 20*21);
		
		//Anuncio
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
				if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==01)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==02)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==03)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==04)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==05)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==06)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==07)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==8)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==9)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==10)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==11)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==12)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==13)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==14)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==15)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==16)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==17)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==18)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==19)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==20)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==21)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==22)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==23)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==00)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==58) {
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §cServidor com mods da PDGH se reinicia de hora em hora.");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O SERVIDOR EM §c§l2 §6MINUTOS!");
							getServer().broadcastMessage(" ");
			}
					}
			}
		}, 0, 20*61);
		
		getServer().getScheduler().runTaskTimer(this, new Runnable() {
			public void run() {
					if((Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==01)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==02)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==03)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==04)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==05)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==06)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==07)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==8)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==9)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==10)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==11)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==12)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==13)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==14)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==15)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==16)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==17)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==18)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==19)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==20)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==21)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==22)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==23)||(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==00)) {
						if(Calendar.getInstance().get(Calendar.MINUTE)==59) {
							getServer().broadcastMessage(" ");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §cServidor com mods da PDGH se reinicia de hora em hora.");
							getServer().broadcastMessage("§c[ⒶⓋⒾⓈⓄ] §2»» §6REINICIANDO O SERVIDOR EM §c§l1 §6MINUTO!");
							getServer().broadcastMessage(" ");
			}
					}
			}
		}, 0, 20*61);
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoShutdownMods] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAutoShutdownMods] §2Acesse: http://pdgh.net/");
	}
	
	

	public void ConnectLobby() {
		try {
  		for (Player player : getServer().getOnlinePlayers()) {
	        ByteArrayDataOutput out = ByteStreams.newDataOutput();
	        out.writeUTF("Connect");
	        out.writeUTF("lobby");
	        player.sendPluginMessage(this, "BungeeCord", out.toByteArray());
  		}
		TimeKick();
		}catch(Exception e) {
			TimeKick();
		}
	}
	
	public void TimeKick() {
		try {
	    getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
		      public void run() {
		  		for (Player p : getServer().getOnlinePlayers()) {
			    p.kickPlayer("§3§lCalma! Nao se suicide! Nao pegue a faca!\n§3§l--§6§lREINICIANDO O SERVIDOR§3§l--\n\n' '\nO\n\n§cServidor com mods da PDGH se reinicia de hora em hora.");
	        }
				getServer().shutdown();
		  		}
		    }, 100L);
		}catch(Exception e) {}
	}
	
	
	
	
	
	
}