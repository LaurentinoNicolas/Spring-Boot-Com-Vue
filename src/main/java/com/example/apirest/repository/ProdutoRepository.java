package com.example.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apirest.model.*;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	Produto findById(long Id);

}
