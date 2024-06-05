package lesson23.factory.figures;

import lesson23.factory.types.Color;
import lesson23.factory.types.Figure;

import java.util.HashMap;
import java.util.Map;

public class PaintFigureFactory {

    private Color foregroundColor = Color.BLACK;
    private Color backgroundColor = Color.WHITE;
    private Map<Figure, Integer> count = new HashMap<>();

    public PaintFigureFactory() {
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public PaintFigure createPaintFigure(Figure figure) {
        return createPaintFigure(figure, foregroundColor, backgroundColor);
    }

    public PaintFigure createPaintFigure(Figure figure, Color foregroundColor, Color backgroundColor) {
        count.compute(figure, (k, v) -> v == null ? 1 : v + 1);
        return switch (figure) {
            case TRIANGLE -> new TrianglePaintFigure(foregroundColor, backgroundColor);
            case SQUARE -> new SquarePaintFigure(foregroundColor, backgroundColor);
            case STAR -> new StarPaintFigure(foregroundColor, backgroundColor);
            default -> throw new RuntimeException("Unknown figure");
        };
    }

    public Map<Figure, Integer> getCount() {
        return count;
    }
}
