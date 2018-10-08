package com.kaizensoftware.pokerpay.common.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constants {

    // Swagger
    public static final String AUTHORIZATION = "Authorization";

    // Regex
    public static final String BIRTHDAY_PATTERN = "dd/MM/yyyy";
    public static final String ACTIVATION_ACCOUNT_URL_PROPERTY = "pokerpay.account.register.context";

    public static final String CURRENT_USER = "current_user";
    public static final String TO_USER_CONTACT = "to_user_contact";

    // List of examples of invalid passwords
    public static final List<String> INVALID_PASSWORDS = new ArrayList<>(Arrays.asList(
            "password", "pass123", "some_pass_123", "hello123", "password_123"
    ));

    // List of default gender references
    public static final List<String> GENDER_REFERENCES = new ArrayList<>(Arrays.asList(
            "Masculino", "Femenino"
    ));

}
