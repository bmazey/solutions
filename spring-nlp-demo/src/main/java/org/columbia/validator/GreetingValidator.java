package org.columbia.validator;

import org.columbia.dto.GreetingDTO;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class GreetingValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return GreetingDTO.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        GreetingDTO greeting = (GreetingDTO) obj;
        if (checkInputString(greeting.getContent())) {
            errors.rejectValue("name", "name.empty");
        }
    }

    private boolean checkInputString(String input) {
        return (input == null || input.trim().length() == 0);
    }
}
