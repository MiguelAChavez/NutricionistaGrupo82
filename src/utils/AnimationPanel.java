package utils;

import javax.swing.JButton;

/**
 *
 * @author Pc Chavez
 */
public class AnimationPanel {

    public void animateVisibleScroll(PanelRound panel, JButton button) {
        if (panel.getX() == -panel.getWidth()) {
            button.setVisible(Boolean.FALSE);
            Animacion.Animacion.mover_derecha(panel.getX(), 0, 2, 30, panel);
        }
    }

    public void animateHiddenScroll(PanelRound panel, JButton button) {
        if (panel.getX() == 0) {
            button.setVisible(Boolean.TRUE);
            Animacion.Animacion.mover_izquierda(panel.getX(), (-panel.getWidth()), 10, 15, panel);
        }
    }

}
