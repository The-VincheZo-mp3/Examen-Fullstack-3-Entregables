package cl.duoc.alameda.core;
import cl.duoc.alameda.core.model.Item;
import cl.duoc.alameda.core.service.ItemService;
import cl.duoc.alameda.core.exception.ResourceNotFoundException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ItemServiceTest {
    private final ItemService itemService = new ItemService();
    @Test
    public void testFindAll_DebeRetornarElementos() {
        assertTrue(itemService.findAll().size() > 0);
    }
    @Test
    public void testFindById_DebeRetornarItemCorrecto() {
        assertEquals("PROD-001", itemService.findById(1L).getSku());
    }
    @Test
    public void testFindById_DebeLanzarExcepcionSiNoExiste() {
    }
}
