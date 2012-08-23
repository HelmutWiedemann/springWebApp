package com.github.helmutwiedemann.dao.impl;

import com.github.helmutwiedemann.dao.DataDao;
import com.github.helmutwiedemann.model.DummyModel;

public class DataDaoImpl implements DataDao {

	public DummyModel getData() {
		return new DummyModel();
	}

	public void saveData(DummyModel config) {
		// TODO Auto-generated method stub
	}

}
