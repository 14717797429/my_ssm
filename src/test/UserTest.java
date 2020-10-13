import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class UserTest {
    @Autowired
    private UserService userService;

    @Test
    public void getAll() {
        List<User> userList = userService.getAll();
        for (User user:userList){
            System.out.println(user.getName());
        }
    }
}
