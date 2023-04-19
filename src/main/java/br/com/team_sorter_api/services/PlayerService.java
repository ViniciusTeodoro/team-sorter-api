package br.com.team_sorter_api.services;

import java.util.ArrayList;
import java.util.List;

import br.com.team_sorter_api.dtos.PlayerDto;
import br.com.team_sorter_api.models.Player;

public class PlayerService {
	public static Player[] calculate_average(PlayerDto[] playerDto) {
		Player[] players = new Player [playerDto.length];
		for(int i = 0; i < playerDto.length; i++) {
			Player player = new Player();
			player.setName(playerDto[i].getName());
			player.setAverage((playerDto[i].getAdaptability() + playerDto[i].getAim() + playerDto[i].getGameNotion() + playerDto[i].getIgl() + playerDto[i].getNadeKnowledge())/5);
			players[i] = player;
		}
		for(int i = 0; i < players.length - 1; i++) {
			if(players[i].getAverage() < players[i + 1].getAverage()) {
				Player aux = players[i];
				players[i] = players[i+1];
				players[i+1] = aux;
			}
		}
		return players;
	};
	
	public static List<ArrayList<Player>> sort_teams(Player[] player) {
		
		List<ArrayList<Player>> teams = new ArrayList<ArrayList<Player>>();
		ArrayList<Player> teamOne = new ArrayList<Player>();
		ArrayList<Player> teamTwo = new ArrayList<Player>();
		
		for(int i = 0; i < player.length; i++) {
			if(teamOne.size() > teamTwo.size()) {
				teamTwo.add(player[i]);
			} else {
				teamOne.add(player[i]);
			}
		}
		teams.add(teamOne);
		teams.add(teamTwo);

		
		return teams;	
	}
}
