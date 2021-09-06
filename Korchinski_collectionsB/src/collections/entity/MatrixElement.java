package collections.entity;

public class MatrixElement {
    private int value;
    private int column;
    private int row;

    public MatrixElement(int value, int column, int row) {
        this.value = value;
        this.column = column;
        this.row = row;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String toString() {
        return "MatrixElement{" +
                "value=" + value +
                ", column=" + column +
                ", row=" + row +
                '}';
    }
}
