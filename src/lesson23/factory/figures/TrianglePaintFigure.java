package lesson23.factory.figures;

import lesson23.factory.types.Color;

public class TrianglePaintFigure extends AbstractPaintFigure {

    public TrianglePaintFigure(Color foregroundColor, Color backgroundColor) {
        super(foregroundColor, backgroundColor);
    }

    @Override
    public void paint() {
        System.out.println("This is a %s-%s triangle paint".formatted(getForegroundColor(), getBackgroundColor()));
    }
}
