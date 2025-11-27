package com.rays.io.externlizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	public int id;
	public String name;
	transient int salary;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
		out.writeInt(salary);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		name = (String) in.readObject();
		salary = in.readInt();
	}

}
//“Externalizable me writeExternal() aur readExternal() hoti hain, jisse hum data ko forcefully read/write karwate hain.”