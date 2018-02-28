import com.linying.dao.UserDao;
import com.linying.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/ApplicationContext-mvc.xml")
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void getAllStudentTest() {
        User user = new User();
        user.setName("王志峰");
        user  = userDao.save(user);
        System.out.println(user.getId().toString());
    }

    @Test
    public void pagingUserTest(){
        List<User> list = userDao.findAll();
        System.out.println(list.toString());
    }

}