/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp07;

/**
 *
 * @author Jean-Claude
 */
public class StringList {
    private java.util.ArrayList<String> alString;
    private ListBox listbox;
    
    public StringList(ListBox listbox) {
        this.alString = new java.util.ArrayList();
        this.listbox = listbox;
    }
    
    public void ajouteString(String str) {
        this.alString.add(str);
    }
    
    public void supprimeString(String str) {
        this.alString.remove(str);
    }
}
