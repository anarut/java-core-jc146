package lesson23.factory;

import lesson23.factory.figures.PaintFigure;
import lesson23.factory.figures.PaintFigureFactory;
import lesson23.factory.types.Color;
import lesson23.factory.types.Figure;

public class Main {

    public static void main(String[] args) {
        PaintFigureFactory factory = new PaintFigureFactory();

        PaintFigure paintFigure = factory.createPaintFigure(Figure.SQUARE);
        paintFigure.paint();

        PaintFigure paintFigure1 = factory.createPaintFigure(Figure.TRIANGLE);
        paintFigure1.paint();

        factory.setBackgroundColor(Color.BLUE);
        factory.setForegroundColor(Color.RED);

        PaintFigure paintFigure2 = factory.createPaintFigure(Figure.STAR);
        paintFigure2.paint();

        PaintFigure paintFigure3 = factory.createPaintFigure(Figure.TRIANGLE, Color.RED, Color.GREEN);
        paintFigure3.paint();


        System.out.println(factory.getCount());
    }

}
