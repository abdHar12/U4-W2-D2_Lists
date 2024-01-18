package classe;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Rubrica {
    HashMap<String, String> allContacts;
    public Rubrica(){
        this.allContacts=new HashMap<String, String>();
    }
    public void addTelNome(String nome, String telefono) {
        this.allContacts.put(nome, telefono);
    }

    public void removeTelNome(String nome){
        this.allContacts.remove(nome);
    }

    public String findWithPhone(String telefono){
        for (Map.Entry<String, String> contact: this.allContacts.entrySet()) {
            if (Objects.equals(telefono, contact.getValue())) {
                return contact.getKey();
            }
        }
        return "Telefono non trovato!";
    }

    public String findWithName(String name){
        if(this.allContacts.containsKey(name)) return this.allContacts.get(name);
        return "Nome non trovato!";
    }

    public HashMap<String, String> getAllContacts() {
        return allContacts;
    }
}
