package io.github.mokaim.mokaim_springAOP;

public class UserService {

	private UserDao dao;

	public User getUser(String id) {
		return dao.selectOne(id);
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	
	
}
