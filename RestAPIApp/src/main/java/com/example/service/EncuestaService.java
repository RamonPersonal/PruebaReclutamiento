package com.example.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.model.Encuesta;
import com.example.model.GeneroMusical;
import com.example.model.Grafica;
import com.example.repository.EncuestaRepository;
import com.example.repository.GeneroMusicalRepository;

@Service
public class EncuestaService implements EncuestaRepository{

	@Autowired
	private EncuestaRepository encuestaRepository;
	@Autowired
	private GeneroMusicalRepository generoMusicalRepository;
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Encuesta> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Encuesta> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Encuesta> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Encuesta getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Encuesta getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Encuesta getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Encuesta> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Encuesta> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Encuesta> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Encuesta> findAll() {
		return encuestaRepository.findAll();
	}

	@Override
	public List<Encuesta> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Encuesta> S save(S entity) {
		
		return encuestaRepository.save(entity);
	}

	@Override
	public Optional<Encuesta> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Encuesta entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Encuesta> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Encuesta> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Encuesta> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Encuesta> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Encuesta> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Encuesta> long count(Example<S> example) {  
		return encuestaRepository.count(example);
	}


    public List<Grafica> countByGenero() {
        List<Grafica> graficaList = new ArrayList<>();
        List<GeneroMusical> generosMusicales = generoMusicalRepository.findAll();

        for (GeneroMusical genero : generosMusicales) {
            Encuesta exampleEncuesta = new Encuesta();
            exampleEncuesta.setNombreGenero(genero.getNombre());

            ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("nombreGenero", ExampleMatcher.GenericPropertyMatchers.exact())
                .withIgnorePaths("id");

            Example<Encuesta> example = Example.of(exampleEncuesta, matcher);
            long count = encuestaRepository.count(example);
            Grafica grafica = new Grafica(genero.getNombre(), count);
            graficaList.add(grafica);
        }
        
        return graficaList;
    }
    
	@Override
	public <S extends Encuesta> boolean exists(Example<S> example) {
		return encuestaRepository.exists(example);
	}

    public boolean existsByEmail(String email) {
        Encuesta probe = new Encuesta();
        probe.setEmail(email);

        ExampleMatcher matcher = ExampleMatcher.matching()
            .withMatcher("email", ExampleMatcher.GenericPropertyMatchers.exact())
            .withIgnorePaths("id");
        Example<Encuesta> example = Example.of(probe, matcher);
        return encuestaRepository.exists(example);
    }
	@Override
	public <S extends Encuesta, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

}
