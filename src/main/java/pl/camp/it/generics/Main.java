package pl.camp.it.generics;

public class Main {
    public static void main(String[] args) {
        QueueFIFO<Circle> queue = new QueueFIFO<>();

        queue.push(new Circle());
        queue.push(new Circle());

        Circle circle = queue.pop();
        System.out.println(circle);
        System.out.println(queue.pop());

        QueueLIFO<Integer> queueLIFO = new QueueLIFO<>();

        queueLIFO.push(5);
        queueLIFO.push(7);
        queueLIFO.push(15);

        System.out.println(queueLIFO.pop());

        queueLIFO.push(20);

        System.out.println(queueLIFO.pop());
        System.out.println(queueLIFO.pop());

        Pair<String, Integer> para = new Pair<>("Janusz", 42);

        System.out.println(para.getFirst());
        System.out.println(para.getSecond());

        Pair<Double, Circle> para2 = new Pair<>(5.55, new Circle());

        para2.setFirst(7.77);

        System.out.println(para2.getFirst());
        System.out.println(para2.getSecond());

        RESTResponse<Circle> response = new RESTResponse<>();
        response.setStatus(1004);
        response.setDescription("Operation performed correctly !!");
        response.setObject(new Circle());

        Circle circle1 = response.getObject();

        FigureBox<Triangle> figureBox = new FigureBox<>();
        figureBox.setFigure(new Triangle());
        Triangle t = figureBox.getFigure();

        FigureBox<Figure> stringFigureBox = new FigureBox<>();

        FigureBox<?> pudelko = metoda1(1);
        pudelko.getFigure().a();

        //wyliczPoleFiguryWPudelku(new Box<String>());
        wyliczPoleFiguryWPudelku(new Box<Circle>());
        wyliczPoleFiguryWPudelku(new Box<Triangle>());
        wyliczPoleFiguryWPudelku(new Box<Square>());
        wyliczPoleFiguryWPudelku(new Box<Figure>());

        metoda2(new Box<Figure>());
        //metoda2(new Box<Square>());
        //metoda2(new Box<String>());
        metoda2(new Box<Object>());

        Figure f = new Square();

        //FigureBox<Figure> figureBox1 = new FigureBox<Square>();
    }

    public static FigureBox<?> metoda1(int a) {
        switch (a) {
            case 1:
                return new FigureBox<Square>();
            case 2:
                return new FigureBox<Circle>();

            default:
                return new FigureBox<Triangle>();
        }
    }

    public static void wyliczPoleFiguryWPudelku(Box<? extends Figure> pudelko) {

    }

    public static void metoda2(Box<? super Figure> pudelko) {

    }
}
