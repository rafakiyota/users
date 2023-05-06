package br.com.users.service;

import br.com.users.dto.AddressDTO;
import br.com.users.dto.UserDTO;
import br.com.users.entity.Address;
import br.com.users.entity.User;
import br.com.users.repo.AddressRepo;
import br.com.users.repo.UserRepo;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSvc {

    private UserRepo userRepo;
    private AddressRepo addressRepo;

    public UserSvc(UserRepo userRepo, AddressRepo addressRepo) {
        this.userRepo = userRepo;
        this.addressRepo = addressRepo;
    }

    public UserDTO getUserAddress(String email, int size) {
        Optional<User> user = userRepo.findByEmail(email);

        PageRequest page = PageRequest.of(0, size, Sort.by("id").descending());
        List<Address> addresses = addressRepo.findByUserEmail(email, page);
        if (addresses.isEmpty()) {
            return new UserDTO();
        }

        List<AddressDTO> addressDTOs = addresses.stream().map(address -> new AddressDTO(address)).toList();
        return new UserDTO(user.get(), addressDTOs);
    }
}
