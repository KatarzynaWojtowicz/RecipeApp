package pl.katarzynawojtowicz.recipeapp.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.katarzynawojtowicz.recipeapp.entity.User;
import pl.katarzynawojtowicz.recipeapp.repository.UserRepository;
import pl.katarzynawojtowicz.recipeapp.service.UserService;
import pl.katarzynawojtowicz.recipeapp.to.UserTo;

@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<UserTo> findAll() {
		List<User> userEntities = userRepository.findAll();
		List<UserTo> results = new ArrayList<>();

		for (User user : userEntities) {
			results.add(modelMapper.map(user, UserTo.class));
		}

		return results;
	}

	@Override
	public UserTo findById(int id) {
		Optional<User> userEntities = userRepository.findById(id);
		UserTo result = modelMapper.map(userEntities, UserTo.class);
		return result;
	}

	@Override
	public UserTo create(UserTo userTo) {
		userRepository.save(modelMapper.map(userTo, User.class));
		return null;
	}

}
