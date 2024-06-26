package fr.fms.apitrainings.business;

import fr.fms.apitrainings.dao.*;
import fr.fms.apitrainings.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IBusinessImpl implements IBusiness {

    @Autowired()
    TrainingRepository trainingRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Training> getTrainings() {return trainingRepository.findAll(); }

    @Override
    public List<Training> getTrainingsByCategory(Long idCategory) {
        Category category = categoryRepository.findById(idCategory).orElse(null);
        return trainingRepository.findByCategory(category);
    }

    @Override
    public Optional<Training> getTrainingById(Long idTraining) { return trainingRepository.findById(idTraining); }

    @Override
    public Training saveTraining(Training training) { return trainingRepository.save(training); }

    @Override
    public void deleteTraining(Long idTraining) { trainingRepository.deleteById(idTraining); }

    @Override
    public List<Category> getCategories() { return categoryRepository.findAll(); }

    @Override
    public List<User> getUsers() { return userRepository.findAll(); }

    @Override
    public List<UserRole> getAllUserRole(Long idUser) {
        User user = userRepository.findById(idUser).orElse(null);
        return userRoleRepository.findByUser(user);
    }

    @Override
    public Customer saveCustomer(Customer customer) { return customerRepository.save(customer); }

    @Override
    public Commande saveOrder(Commande order) { return orderRepository.save(order); }
}
