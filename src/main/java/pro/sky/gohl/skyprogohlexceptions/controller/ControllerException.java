package pro.sky.gohl.skyprogohlexceptions.controller;

import ServiceExceptions.ServiceException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.gohl.skyprogohlexceptions.AuthenticationValidator;


@RestController
public class ControllerException {
    private ServiceException serviceException;

    public ControllerException(ServiceException serviceException) {
        this.serviceException = serviceException;
    }

    @GetMapping("/exception")
    public String exception() {
        return serviceException.exception();
    }
}

//    private final AuthenticationValidator authenticationValidator; //запуталась с передачей методов в классы!!!///

//        public ControllerException(AuthenticationValidator authenticationValidator) {
//           this.authenticationValidator = authenticationValidator;
//        }

//        @GetMapping("/login")
//        public String login(@RequestParam String login){
//            return authenticationValidator.checkInformationPerson(login);
        }
//        @GetMapping("/password")
//        public String password(@RequestParam String password) {
//            return authenticationValidator.checkInformationPerson(password);
        }
//        @GetMapping("/confirmPassword")
//        public String confirmPassword(@RequestParam String confirmPassword){
//            return authenticationValidator.checkInformationPerson(confirmPassword);
//        }

