package com.michal.justfindgame.eventCatalog;



import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Event {

    @Id
    private String id;

    @NotNull(message = "must provide number of missing players")
    private int missing;

    @NotBlank(message = "must provide adress of event")
    private String adress;

    @NotBlank(message = "must provide difficulty of game")
    private String difficulty;

    @NotBlank(message = "must provide type of the event")
    private String type;

    @NotBlank(message = "must provide when event takes place")
    private String when;


}
