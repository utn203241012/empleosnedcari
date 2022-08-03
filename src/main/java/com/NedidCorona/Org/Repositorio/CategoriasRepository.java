package com.NedidCorona.Org.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NedidCorona.Org.Model.Categoria;


public interface CategoriasRepository extends JpaRepository <Categoria, Integer> {
	
}
