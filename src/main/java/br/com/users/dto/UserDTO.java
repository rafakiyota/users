package br.com.users.dto;

import br.com.users.entity.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO {

    private Long user_id;
    private String name;
    private String email;
    private List<AddressDTO> addresses;

    public UserDTO(User user, List<AddressDTO> addresses) {
        this.user_id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.addresses = addresses;
    }
}
