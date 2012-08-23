package com.github.helmutwiedemann.dao;

import com.github.helmutwiedemann.model.DummyModel;

public interface DataDao {

	public DummyModel getData();

	public void saveData(DummyModel config);

}
