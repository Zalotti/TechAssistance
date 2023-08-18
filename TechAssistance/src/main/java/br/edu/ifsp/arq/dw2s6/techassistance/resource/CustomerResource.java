package br.edu.ifsp.arq.dw2s6.techassistance.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.arq.dw2s6.techassistance.domain.model.Customer;
import br.edu.ifsp.arq.dw2s6.techassistance.repository.CustomerRepository;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/customers")
public class CustomerResource {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping
	// Endereço para Postman
	// http://localhost:8080/customers
	
	public List<Customer> list(){
		return customerRepository.findAll();
	}
	
	@PostMapping
	public Customer create(@RequestBody Customer customer, HttpServletResponse response) {
		return customerRepository.save(customer);
	}
	
	// Testar Postman
		// POST - http://localhost:8080/customers
		// Body - raw - JSON
		/*
			{
			    "name": "Fabiana Alves",
			    "email": "bibi@hotmail.com",
			    "cellphone": "(248) 762-0356"
			}
		*/
	
	@GetMapping("/{id}")
	public ResponseEntity<Customer> findById(@PathVariable Long id){
		Optional<Customer> customer = customerRepository.findById(id);
		if(customer.isPresent()) {
			return ResponseEntity.ok(customer.get());
		}
		return ResponseEntity.notFound().build();
	}

	// testar Postman
	// GET - http://localhost:8080/customer/1
	// GET - http://localhost:8080/customer/10

}
