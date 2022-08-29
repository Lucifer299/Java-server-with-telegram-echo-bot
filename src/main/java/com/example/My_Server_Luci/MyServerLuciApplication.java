package com.example.My_Server_Luci;

import com.example.My_Server_Luci.telegram.Luci_bot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class MyServerLuciApplication {


	public static void main(String[] args) {
		SpringApplication.run(MyServerLuciApplication.class, args);
		try {
			TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
			botsApi.registerBot(new Luci_bot());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}


	}

}
