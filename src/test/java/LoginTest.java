import dto.UserDTO;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    UserDTO userDTOPositive = UserDTO.builder().email("")
            .password("123456a").build();

    @Test
    public void signUpPositive(){


    }
}
