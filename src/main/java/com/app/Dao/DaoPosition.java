package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.metier.entities.Position;

public interface DaoPosition extends JpaRepository<Position,Integer>{
	List<Position> findByStatus(boolean status);
	List<Position> findByIdUAndDate(int idU,String date);
}
