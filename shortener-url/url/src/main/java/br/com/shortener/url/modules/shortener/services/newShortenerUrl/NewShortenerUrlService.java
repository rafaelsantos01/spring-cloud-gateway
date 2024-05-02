package br.com.shortener.url.modules.shortener.services.newShortenerUrl;

import br.com.shortener.url.modules.shortener.entity.UrlShortened;
import br.com.shortener.url.modules.shortener.repository.UrlShortenedRepository;
import br.com.shortener.url.modules.shortener.services.newShortenerUrl.dto.NewShortenerUrlRequest;
import br.com.shortener.url.modules.shortener.services.newShortenerUrl.dto.NewShortenerUrlResponse;
import br.com.shortener.url.utils.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewShortenerUrlService {

    @Autowired
    private UrlShortenedRepository urlShortenedRepository;

    @Autowired
    private RandomString randomString;

    public NewShortenerUrlResponse execute(NewShortenerUrlRequest request) {
        String id = randomString.generateRandomString();

        UrlShortened url = new UrlShortened();
        url.setUrl(request.getUrl());
        url.setShorter(id);

        UrlShortened save = urlShortenedRepository.save(url);

        NewShortenerUrlResponse response = new NewShortenerUrlResponse();
        response.setUrl(save.getShorter());

        return response;
    }
}
