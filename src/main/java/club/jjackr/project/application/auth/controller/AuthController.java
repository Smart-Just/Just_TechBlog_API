package club.jjackr.project.application.auth.controller;

import club.jjackr.project.application.auth.dto.UserInfo;
import club.jjackr.project.application.auth.entity.SignUpEntity;
import club.jjackr.project.application.auth.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // JSON 형태 결과값을 반환( @ResponseBody가 필요 없다 )
@RequestMapping("user") // user의 uri
public class AuthController {

    @Autowired
    private AuthRepository authRepository;

    /**
     * User 조회
     *
     * @return
     */
    @GetMapping("/info")
    public List<SignUpEntity> findAllUser() {
        return authRepository.findAll();
    }

    /**
     * SignUp : 회원가입
     * @return
     */
    @GetMapping("/register")
    public SignUpEntity signUp() {
        SignUpEntity signUpEntity = new UserInfo().toEntity("test@naver.com",
                "test1234", "가나다");

        return authRepository.save(signUpEntity);
    }
}
