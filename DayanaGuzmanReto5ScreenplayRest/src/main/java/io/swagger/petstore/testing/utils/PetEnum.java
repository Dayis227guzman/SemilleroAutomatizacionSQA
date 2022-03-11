package io.swagger.petstore.testing.utils;

public enum PetEnum {

    ID_PET("123654"),
    ID_CATEGORY("1"),
    NAME_CATEGORY("Mascota"),
    NAME_PET("Django"),
    PHOTO_URL("string"),
    ID_TAG("1"),
    NAME_TAG("mamifero"),
    STATUS("available");

     private String value;

    PetEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
