package com.senai.nucci.PrjGame.servicies;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.nucci.PrjGame.Repositories.JogoRepository;
import com.senai.nucci.PrjGame.entities.Jogo;

@Service
public class JogoServices {

	private JogoRepository jogoRepository;

	public JogoServices(JogoRepository jogoRepository) {
		this.jogoRepository = jogoRepository;
	}
	public Jogo saveJogo(Jogo jogo) {
		return jogoRepository.save(jogo); 
		}
	public Jogo getJogoById(Long id) {
		return jogoRepository.findById(id).orElse(null);
	}
	public List<Jogo> getAllJogo() {
		return jogoRepository.findAll();
		}
	public void deleteJogo(Long id) {
		jogoRepository.deleteById(id);
		}
}