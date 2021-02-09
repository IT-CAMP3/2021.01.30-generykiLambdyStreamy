package pl.camp.it.generics;

public class FigureBox<T extends Figure> {
    private T figure;

    public T getFigure() {
        return figure;
    }

    public void setFigure(T figure) {
        this.figure = figure;
    }

    public void zrobCosZFigura() {
        this.figure.a();
    }
}
