package com.iyte.thesisproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iyte.thesisproject.domain.BasketballPlayer;
import com.iyte.thesisproject.domain.Club;
import com.iyte.thesisproject.domain.ClubManager;
import com.iyte.thesisproject.domain.Coach;
import com.iyte.thesisproject.domain.Feed;
import com.iyte.thesisproject.domain.FootballPlayer;
import com.iyte.thesisproject.domain.TrackedMember;
import com.iyte.thesisproject.domain.VolleyballPlayer;
import com.iyte.thesisproject.repository.BasketballPlayerRepository;
import com.iyte.thesisproject.repository.ClubManagerRepository;
import com.iyte.thesisproject.repository.ClubRepository;
import com.iyte.thesisproject.repository.CoachRepository;
import com.iyte.thesisproject.repository.FootballPlayerRepository;
import com.iyte.thesisproject.repository.VolleyballPlayerRepository;

@Service
public class TrackedMemberService {

	@Autowired
	private CoachRepository coachesRepository;

	@Autowired
	private ClubManagerRepository  managersRepository;
	
	@Autowired
	private ClubRepository clubsRepository;
	
	@Autowired
	private FootballPlayerRepository footballPlayersRepository;
	
	@Autowired
	private BasketballPlayerRepository basketballPlayersRepository;
	
	@Autowired
	private VolleyballPlayerRepository volleyballPlayersRepository;
	

	public List<Coach> findAllCoaches() {

		return coachesRepository.findAll();
	}
	
	public List<Club> findAllClubs() {

		return clubsRepository.findAll();
	}
	
	public List<ClubManager> findAllClubManagers() {

		return managersRepository.findAll();
	}

	public List<FootballPlayer> findAllFootballPlayers() {

		return footballPlayersRepository.findAll();
	}

	public List<BasketballPlayer> findAllBasketballPlayers() {

		return basketballPlayersRepository.findAll();
	}
	public List<VolleyballPlayer> findAllVolleyballPlayers() {

		return volleyballPlayersRepository.findAll();
	}

}
