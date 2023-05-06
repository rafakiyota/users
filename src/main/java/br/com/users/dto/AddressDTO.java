package br.com.users.dto;

import br.com.users.entity.Address;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO {

    private Long address_id;
    private String address;
    private String city;
    private String state;
    private String postalCode;

    public AddressDTO(Address address) {
        this.address_id = address.getId();
        this.address = address.getAddress();
        this.city = address.getCity();
        this.state = address.getState();
        this.postalCode = address.getPostalCode();
    }
}
