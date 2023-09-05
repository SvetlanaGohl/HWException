package pro.sky.gohl.skyprogohlexceptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class SkyproGohlExceptionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkyproGohlExceptionsApplication.class, args);
		{
			try {
				AuthenticationValidator.checkInformationPerson("lOgIn8_", "password",
						"passwo!rd");
				System.out.println("Входные данные введены успешно!");
			} catch (WrongLoginException | WrongPasswordException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

