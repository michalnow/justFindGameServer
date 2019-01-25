package com.michal.justfindgame.eventCatalog;



import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

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
    private String address;

    @NotBlank(message = "must provide difficulty of game")
    private String difficulty;

    @NotBlank(message = "must provide type of the event")
    private String type;

    @NotNull(message = "must provide date of the event")
    @JsonFormat(pattern = "dd.MM.yyyy")
    private Date date;

    @NotNull(message = "must provide time when the event starts")
    @JsonFormat(pattern = "HH:mm")
    private Date hour;

    private String description;


}
