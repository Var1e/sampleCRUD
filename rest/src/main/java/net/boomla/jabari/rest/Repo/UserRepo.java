package net.boomla.jabari.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import net.boomla.jabari.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
