package club.jjackr.project.application.auth.dto;

import club.jjackr.project.application.auth.entity.SignUpEntity;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {

    private Long id;
    private String userEmail;
    private String userPassword;
    private String userName;

    public SignUpEntity toEntity(String userEmail, String userPassword, String userName) {
        return SignUpEntity.builder()
                .userEmail(userEmail)
                .userPassword(userPassword)
                .userName(userName)
                .build();
    }
}
