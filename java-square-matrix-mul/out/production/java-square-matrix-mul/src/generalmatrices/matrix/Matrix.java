package generalmatrices.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Matrix<T> {

  private final List<T> matrix;
  private final int order;

  public Matrix(List<T> m) {
    // Pre: size of list m is a perfect square
    if (m.size() == 0) {
      throw new IllegalArgumentException("Matrix array cannot be of length 0.");
    }
    matrix = m;
    order = (int) Math.sqrt(m.size());
  }

  public T get(int row, int col) {
    return matrix.get(row * order + col);
  }

  public int getOrder() {
    return order;
  }

  public Matrix<T> sum(Matrix<T> other, BinaryOperator<T> elementSum) {
    // Pre: other has same order as this
    List<T> newMatrix = new ArrayList<>(order * order);
    for (int i = 0; i < order; i++) {
      for (int j = 0; j < order; j++) {
        newMatrix.add(i * order + j, elementSum.apply(get(i, j), other.get(i,j)));
      }
    }
    return new Matrix<>(newMatrix);
  }

  public Matrix<T> product(Matrix<T> other, BinaryOperator<T> elementSum, BinaryOperator<T> elementProduct) {
    // Pre: other has same order as this
    List<T> newMatrix = new ArrayList<>(order * order);
    for (int i = 0; i < order; i++) {
      for (int j = 0; j < order; j++) {
        T res = elementProduct.apply(get(i, 0), other.get(0, j));
        for (int k = 1; k < order; k++) {
          res = elementSum.apply(res,
              elementProduct.apply(get(i, k), other.get(k, j)));
        }
        newMatrix.add(i * order + j, res);
      }
    }
    return new Matrix<>(newMatrix);
  }

  @Override
  public String toString() {
    // NOTE: This can also be implemented with streams
    StringBuilder res = new StringBuilder();
    res.append('[');
    for (int i = 0; i < order; i++) {
      res.append('[');
      for (int j = 0; j < order; j++) {
        res.append(matrix.get(i * order + j));
        res.append(' ');
      }
      res.replace(res.length() - 1, res.length(), "]");
    }
    res.append(']');
    return res.toString();
  }
}
