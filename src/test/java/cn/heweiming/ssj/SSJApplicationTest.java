/**
 * 
 */
package cn.heweiming.ssj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.heweiming.ssj.entity.User;
import cn.heweiming.ssj.repository.UserRepository;

/**
 * @author heweiming 2017年9月24日 上午3:45:41
 * @version 1.0.0
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional(propagation = Propagation.NOT_SUPPORTED)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class SSJApplicationTest {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void test() {
		User user = new User();
		user.setUsername("张三");
		System.err.println(userRepository.save(user));
	}

}
