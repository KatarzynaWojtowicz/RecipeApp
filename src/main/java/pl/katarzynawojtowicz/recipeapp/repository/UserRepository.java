package pl.katarzynawojtowicz.recipeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.katarzynawojtowicz.recipeapp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
