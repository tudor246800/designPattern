package com.neal.HeadFirstPractise.decorate.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	public int read() throws IOException {
		int c = super.read();
		return (c == -1) ? c : Character.toLowerCase((char) c);
	}

	public int read(byte[] b, int off, int len) throws IOException {
		int result = super.read(b, off, len);
		for (int i = off; i < off + b.length; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}

		return result;
	}

}
