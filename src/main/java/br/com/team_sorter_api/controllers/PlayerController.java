package br.com.team_sorter_api.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.team_sorter_api.dtos.PlayerDto;
import br.com.team_sorter_api.models.Player;
import br.com.team_sorter_api.services.PlayerService;

@RestController
public class PlayerController {
	
	@GetMapping("sort_teams")
	public String sort_teams() {
		return "Hello World";
	}
	
	@PostMapping("/sort_teams") 
	public ResponseEntity<List<ArrayList<Player>>> sort_teams(@RequestBody PlayerDto[] playerDto){
		Player[] player = new Player [playerDto.length];
		List<ArrayList<Player>> teams = new ArrayList<ArrayList<Player>>();
		player = PlayerService.calculate_average(playerDto);
		teams = PlayerService.sort_teams(player);
		return new ResponseEntity<List<ArrayList<Player>>>(teams, HttpStatus.OK);
	}
}
