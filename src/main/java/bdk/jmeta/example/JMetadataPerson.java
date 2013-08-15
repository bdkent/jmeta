package bdk.jmeta.example;

import java.util.List;

import bdk.jmeta.core.JMeta.CopyConstructored;
import bdk.jmeta.core.JMeta.JMetaClassMethod0;
import bdk.jmeta.core.JMeta.JMetaClassMethod1;
import bdk.jmeta.core.JMeta.JMetaInstanceMethod0;
import bdk.jmeta.core.JMeta.JMetaInstanceMethod1;
import bdk.jmeta.core.JMeta.JMetaMethod0;
import bdk.jmeta.core.JMeta.JMetaMethod1;
import bdk.jmeta.core.JMeta.JMetadata;
import bdk.jmeta.core.JMeta.JMetadataInstance;
import bdk.jmeta.core.JMeta.JMetadataType;
import bdk.jmeta.core.JMetaConstructors;
import bdk.jmeta.core.JMetaConstructors.JMetaConstructor2;
import bdk.jmeta.core.JMetaConstructors.JMetaConstructors1;
import bdk.jmeta.core.support.Types.Type;
import bdk.jmeta.core.support.Types.Type1;
import bdk.jmeta.javastd.java.lang.JMetadataString.JMetaParameterString;
import bdk.jmeta.javastd.java.lang.JMetadataString.JMetaTypeString;

public interface JMetadataPerson<T, C extends JMetaConstructors> extends JMetadata<T, C> {

	JMetaMethod0<T, String, JMetaTypeString> getFirst();

	JMetaMethod0<T, String, JMetaTypeString> getLast();

	JMetaMethod0<T, Void, Type<Void>> eat();

	public interface Method1Talk<T> extends JMetaMethod1<T, String, String, JMetaTypeString> {

		JMetaParameterString<Method1Talk<T>> words();

		@Override
		JMetaTypeString returnType();
	}

	Method1Talk<T> talk();

	public interface Method0GetChildren<T> extends JMetaMethod0<T, List<Person>, Type1<List<Person>, Type<Person>>> {
	}

	Method0GetChildren<T> getChildren();

	public interface PersonConstructors extends JMetaConstructors1<Person, JMetaConstructor2<String, String, Person>> {
	}

	public interface JMetaPersonClass extends JMetadataPerson<Person, PersonConstructors>, JMetadataType<Person, PersonConstructors>, CopyConstructored<Person> {

		JMetaConstructor2<String, String, Person> constructor();

		@Override
		JMetaClassMethod0<Person, String, JMetaTypeString> getFirst();

		@Override
		JMetaClassMethod0<Person, String, JMetaTypeString> getLast();

		@Override
		JMetaClassMethod0<Person, Void, Type<Void>> eat();

		public interface Method1TalkClass extends JMetaClassMethod1<Person, String, String, JMetaTypeString>, Method1Talk<Person> {

		}

		@Override
		Method1TalkClass talk();

		public interface Method0GetChildrenClass extends JMetaClassMethod0<Person, List<Person>, Type1<List<Person>, Type<Person>>>, Method0GetChildren<Person> {

		}
		
		@Override
		Method0GetChildrenClass getChildren();
		
		@Override
		JMetaPersonInstance newInstance(Person t);
	}

	public interface JMetaPersonInstance extends JMetadataPerson<Void, JMetaConstructors>, JMetadataInstance {

		@Override
		JMetaInstanceMethod0<String, JMetaTypeString> getFirst();

		@Override
		JMetaInstanceMethod0<String, JMetaTypeString> getLast();

		@Override
		JMetaInstanceMethod0<Void, Type<Void>> eat();

		public interface Method1TalkInstance extends JMetaInstanceMethod1<String, JMetaParameterString<Method1TalkInstance>, String, JMetaTypeString>, Method1Talk<Void> {

		}

		@Override
		Method1TalkInstance talk();
		
		

		public interface Method0GetChildrenInstance extends JMetaInstanceMethod0<List<Person>, Type1<List<Person>, Type<Person>>>, Method0GetChildren<Void> {

		}

		@Override
		Method0GetChildrenInstance getChildren();
	}
}
