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
public class ListBox extends Control {
    private StringList stringList;

    public ListBox(String text, int x, int y, int largeur, int hauteur, Police police, StringList stringList) {
        super(text, x, y, largeur, hauteur, police);
        this.stringList = stringList;
    }
    
    public void ajouteString(String str) {
        this.stringList.ajouteString(str);
    }
    
    public void supprimeString(String str) {
        this.stringList.supprimeString(str);
    }

    @Override
    protected boolean canHaveChildren() {
        return false;
    }

    @Override
    public void draw(Ecran s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doClick(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
