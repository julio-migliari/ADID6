package com.adid6.Filmes.repository;

import com.adid6.Filmes.Model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmeRepository extends JpaRepository<Filme, Long>  {
    /*@Query("SELECT p FROM Filme p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Filme> searchFilmes(String query);*/

    
}
