package Team12.service;

import java.util.List;

import Team12.model.WebDocument;

public interface WebDocumentServiceIF {
	  WebDocument findById(int id);
	  
	    List<WebDocument> findAll();
	     
	    List<WebDocument> findAllByUserId(int id);
	     
	    void saveDocument(WebDocument document);
	     
	    void deleteById(int id);
}
