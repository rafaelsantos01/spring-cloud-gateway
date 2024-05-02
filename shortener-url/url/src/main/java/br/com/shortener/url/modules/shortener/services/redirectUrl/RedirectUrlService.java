package br.com.shortener.url.modules.shortener.services.redirectUrl;

import br.com.shortener.url.modules.shortener.entity.UrlShortened;
import br.com.shortener.url.modules.shortener.repository.UrlShortenedRepository;
import br.com.shortener.url.modules.shortener.services.redirectUrl.dto.RedirectUrlResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedirectUrlService {

    @Autowired
    private UrlShortenedRepository repository;


    public RedirectUrlResponse execute(String shortUrl) {
        UrlShortened url = repository.findById(shortUrl).orElse(null);
        if(url == null){
            throw new Error("Url not found");
        }

        RedirectUrlResponse response = new RedirectUrlResponse();
        response.setUrl(url.getUrl());
        return response;
    }
}
