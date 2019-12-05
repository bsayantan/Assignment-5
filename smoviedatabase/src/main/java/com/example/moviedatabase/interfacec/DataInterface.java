package com.example.moviedatabase.interfacec;

import org.springframework.data.repository.CrudRepository;

import com.example.moviedatabase.model2.databaseinsertionclass;

public interface DataInterface extends CrudRepository<databaseinsertionclass, String>
{

	 }
