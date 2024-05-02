package br.com.shortener.url.modules.shortener.services.newShortenerUrl;

import br.com.shortener.url.modules.shortener.services.newShortenerUrl.dto.NewShortenerUrlRequest;
import br.com.shortener.url.modules.shortener.services.newShortenerUrl.dto.NewShortenerUrlResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shorten")
public class NewShortenerUrlController {

    @Autowired
    private NewShortenerUrlService service;

    @PostMapping
    @ResponseBody
    public ResponseEntity<NewShortenerUrlResponse> handle(@RequestBody NewShortenerUrlRequest request){
        return new ResponseEntity<>(service.execute(request), HttpStatus.OK);
    }
}
