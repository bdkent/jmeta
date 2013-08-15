package bdk.jmeta.core;

public interface JMetaConstructors {

	public interface JMetaConstructors1<T, C extends JMetaConstructor<T>> extends JMetaConstructors {
	}

	public interface JMetaConstructors2<T, C1 extends JMetaConstructor<T>, C2 extends JMetaConstructor<T>> extends JMetaConstructors {
	}

	public interface JMetaConstructors3<T, C1 extends JMetaConstructor<T>, C2 extends JMetaConstructor<T>, C3 extends JMetaConstructor<T>> extends JMetaConstructors {
	}

	public interface JMetaConstructor<R> {
		boolean isDefault();
	}

	public interface JMetaConstructor0<R> extends JMetaConstructor<R> {
		R newInstance();
	}
	
	public interface JMetaCopyConstructor<R> extends JMetaConstructor1<R,R> {
		
	}

	public interface JMetaConstructor1<P1, R> extends JMetaConstructor<R> {
		R newInstance(P1 p1);
	}

	public interface JMetaConstructor2<P1, P2, R> extends JMetaConstructor<R> {
		R newInstance(P1 p1, P2 p2);
	}
}