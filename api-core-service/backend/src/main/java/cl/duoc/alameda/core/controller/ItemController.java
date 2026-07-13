package cl.duoc.alameda.core.controller;
import cl.duoc.alameda.core.model.Item;
import cl.duoc.alameda.core.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/items")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemController {
    private final ItemService itemService;
    public ItemController(ItemService itemService) { this.itemService = itemService; }
    @GetMapping
    public ResponseEntity<List<Item>> getAllItems(@RequestHeader(value = "X-Audit-User", defaultValue = "Invitado") String user) {
        System.out.println("Solicitud realizada por el usuario: " + user);
        return ResponseEntity.ok(itemService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) { return ResponseEntity.ok(itemService.findById(id)); }
    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item) { return ResponseEntity.status(201).body(itemService.save(item)); }
}
