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
public class CheckBox extends Button {
    private boolean checked;
    
    public CheckBox(String text, int x, int y, int largeur, int hauteur, Police police) {
        super(text, x, y, largeur, hauteur, police);
        this.checked = false;
    }
    
}
