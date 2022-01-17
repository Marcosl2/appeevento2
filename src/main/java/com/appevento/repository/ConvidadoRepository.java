package com.appevento.repository;

import org.springframework.data.repository.CrudRepository;

import com.appevento.modells.Convidado;
import com.appevento.modells.Evento;


public interface ConvidadoRepository extends CrudRepository<Convidado , String>{
	Iterable<Convidado> findByEvento(Evento evento);
}
