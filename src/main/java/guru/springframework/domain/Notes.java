package guru.springframework.domain;

import javax.persistence.*;
import lombok.Data;

/**
 * Created by jt on 6/13/17.
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
