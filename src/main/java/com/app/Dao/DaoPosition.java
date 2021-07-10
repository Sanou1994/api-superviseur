package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.metier.entities.Position;

public interface DaoPosition extends JpaRepository<Position,Integer>{
	List<Position> findByDate(String date);
	List<Position> findByIdU(int id);
	List<Position> findByStatus(boolean status);
	List<Position> findByIdUOrStatusOrDate(int idU,boolean status,String date);
}
