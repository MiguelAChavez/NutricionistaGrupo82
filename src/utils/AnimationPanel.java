package utils;

import javax.swing.JButton;

/**
 *
 * @author Pc Chavez
 */
public class AnimationPanel {

    private int panelX = 0;

    public void animateVisibleScroll(PanelRound panel, JButton button) {
        if (panel.getX() == -panel.getWidth()) {
            button.setVisible(Boolean.FALSE);
            Animacion.Animacion.mover_derecha(panel.getX(), 0, 2, 30, panel);
            panel.setLocation(0, panel.getY());
            System.out.println("animateVisibleScroll panel :  " + panel.getLocation());
        }
    }

    public void animateHiddenScroll(PanelRound panel, JButton button) {
        if (panel.getX() == 0) {
            button.setVisible(Boolean.TRUE);
            panelX = -panel.getWidth();
            Animacion.Animacion.mover_izquierda(panel.getX(), panelX, 10, 15, panel);
            panel.setLocation(panelX, panel.getY());
            System.out.println("animateHiddenScroll panel :  " + panel.getLocation());
        }
    }

}
