package dao;

import dto.UserBasicDto;

import java.sql.SQLException;

public interface LoginDAOInterface
{
  UserBasicDto login(String email, String password) throws SQLException;
}
