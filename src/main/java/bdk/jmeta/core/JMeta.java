package bdk.jmeta.core;

import bdk.jmeta.core.JMetaConstructors.JMetaCopyConstructor;
import bdk.jmeta.core.support.Tuples.Tuple1;
import bdk.jmeta.core.support.Types.Type;

public class JMeta {

	public interface JMetadata<T, C extends JMetaConstructors> {

		Type<T> getType();
		
		Class<T> getJavaClass();
	}
	
	public interface JMetadataType<T, C extends JMetaConstructors> extends JMetadata<T,C> {
		
		Type<T> getType();
		
		Class<T> getJavaClass();
		
		JMetadataInstance newInstance(T t);
	}
	
	public interface JMetadataInstance extends JMetadata<Void,JMetaConstructors> {
		
	}

	public interface CopyConstructored<T> {

		JMetaCopyConstructor<T> copyConstructor();
	}

	public interface JMetaMethod<R, RT extends Type<R>> {

		RT returnType();
	}

	public interface JMetaMethod0<C, R, RT extends Type<R>> extends JMetaMethod<R, RT> {

	}

	public interface JMetaClassMethod0<T, R, RT extends Type<R>> extends JMetaMethod0<T, R, RT> {

		R invoke(T t);
	}

	public interface JMetaInstanceMethod0<R, RT extends Type<R>> extends JMetaMethod0<Void, R, RT> {
		R invoke();
	}

	public interface JMetaMethod1<C, P1, R, RT extends Type<R>> extends JMetaMethod<R, RT> {

	}
	
	public interface JMetaClassMethod1<C, P1, R, RT extends Type<R>> extends JMetaMethod1<C, P1, R, RT> {

		R invoke(C c, P1 p1);

	}

	public interface JMetaInstanceMethod1<P1, JMP1 extends JMetaParameter<?, ?>, R, RT extends Type<R>> extends JMetaMethod1<Void, P1, R, RT> {
		R invoke(P1 p1);

		JMP1 parameter1();

		Tuple1<JMetaParameter<? extends JMetadata<P1, ?>, JMetaInstanceMethod1<P1, JMP1, R, RT>>> parameters();
	}

	public interface JMetaParameter<JMT extends JMetadata<?, ?>, M extends JMetaMethod<?, ?>> {

		JMT jmeta();
		
		M method();
	}

}
