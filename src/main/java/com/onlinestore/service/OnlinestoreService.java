package com.onlinestore.service;

import java.util.List;
import java.util.Optional;

import com.onlinestore.model.OnlinestoreModel;

public interface OnlinestoreService{

	OnlinestoreModel save(OnlinestoreModel model);

	List<OnlinestoreModel> getAllData();

	Optional<OnlinestoreModel> getById(Long id);

	OnlinestoreModel updateModel(OnlinestoreModel model);

}
