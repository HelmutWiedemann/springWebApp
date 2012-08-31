package com.github.helmutwiedemann.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.github.helmutwiedemann.dao.DataDao;
import com.github.helmutwiedemann.model.DummyModel;

public class DataDaoImpl extends JdbcDaoSupport implements DataDao {

	private static final String SQL_COUNT_PEOPLE = "select count(*) as count from people";
	private static final String SQL_INSERT_REQUESTS = "insert into requests (timestamp, agent, person_id) values (NOW(),?,?)";
	private static final String SQL_GET_PEOPLE = "SELECT * from people";
	
	public List<Map<String, Object>> getData(String userAgent) {
		// count the peoples
		int amountOfPeople = getJdbcTemplate().queryForInt(SQL_COUNT_PEOPLE);
		int randomId = 0;
		
		// insert the request data
		getJdbcTemplate().update(SQL_INSERT_REQUESTS, userAgent, randomId);	
		
		// return all people
		return getJdbcTemplate().queryForList(SQL_GET_PEOPLE);
	}

	public void saveData(DummyModel config) {
		throw new RuntimeException("Not implemented yet!");
	}

}
