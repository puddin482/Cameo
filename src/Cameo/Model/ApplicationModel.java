package Cameo.Model;
import javafx.beans.property.*;
import javafx.collections.*;

public class ApplicationModel
{
	public SimpleIntegerProperty selectedDocumentIndex = new SimpleIntegerProperty(0);
	
	public ObservableList<Document> documents = FXCollections.observableArrayList();
	
	public SimpleStringProperty statusMessage = new SimpleStringProperty("");
	
	public Preferences preferences = new Preferences();
}

// Application
//  projectDirectory: ""
//	preferences:
//	[
//		font : {}
//		theme : {} 
// 	]
//	documents :
//	[
//		document1 :
// 		{
//			title: 
//			path:
//			content:
//		}
//	]