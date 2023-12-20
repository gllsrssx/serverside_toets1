package be.thomasmore.bookserver.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ShopDetailedDTO {

    private int id;
    private String name;

    private String street;
    private String city;
    private String country;

}
