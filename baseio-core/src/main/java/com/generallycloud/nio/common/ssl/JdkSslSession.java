
package com.generallycloud.nio.common.ssl;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import java.security.Principal;
import java.security.cert.Certificate;

final class JdkSslSession implements SSLSession, ApplicationProtocolAccessor {
    private final SSLEngine engine;
    private volatile String applicationProtocol;

    JdkSslSession(SSLEngine engine) {
        this.engine = engine;
    }

    private SSLSession unwrap() {
        return engine.getSession();
    }

    @Override
    public String getProtocol() {
        return unwrap().getProtocol();
    }

    @Override
    public String getApplicationProtocol() {
        return applicationProtocol;
    }

    void setApplicationProtocol(String applicationProtocol) {
        this.applicationProtocol = applicationProtocol;
    }

    @Override
    public byte[] getId() {
        return unwrap().getId();
    }

    @Override
    public SSLSessionContext getSessionContext() {
        return unwrap().getSessionContext();
    }

    @Override
    public long getCreationTime() {
        return unwrap().getCreationTime();
    }

    @Override
    public long getLastAccessedTime() {
        return unwrap().getLastAccessedTime();
    }

    @Override
    public void invalidate() {
        unwrap().invalidate();
    }

    @Override
    public boolean isValid() {
        return unwrap().isValid();
    }

    @Override
    public void putValue(String s, Object o) {
        unwrap().putValue(s, o);
    }

    @Override
    public Object getValue(String s) {
        return unwrap().getValue(s);
    }

    @Override
    public void removeValue(String s) {
        unwrap().removeValue(s);
    }

    @Override
    public String[] getValueNames() {
        return unwrap().getValueNames();
    }

    @Override
    public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
        return unwrap().getPeerCertificates();
    }

    @Override
    public Certificate[] getLocalCertificates() {
        return unwrap().getLocalCertificates();
    }

    @Override
    public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
        return unwrap().getPeerCertificateChain();
    }

    @Override
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return unwrap().getPeerPrincipal();
    }

    @Override
    public Principal getLocalPrincipal() {
        return unwrap().getLocalPrincipal();
    }

    @Override
    public String getCipherSuite() {
        return unwrap().getCipherSuite();
    }

    @Override
    public String getPeerHost() {
        return unwrap().getPeerHost();
    }

    @Override
    public int getPeerPort() {
        return unwrap().getPeerPort();
    }

    @Override
    public int getPacketBufferSize() {
        return unwrap().getPacketBufferSize();
    }

    @Override
    public int getApplicationBufferSize() {
        return unwrap().getApplicationBufferSize();
    }
}
