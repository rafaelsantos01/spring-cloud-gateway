package br.com.shortener.url.modules.shortener.services.redirectUrl;

import br.com.shortener.url.modules.shortener.services.redirectUrl.dto.RedirectUrlResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/{shortUrl}")
public class RedirectUrlController {

    @Autowired
    private RedirectUrlService service;

    @GetMapping
    public RedirectView handle(@PathVariable("shortUrl") String shortUrl) {
        RedirectUrlResponse url = service.execute(shortUrl);

        return new RedirectView(url.getUrl());
    }
}
