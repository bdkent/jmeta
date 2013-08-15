package bdk.jmeta.core.support;

import bdk.jmeta.core.support.Tuples.Tuple1;
import bdk.jmeta.core.support.Tuples.Tuple2;

public interface Types {

	public interface Type<T> {

		Class<T> getJavaClass();

		Tuples getTypes();
	}

	public interface Type1<T, G1 extends Type<?>> extends Type<T> {

		G1 getType1();

		Tuple1<G1> getTypes();
	}

	public interface Type2<T, G1 extends Type<?>, G2 extends Type<?>> extends Type<T> {

		G1 getType1();

		G2 getType2();

		Tuple2<G1, G2> getTypes();
	}
}
