package be.thomasmore.bookserver.model.dto;

import java.util.Collection;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ShopDetailedDTO {

    private int id;
    private String name;
    private Collection<ShopDTO> shops;
}
