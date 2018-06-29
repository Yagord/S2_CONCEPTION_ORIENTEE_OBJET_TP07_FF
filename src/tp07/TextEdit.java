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
public class TextEdit extends Control {

    public TextEdit(String text, int x, int y, int largeur, int hauteur, Police police) {
        super(text, x, y, largeur, hauteur, police);
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
