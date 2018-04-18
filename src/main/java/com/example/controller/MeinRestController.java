package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Player;

@RestController
public class MeinRestController {

    @RequestMapping(value = "player", method = RequestMethod.GET)
    public Player getPlayer() {
	Player waldemar = new Player("waldemar", 24);
	return waldemar;
    }

    @PostMapping(value = "/player")
    public ResponseEntity<Player> recvPlayer(@RequestBody Player player) {
	if (player == null) {
	    throw new IllegalArgumentException();
	}
	if (player.getName().equals("waldemar")) {
	    return new ResponseEntity<Player>(HttpStatus.OK);
	}
	return new ResponseEntity<Player>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
