package br.com.users.repo;

import br.com.users.entity.Address;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface AddressRepo extends JpaRepository<Address, Long> {

    List<Address> findByUserEmail(String email, PageRequest page);
}
