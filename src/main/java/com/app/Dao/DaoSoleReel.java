package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.metier.entities.SoldeReel;

public interface DaoSoleReel extends JpaRepository<SoldeReel,Integer>{
	SoldeReel findByIdU(int id);
	SoldeReel findById(int userId);
	List<SoldeReel> findByIdUAndStatus(int userId,int idU);
	List<SoldeReel> findByIdUAndDate(int id,String date);
}
