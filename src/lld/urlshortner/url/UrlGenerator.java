package lld.urlshortner.url;

import lld.urlshortner.hash.Encoder;

public class UrlGenerator {

    private final Encoder encoder;

    public UrlGenerator(Encoder encoder) {
        this.encoder = encoder;
    }

    public String generateKey(String longUrl) {
        return encoder.encode(Math.abs(longUrl.hashCode()));
    }

    public static void main(String[] args) {
        String generateUrl = new UrlGenerator(new Encoder())
                .generateKey("https://www.google.com");

        System.out.println("generated url: " + generateUrl);

    }
}
