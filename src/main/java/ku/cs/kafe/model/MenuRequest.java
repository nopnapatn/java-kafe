// 6410450133 nopnapat norasri

package ku.cs.kafe.model;

import java.util.UUID;

import lombok.Data;

@Data
public class MenuRequest {
    private UUID categoryId;

    private String name;
    private double price;
}