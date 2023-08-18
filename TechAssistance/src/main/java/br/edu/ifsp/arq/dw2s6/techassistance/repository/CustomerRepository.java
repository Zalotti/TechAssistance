package br.edu.ifsp.arq.dw2s6.techassistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.arq.dw2s6.techassistance.domain.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
