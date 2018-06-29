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
public class Button extends Control implements Action{

    public Button(String text, int x, int y, int largeur, int hauteur, Police police) {
        super(text, x, y, largeur, hauteur, police);
    }

    @Override
    protected boolean canHaveChildren() {
        return false;
    }

    @Override
    public void draw(Ecran s) {
        
    }

    @Override
    protected void doClick(int x, int y) {
        this.execute(this);
    }

    @Override
    public void execute(Control sender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
