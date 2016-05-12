package com.gifisan.nio.component.protocol.tcp;

import java.io.IOException;
import java.io.InputStream;

import com.gifisan.nio.component.TCPEndPoint;
import com.gifisan.nio.component.IOEventHandle;
import com.gifisan.nio.component.IOWriteFuture;
import com.gifisan.nio.component.Session;

public interface ProtocolEncoder {

	public abstract IOWriteFuture encode(TCPEndPoint endPoint,Session session, String serviceName, byte[] array, InputStream inputStream,
			IOEventHandle handle) throws IOException;

}