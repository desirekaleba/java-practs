/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ardoise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/**
 *
 * @author desire
 */
public class Ardoise extends JFrame{
    private JMenuBar menuBar = new JMenuBar();
JMenu fichier = new JMenu("Fichier"),
edition = new JMenu("Edition"),
forme = new JMenu("Forme du pointeur"),
couleur = new JMenu("Couleur du pointeur");
JMenuItem nouveau = new JMenuItem("Effacer"),
quitter = new JMenuItem("Quitter"),
rond = new JMenuItem("Rond"),
carre = new JMenuItem("Carré"),
bleu = new JMenuItem("Bleu"),
rouge = new JMenuItem("Rouge"),
vert = new JMenuItem("Vert");
//LA BARRE D'OUTILS
JToolBar toolBar = new JToolBar();
JButton square = new JButton(new ImageIcon("images/carré.jpg")),
circle = new JButton(new ImageIcon("images/rond.jpg")),
red = new JButton(new ImageIcon("images/rouge.jpg")),
green = new JButton(new ImageIcon("images/vert.jpg")),
blue = new JButton(new ImageIcon("images/bleu.jpg"));
//LES ÉCOUTEURS
private FormeListener fListener = new FormeListener();
private CouleurListener cListener = new CouleurListener();
//Notre zone de dessin
private DrawPanel drawPanel = new DrawPanel();
public Ardoise(){
this.setSize(700, 500);
this.setLocationRelativeTo(null);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//On initialise le menu
this.initMenu();
//Idem pour la barre d'outils
this.initToolBar();
//On positionne notre zone de dessin
this.getContentPane().add(drawPanel, BorderLayout.CENTER);
this.setVisible(true);
} 
//Initialise le menu
private void initMenu(){
nouveau.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent arg0) {
drawPanel.erase();
}
});
nouveau.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
KeyEvent.CTRL_DOWN_MASK));
quitter.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent arg0) {
System.exit(0);
}
});
quitter.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,
KeyEvent.CTRL_DOWN_MASK));
fichier.add(nouveau);
fichier.addSeparator();
fichier.add(quitter);
fichier.setMnemonic('F');
carre.addActionListener(fListener);
rond.addActionListener(fListener);
forme.add(rond);
forme.add(carre);
rouge.addActionListener(cListener);
vert.addActionListener(cListener);
bleu.addActionListener(cListener);
couleur.add(rouge);
couleur.add(vert);
couleur.add(bleu);
edition.setMnemonic('E');
edition.add(forme);
edition.addSeparator();
edition.add(couleur);
menuBar.add(fichier);
menuBar.add(edition);
this.setJMenuBar(menuBar);
} 
//Initialise la barre d'outils
private void initToolBar(){
JPanel panneau = new JPanel();
square.addActionListener(fListener);
circle.addActionListener(fListener);
red.addActionListener(cListener);
green.addActionListener(cListener);
blue.addActionListener(cListener);
toolBar.add(square);
toolBar.add(circle);
toolBar.addSeparator();
toolBar.add(red);
toolBar.add(blue);
toolBar.add(green);
this.getContentPane().add(toolBar, BorderLayout.NORTH);
} 
//ÉCOUTEUR POUR LE CHANGEMENT DE FORME
class FormeListener implements ActionListener{
public void actionPerformed(ActionEvent e) {
if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")){
if(e.getSource()==carre) drawPanel.setPointerType("SQUARE");
else drawPanel.setPointerType("CIRCLE");
}
else{
if(e.getSource()==square)drawPanel.setPointerType("SQUARE");
else drawPanel.setPointerType("CIRCLE");
}
}
}
//ÉCOUTEUR POUR LE CHANGEMENT DE COULEUR
class CouleurListener implements ActionListener{
public void actionPerformed(ActionEvent e) {
System.out.println(e.getSource().getClass().getName());
if(e.getSource().getClass().getName().equals("javax.swing.JMenuItem")){
System.out.println("OK !");
if(e.getSource()==vert)drawPanel.setPointerColor(Color.green);
else
if(e.getSource()==bleu)drawPanel.setPointerColor(Color.blue);
else drawPanel.setPointerColor(Color.red);
}
else{
if(e.getSource()==green)drawPanel.setPointerColor(Color.green);
else
if(e.getSource()==blue)drawPanel.setPointerColor(Color.blue);
else drawPanel.setPointerColor(Color.red);
}
}
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ardoise ard = new Ardoise();
        // TODO code application logic here
    }
public class Point {
//Couleur du point
private Color color = Color.red;
//Taille
private int size = 10;
//Position sur l'axe X : initialisé au dehors du conteneur
private int x = -10;
//Position sur l'axe Y : initialisé au dehors du conteneur
private int y = -10;
//Type de point
private String type = "ROND";
// Constructeur par défaut
public Point(){}
public Point(int x, int y, int size, Color color, String type){
this.size = size;
this.x = x;
this.y = y;
this.color = color;
this.type = type;
} 
//ACCESSEURS
public Color getColor() {
return color;
}
public void setColor(Color color) {
this.color = color;
}
public int getSize() {
return size;
}
public void setSize(int size) {
this.size = size;
}
public int getX() {
return x;
}
public void setX(int x) {
this.x = x;
}
public int getY() {
return y;
}
public void setY(int y) {
this.y = y;
}
public String getType() {
return type;
}
public void setType(String type) {
this.type = type;
}
}
public class DrawPanel extends JPanel{
//Couleur du pointeur
private Color pointerColor = Color.red;
//Forme du pointeur
private String pointerType = "CIRCLE";
//Position X du pointeur
private int posX = -10, oldX = -10;
//Position Y du pointeur
private int posY = -10, oldY = -10;
//Pour savoir si on doit dessiner ou non
private boolean erasing = true;
//Taille du pointeur
private int pointerSize = 15;
//Collection de points !
private ArrayList<Point> points = new ArrayList<Point>();
public DrawPanel(){
this.addMouseListener(new MouseAdapter(){
public void mousePressed(MouseEvent e){
points.add(new Point(e.getX() - (pointerSize / 2), e.getY()
- (pointerSize / 2), pointerSize, pointerColor, pointerType));
repaint();
}
});
this.addMouseMotionListener(new MouseMotionListener(){
public void mouseDragged(MouseEvent e) {
//On récupère les coordonnées de la souris et on enlève la moitié de la taille du pointeur pour centrer le tracé
points.add(new Point(e.getX() - (pointerSize / 2), e.getY()
- (pointerSize / 2), pointerSize, pointerColor, pointerType));
repaint();
} 
public void mouseMoved(MouseEvent e) {}
});
} 
// Vous la connaissez maintenant, celle-là
public void paintComponent(Graphics g) {
g.setColor(Color.white);
g.fillRect(0, 0, this.getWidth(), this.getHeight());
//Si on doit effacer, on ne passe pas dans le else => pas de dessin
if(this.erasing){
this.erasing = false;
}
else{
//On parcourt notre collection de points
for(Point p : this.points)
{
//On récupère la couleur
g.setColor(p.getColor());
//Selon le type de point
if(p.getType().equals("SQUARE")){
g.fillRect(p.getX(), p.getY(), p.getSize(), p.getSize());
}
else{
g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());
}
}
}
} 
//Efface le contenu
public void erase(){
this.erasing = true;
this.points = new ArrayList<Point>();
repaint();
} 
//Définit la couleur du pointeur
public void setPointerColor(Color c){
this.pointerColor = c;
}
//Définit la forme du pointeur
public void setPointerType(String str){
this.pointerType = str;
}
}
}
