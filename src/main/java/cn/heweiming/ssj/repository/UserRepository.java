/**
 * 
 */
package cn.heweiming.ssj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.heweiming.ssj.entity.User;

/**
 * @author heweiming  2017年9月24日 上午3:54:04
 * @version 1.0.0
 * @description 
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
