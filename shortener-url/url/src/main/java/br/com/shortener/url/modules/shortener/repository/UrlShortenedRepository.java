package br.com.shortener.url.modules.shortener.repository;

import br.com.shortener.url.modules.shortener.entity.UrlShortened;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlShortenedRepository extends MongoRepository<UrlShortened,String> {
}
