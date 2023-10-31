package java.com.example.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String emailDomain;

    @Override
    public void initialize(CheckEmail constraintAnnotation) {
        emailDomain = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (s != null) {
            return s.endsWith(emailDomain);
        }
        return false;
    }
}
