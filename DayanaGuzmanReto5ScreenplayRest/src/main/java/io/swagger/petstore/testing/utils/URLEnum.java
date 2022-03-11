package io.swagger.petstore.testing.utils;

public enum URLEnum {
    URL_BASE("https://petstore.swagger.io"),
    URI_POST_PET("/v2/pet"),
    URI_GET_PET("/v2/pet/"),
    URI_PUT_PET("/v2/pet"),
    URI_DELETE_PET("/v2/pet/");

    private String value;

    URLEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
