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
public abstract class Control {
    private String text;
    private int x;
    private int y;
    private int largeur;
    private int hauteur;
    private Police police;
    private java.util.ArrayList<Control> alControl;
    
    public Control(String text, int x, int y, int largeur, int hauteur, Police police) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.police = police;
        this.alControl = new java.util.ArrayList();
    }
    
    public void addChildren(Control control) {
        this.alControl.add(control);
    }
    
    protected abstract boolean canHaveChildren();
    
    public abstract void draw(Ecran s);
    
    public void mouseClick(int x, int y) {
        
    }
    
    public boolean isTouched() {
        return false;
    }
    
    protected abstract void doClick(int x, int y);
    
    
}
