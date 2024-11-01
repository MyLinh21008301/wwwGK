package iuh.se.dao;

import java.util.List;
import java.util.Optional;

public interface IReponsitory<T> {
	boolean them(T t);
	boolean xoa(T t);
	boolean sua(T t);
	List<T> layDs();
	Optional<T> layTheoMa(Object...objects);
}
