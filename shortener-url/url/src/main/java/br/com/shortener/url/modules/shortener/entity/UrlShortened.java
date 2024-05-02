package br.com.shortener.url.modules.shortener.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

@Getter
@Setter
@Document(collection = "url")
public class UrlShortened {

    @Id
    private String shorter;

    private String url;

    private Timestamp created_at;

}
