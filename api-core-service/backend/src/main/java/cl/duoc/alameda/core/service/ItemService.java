package cl.duoc.alameda.core.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import cl.duoc.alameda.core.exception.ResourceNotFoundException;
import cl.duoc.alameda.core.model.Item;

@Service
public class ItemService {
    
    private final List<Item> repository = new ArrayList<>(Arrays.asList(
        new Item(1L, "PROD-001", "Componente Backend Primario", 50, 25000.0, true),
        new Item(2L, "PROD-002", "Modulo Integracion Frontend", 35, 45000.0, true),
        new Item(3L, "PROD-003", "Gateway de Microservicios", 12, 89000.0, true)
    ));

    public List<Item> findAll() { 
        return repository; 
    }

    public Item findById(Long id) {
        for (Item item : repository) {
            if (item.getId().equals(id)) { 
                return item; 
            }
        }
        throw new ResourceNotFoundException("Item no encontrado con ID: " + id);
    }

    public Item save(Item newItem) {
        newItem.setId((long) (repository.size() + 1));
        repository.add(newItem); 
        return newItem;
    }
}