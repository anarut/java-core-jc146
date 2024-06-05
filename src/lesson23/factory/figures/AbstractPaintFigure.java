package lesson23.factory.figures;

import lesson23.factory.types.Color;

public abstract class AbstractPaintFigure implements PaintFigure {

    private Color foregroundColor;
    private Color backgroundColor;

    public AbstractPaintFigure(Color foregroundColor, Color backgroundColor) {
        this.foregroundColor = foregroundColor;
        this.backgroundColor = backgroundColor;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }
}
