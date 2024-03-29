package changmin.rentalBusiness.service;

import changmin.rentalBusiness.domain.Item;
import changmin.rentalBusiness.repository.ItemRepository;
import changmin.rentalBusiness.repository.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final RentalRepository rentalRepository;

    @Transactional
    public void saveItem(Item item){
        itemRepository.save(item);
    }

    @Transactional
    public void updateItem(Long itemId, String name, int allStockQuantity, String category){
        Item item = itemRepository.findOne(itemId);
        item.updateInfo(name, allStockQuantity, category);
    }


    // orphan removal 로 바꿀 순 없는가?
    @Transactional
    public void deleteItem(Long itemId){
        rentalRepository.deleteRentalByItem_Id(itemId);
        itemRepository.deleteItem(itemId);
    }

    public List<Item> findAllItems() {
        return itemRepository.findAll();
    }

    public Item findOneItem(Long itemId){
        return itemRepository.findOne(itemId);
    }

}
