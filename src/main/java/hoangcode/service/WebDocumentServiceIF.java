package hoangcode.service;

import java.util.List;

import hoangcode.model.WebDocument;

public interface WebDocumentServiceIF {
	  WebDocument findById(int id);
	  
	    List<WebDocument> findAll();
	     
	    List<WebDocument> findAllByUserId(int id);
	     
	    void saveDocument(WebDocument document);
	     
	    void deleteById(int id);
}
