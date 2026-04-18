package com.example.algamoney_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney_api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long > {

}
