package serverjava;

import java.awt.*;


public class DessineFormeCORPolygoneCouleur extends  DessineFormeCOR{
    final static String NAME_FIGURE = "polygone";

    DessineFormeCORPolygoneCouleur(DessineFormeCOR suivant, Graphics graphics){
        super(suivant,graphics);
    }

    @Override
    protected boolean dessine1(String[] TabReq){
        String name = TabReq[0].trim().toLowerCase();
        if(name.equals(NAME_FIGURE) && (Integer.parseInt(TabReq[1].trim())*2)+6 == TabReq.length){
            graphics.setColor(new Color(
                Integer.parseInt(TabReq[TabReq.length-4].trim()),
                Integer.parseInt(TabReq[TabReq.length-3].trim()),
                Integer.parseInt(TabReq[TabReq.length-2].trim()),
                Integer.parseInt(TabReq[TabReq.length-1].trim())));
            Polygon poly = new Polygon();
            for (int i = 0; i < (Integer.parseInt(TabReq[1].trim())*2); i+=2) {
                poly.addPoint(Integer.parseInt(TabReq[i+2].trim()), Integer.parseInt(TabReq[i+3].trim())); 
            }
            graphics.drawPolygon(poly);
            return true;
        }
        return false;
    }

} 
