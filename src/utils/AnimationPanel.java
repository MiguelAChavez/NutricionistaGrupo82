package utils;

/**
 *
 * @author Pc Chavez
 */
public class AnimationPanel {

    public void animateScroll(PanelRound panel) {
        if (panel.getX() == 0) {
            Animacion.Animacion.mover_izquierda(panel.getX(), (-panel.getWidth()), 10, 15, panel);
        } else if (panel.getX() == -panel.getWidth()) {
            Animacion.Animacion.mover_derecha(panel.getX(), 0, 2, 30, panel);
        }

    }
}
