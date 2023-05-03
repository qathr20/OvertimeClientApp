package id.co.mii.overtimeclientapp.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reimburse {

    private Integer id;
    private int nominal;
    private String description;
    private String file;
    private String status;
    private Employee employee;
    private Type type;
    private List<HistoryReimburse> HistoryReimburse;
}
