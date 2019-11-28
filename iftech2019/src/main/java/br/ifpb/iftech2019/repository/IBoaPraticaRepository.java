package br.ifpb.iftech2019.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ifpb.iftech2019.model.BoaPratica;

@Repository
public interface IBoaPraticaRepository extends JpaRepository<BoaPratica,Long> {
	
	//TODO  -> Métodos de busca caso necessários

}
