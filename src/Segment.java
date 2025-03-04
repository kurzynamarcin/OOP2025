public class Segment {
    private Point start;
    private Point end;


    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Segment() {
    }


    @Override
    public String toString() {
        return "Segment{" + "\n" +
                "\t" + "start=" + start + ",\n" +
                "\t" + "end=" + end + "\n" +
                '}';
    }

    public Segment(Segment toCopy) {
        this.start = toCopy.getStart();
        this.end = toCopy.getEnd();
    }
}
