package Aufgabe_2;

public class SentenceNode extends Sentence {
    public Sentence left;
    public Sentence right;
    public String part;

    public SentenceNode(Sentence left, Sentence right, String part) {
        this.left = left;
        this.right = right;
        this. part = part;
    }

    public String getPart() {
        return part;
    };

    public String toString() {
        return "(" + this.left + this.part + this.right + ")";
    }

}
