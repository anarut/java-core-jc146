package lesson23.factory.figures;

import lesson23.factory.types.Color;

public class StarPaintFigure extends AbstractPaintFigure {

    public StarPaintFigure(Color foregroundColor, Color backgroundColor) {
        super(foregroundColor, backgroundColor);
    }

    @Override
    public void paint() {
        System.out.println("This is a %s-%s star paint".formatted(getForegroundColor(), getBackgroundColor()));
    }
}
