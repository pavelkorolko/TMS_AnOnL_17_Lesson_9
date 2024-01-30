package Services;

import Documents.Document;
import Exceptions.ABCSequenceException;
import Exceptions.FivesSequenceException;
import Interfaces.IRegister;

public class Register implements IRegister {
    Document[] documents;

    public Register() {
        this.documents = new Document[10];
    }

    @Override
    public void saveDocument(Document document) throws Exception {
        for (int i = 0; i < documents.length; i++) {
            if (documents[documents.length - 1] != null) {
                throw new Exception("Not enough space!");
            }
            if (documents[i] == null) {
                if (!document.getDocNumber().contains("abc")) {
                    throw new ABCSequenceException("There is no 'abc' sequence in document naming!");
                } else if (!document.getDocNumber().startsWith("555")) {
                    throw new FivesSequenceException("The document does not start from 555");
                } else if(!document.getDocNumber().endsWith("1a2b")){
                    throw new FivesSequenceException("The document does not end with 1a2b");
                }else {
                    documents[i] = document;
                    break;
                }
            }
        }
    }
}
