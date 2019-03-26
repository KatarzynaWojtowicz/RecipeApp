package pl.katarzynawojtowicz.recipeapp.service;

import java.util.List;

import pl.katarzynawojtowicz.recipeapp.to.UserTo;

public interface UserService {

	public List<UserTo> findAll();

	public UserTo findById(int id);

	public UserTo create(UserTo userTo);
}
