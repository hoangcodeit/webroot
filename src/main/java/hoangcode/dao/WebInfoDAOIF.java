package hoangcode.dao;
import java.util.List;

import hoangcode.model.WebInfo;
public interface WebInfoDAOIF {
	WebInfo findByid(int id);
	List<WebInfo> findAllWebpages();
	void save(WebInfo webInfo);
	void deleteById(int id);
}
