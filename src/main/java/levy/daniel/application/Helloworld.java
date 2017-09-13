package levy.daniel.application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * class Helloworld :<br/>
 * .<br/>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author dan Lévy
 * @version 1.0
 * @since 10 sept. 2017
 *
 */
public class Helloworld extends Application {

	// ************************ATTRIBUTS************************************/

	/**
	 * LOG : Log : Logger pour Log4j (utilisant commons-logging).
	 */
	private static final Log LOG = LogFactory.getLog(Helloworld.class);
	
	// *************************METHODES************************************/

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void start(
			final Stage primaryStage) {
		
		final Button btn = new Button();
		
		btn.setText("Say 'Hello World'");
		
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World!");
			}
		});

		final StackPane root = new StackPane();
		
		root.getChildren().add(btn);

		final Scene scene = new Scene(root, 300, 250);

		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	} // Fin de start(...).________________________________________________
	
	

	/**
	 * method main() :<br/>
	 * .<br/>
	 * <br/>
	 *
	 * @param pArgs : String[] :  .<br/>
	 */
	public static void main(final String[] pArgs) {
		launch(pArgs);
	} // Fin de main().____________________________________________________
	


} // FIn DE LA CLASSE Helloworld.--------------------------------------------
