package com.jikexueyuan.service;

import com.jikexueyuan.dao.UserDao;
import com.jikexueyuan.dao.impl.UserDaoImpl;
import com.jikexueyuan.entity.User;
import com.jikexueyuan.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;

public class CheckUserService {

	private UserDao userDao = new UserDaoImpl();

	public boolean check(User user) {
		Connection conn = null;

		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);

			ResultSet resultSet = userDao.get(conn, user);

			while (resultSet.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally{
			try {
				conn.close();
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
		return false;

	}

}
