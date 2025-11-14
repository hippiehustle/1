package w6;

import C6.InterfaceC0019u;
import a6.AbstractC0436k;
import a7.C0439A;
import a7.C0440a;
import c7.C0587f;
import g7.AbstractC0793b;
import g7.C0797f;
import g7.C0799h;
import h7.C0845h;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import n6.InterfaceC1163b;
import o6.AbstractC1284c;
import t0.C1536c;
import u6.InterfaceC1642c;
import u6.InterfaceC1644e;
import u6.InterfaceC1645f;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public class u0 extends o6.w {
    public static F i(AbstractC1284c abstractC1284c) {
        InterfaceC1644e g8 = abstractC1284c.g();
        if (g8 instanceof F) {
            return (F) g8;
        }
        return C1717d.f15848e;
    }

    @Override // o6.w
    public final InterfaceC1645f a(o6.i iVar) {
        F i4 = i(iVar);
        String str = iVar.f13631g;
        String str2 = iVar.f13632h;
        Object obj = iVar.f13629e;
        o6.j.e(i4, "container");
        return new H(i4, str, str2, null, obj);
    }

    @Override // o6.w
    public final InterfaceC1642c b(Class cls) {
        return AbstractC1716c.a(cls);
    }

    @Override // o6.w
    public final InterfaceC1644e c(Class cls) {
        Object putIfAbsent;
        C1536c c1536c = AbstractC1716c.f15845a;
        o6.j.e(cls, "jClass");
        C1536c c1536c2 = AbstractC1716c.f15846b;
        c1536c2.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c1536c2.f14809f;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls, (obj = ((InterfaceC1163b) c1536c2.f14808e).m(cls)))) != null) {
            obj = putIfAbsent;
        }
        return (InterfaceC1644e) obj;
    }

    @Override // o6.w
    public final u6.i d(o6.m mVar) {
        return new L(i(mVar), mVar.f13631g, mVar.f13632h, mVar.f13629e);
    }

    @Override // o6.w
    public final u6.p e(o6.o oVar) {
        return new Z(i(oVar), oVar.f13631g, oVar.f13632h, oVar.f13629e);
    }

    @Override // o6.w
    public final u6.r f(o6.p pVar) {
        return new c0(i(pVar), pVar.f13631g, pVar.f13632h, pVar.f13629e);
    }

    @Override // o6.w
    public final String g(o6.h hVar) {
        H b4;
        Metadata metadata = (Metadata) hVar.getClass().getAnnotation(Metadata.class);
        H h8 = null;
        if (metadata != null) {
            String[] d12 = metadata.d1();
            if (d12.length == 0) {
                d12 = null;
            }
            if (d12 != null) {
                String[] d2 = metadata.d2();
                C0799h c0799h = e7.g.f10671a;
                o6.j.e(d2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e7.a.a(d12));
                C0799h c0799h2 = e7.g.f10671a;
                e7.f g8 = e7.g.g(byteArrayInputStream, d2);
                C0799h c0799h3 = e7.g.f10671a;
                C0440a c0440a = C0439A.f7776C;
                c0440a.getClass();
                C0797f c0797f = new C0797f(byteArrayInputStream);
                AbstractC0793b abstractC0793b = (AbstractC0793b) c0440a.a(c0797f, c0799h3);
                boolean z8 = false;
                try {
                    c0797f.a(0);
                    if (abstractC0793b.b()) {
                        C0439A c0439a = (C0439A) abstractC0793b;
                        int[] mv = metadata.mv();
                        if ((metadata.xi() & 8) != 0) {
                            z8 = true;
                        }
                        C0587f c0587f = new C0587f(mv, z8);
                        Class<?> cls = hVar.getClass();
                        a7.Z z9 = c0439a.f7791t;
                        o6.j.d(z9, "getTypeTable(...)");
                        h8 = new H(C1717d.f15848e, (F6.N) y0.f(cls, c0439a, g8, new F6.B(z9), c0587f, v6.a.f15544l));
                    } else {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                        invalidProtocolBufferException.f12155d = abstractC0793b;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e9) {
                    e9.f12155d = abstractC0793b;
                    throw e9;
                }
            }
        }
        if (h8 != null && (b4 = y0.b(h8)) != null) {
            C0845h c0845h = v0.f15919a;
            InterfaceC0019u o7 = b4.o();
            StringBuilder sb = new StringBuilder();
            v0.a(o7, sb);
            List z02 = o7.z0();
            o6.j.d(z02, "getValueParameters(...)");
            AbstractC0436k.u0(z02, sb, ", ", "(", ")", C1715b.f15841l, 48);
            sb.append(" -> ");
            AbstractC1759v r8 = o7.r();
            o6.j.b(r8);
            sb.append(v0.d(r8));
            return sb.toString();
        }
        return super.g(hVar);
    }

    @Override // o6.w
    public final String h(o6.l lVar) {
        return g(lVar);
    }
}
