package com.github.helmutwiedemann.dao;

import java.util.List;
import java.util.Map;

import com.github.helmutwiedemann.model.DummyModel;

public interface DataDao {

	public List<Map<String, Object>> getData(String userAgent);

	public void saveData(DummyModel config);

}
