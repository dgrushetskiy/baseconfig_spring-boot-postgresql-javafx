package ru.gothmog.project.javafxdb;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.gothmog.project.javafxdb.config.AbstractJavaFXApplicationSupport;
import ru.gothmog.project.javafxdb.fxml.StartView;
import ru.gothmog.project.javafxdb.utils.LocaleManager;

import java.util.Locale;

@SpringBootApplication
public class JavafxDbApplication extends AbstractJavaFXApplicationSupport {

	@Autowired
	private StartView startView;

	private Stage stage;

	@Value("${ui.title: JavaFX DB examle}")
	private String winTitle;

	@Override
	public void start(Stage primaryStage) throws Exception {
		super.start(primaryStage);
		loadMainFXML(LocaleManager.EN_LOCALE, primaryStage);
	}

	// загружает дерево компонентов и возвращает в виде VBox (корневой элемент в FXML)
	private void loadMainFXML(Locale locale, Stage primaryStage) {
		this.stage = primaryStage;
		primaryStage.setScene(new Scene(startView.getView(locale)));
		primaryStage.setResizable(true);
		primaryStage.centerOnScreen();
		primaryStage.setTitle(winTitle);//startView.getResourceBundle().getString("address_book")
		primaryStage.show();
	}


	public static void main(String[] args) {
		launchApp(JavafxDbApplication.class, args);
	}

	@Override
	public void stop() throws Exception {
		System.exit(0);
	}
}
