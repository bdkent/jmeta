package bdk.jmeta.javastd.java.lang;

import bdk.jmeta.core.JMeta.CopyConstructored;
import bdk.jmeta.core.JMeta.JMetaClassMethod0;
import bdk.jmeta.core.JMeta.JMetaInstanceMethod0;
import bdk.jmeta.core.JMeta.JMetaMethod;
import bdk.jmeta.core.JMeta.JMetaMethod0;
import bdk.jmeta.core.JMeta.JMetaParameter;
import bdk.jmeta.core.JMeta.JMetadata;
import bdk.jmeta.core.JMeta.JMetadataInstance;
import bdk.jmeta.core.JMeta.JMetadataType;
import bdk.jmeta.core.JMetaConstructors;
import bdk.jmeta.core.JMetaConstructors.JMetaConstructors1;
import bdk.jmeta.core.JMetaConstructors.JMetaCopyConstructor;
import bdk.jmeta.core.support.Types.Type;

public interface JMetadataString<T, C extends JMetaConstructors> extends JMetadata<T, C>, CopyConstructored<T> {

	JMetaMethod0<T, Integer, Type<Integer>> length();

	JMetaMethod0<T, String, JMetaTypeString> toUpperCase();

	public interface JMetadataStringConstructor<T> extends JMetaConstructors1<T, JMetaCopyConstructor<T>> {

	}

	public interface JMetaStringClass extends JMetadataString<String, JMetadataStringConstructor<String>>, JMetadataType<String, JMetadataStringConstructor<String>> {

		JMetaTypeString getType();

		JMetaClassMethod0<String, Integer, Type<Integer>> length();

		JMetaClassMethod0<String, String, JMetaTypeString> toUpperCase();
	}

	public interface JMetaTypeString extends Type<String> {

	}

	public interface JMetaParameterString<M extends JMetaMethod<?, ?>> extends JMetaParameter<JMetaStringClass, M> {

	}

	public interface JMetaStringInstance extends JMetadataString<Void, JMetaConstructors>, JMetadataInstance {

		JMetaInstanceMethod0<String, JMetaTypeString> getFirst();

		JMetaInstanceMethod0<String, JMetaTypeString> toUpperCase();
	}
}