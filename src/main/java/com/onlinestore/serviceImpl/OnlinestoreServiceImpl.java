package com.onlinestore.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinestore.model.OnlinestoreModel;
import com.onlinestore.repository.OnlinestoreRepository;
import com.onlinestore.service.OnlinestoreService;

@Service
public class OnlinestoreServiceImpl implements OnlinestoreService{

	@Autowired
	OnlinestoreRepository repo;
	
	@Override
	public OnlinestoreModel save(OnlinestoreModel model) {
		
		OnlinestoreModel modelSaved=repo.save(model);
		return modelSaved;
	}

	@Override
	public List<OnlinestoreModel> getAllData() {
		// TODO Auto-generated method stub
		List<OnlinestoreModel> data=repo.findAll();
		return data;
	}

	@Override
	public Optional<OnlinestoreModel> getById(Long id) {
		// TODO Auto-generated method stub
		Optional<OnlinestoreModel> byId=repo.findById(id);
		return byId;
	}

	@Override
	public OnlinestoreModel updateModel(OnlinestoreModel model) {
		// TODO Auto-generated method stub
		OnlinestoreModel updateModel = null;
		Optional<OnlinestoreModel> byIdData=repo.findById(model.getId());
		if(byIdData.isPresent()) {
			updateModel=byIdData.get();
			updateModel.setProductName(model.getProductName());
			updateModel.setCategory(model.getCategory());
			updateModel.setId(updateModel.getId());
			updateModel.setDate(LocalDateTime.now());
			repo.save(updateModel);
		}
		
//		updateModel.setId(model.getId());
		return updateModel;
	}

}
