package com.example.demo2.repository;
import java.util.List;

import com.example.demo2.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface AuthorityRepository extends JpaRepository<Authority, Integer>{
	/**
	 * 根据用户id查询用户所拥有的权限（关联查询）
	 * 相当于JPQL语句：select a from Authority a inner join a.userList u where u.id = ?1
	 */
	public List<Authority> findByUserList_id(int id);
	/**
	 * 根据用户名查询用户所拥有的权限（关联查询）
	 * 相当于JPQL语句：select a from Authority a inner join a.userList u where u.username = ?1
	 */
	public List<Authority> findByUserList_Username(String username);
	/**
	 * 根据用户名查询用户所拥有的权限（关联查询）
	 */
	@Query("select a from Authority a inner join a.userList u where u.username = ?1")
	public List<Authority> findByUserListUsername(String username);
}
