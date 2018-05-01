package admin.impl;

import admin.IAdminService;
import com.lqf.p2p.dao.admin.AdminDAO;
import com.lqf.p2p.domain.admin.AdminModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private AdminDAO adminDao;

	public AdminModel login(String username, String password) {
		return adminDao.login(username, password);
	}

}
