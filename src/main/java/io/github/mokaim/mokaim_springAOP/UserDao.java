package io.github.mokaim.mokaim_springAOP;

public class UserDao {

	public User selectOne(String id) {
		User user = new User();
		user.setName("홍길동");
		
		return user;
	}
}
