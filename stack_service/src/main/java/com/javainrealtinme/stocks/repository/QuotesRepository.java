package com.javainrealtinme.stocks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainrealtinme.stocks.model.Quote;
@Repository
public interface QuotesRepository extends JpaRepository<Quote, Integer> {

	public List<Quote> getByUserName(String username);

}
