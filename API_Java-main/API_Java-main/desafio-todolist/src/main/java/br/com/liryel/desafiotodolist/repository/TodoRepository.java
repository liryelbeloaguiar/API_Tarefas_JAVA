package br.com.liryel.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.liryel.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
