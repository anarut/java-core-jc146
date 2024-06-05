package lesson23.factory.figures;

import lesson23.factory.types.Color;

public class SquarePaintFigure extends AbstractPaintFigure {

    public SquarePaintFigure(Color foregroundColor, Color backgroundColor) {
        super(foregroundColor, backgroundColor);
    }

    @Override
    public void paint() {
        System.out.println("This is a %s-%s square paint".formatted(getForegroundColor(), getBackgroundColor()));
    }
}
