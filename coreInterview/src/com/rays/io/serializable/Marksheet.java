package com.rays.io.serializable;

import java.io.Serializable;

public class Marksheet implements Serializable {
	public String name;
	public int physics, chemistry, maths;
	transient int total = physics + chemistry + maths;
//    transient keyword kisi variable ko serialization ke waqt skip kar deta hai, taaki wo file me save na ho.
//JVM trantient variable ko skip kr deta h at the time of serialization for security purpose
}
