package admin;


import com.lqf.p2p.domain.admin.AdminModel;

public interface IAdminService {

	public AdminModel login(String username, String password);
}
