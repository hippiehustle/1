package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes.dex */
public final class O extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public int f7902e;

    /* renamed from: f, reason: collision with root package name */
    public P f7903f;

    /* renamed from: g, reason: collision with root package name */
    public T f7904g;

    /* renamed from: h, reason: collision with root package name */
    public int f7905h;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, a7.O] */
    public static O g() {
        ?? abstractC0801j = new AbstractC0801j();
        abstractC0801j.f7903f = P.INV;
        abstractC0801j.f7904g = T.f7932w;
        return abstractC0801j;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        Q f8 = f();
        if (f8.b()) {
            return f8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        O g8 = g();
        g8.h(f());
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        Q q6 = null;
        try {
            try {
                Q.f7912l.getClass();
                h(new Q(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                Q q8 = (Q) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    q6 = q8;
                    if (q6 != null) {
                        h(q6);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (q6 != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        h((Q) oVar);
        return this;
    }

    public final Q f() {
        Q q6 = new Q(this);
        int i4 = this.f7902e;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        q6.f7915f = this.f7903f;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        q6.f7916g = this.f7904g;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        q6.f7917h = this.f7905h;
        q6.f7914e = i8;
        return q6;
    }

    public final void h(Q q6) {
        T t8;
        if (q6 == Q.k) {
            return;
        }
        if ((q6.f7914e & 1) == 1) {
            P p8 = q6.f7915f;
            p8.getClass();
            this.f7902e = 1 | this.f7902e;
            this.f7903f = p8;
        }
        if ((q6.f7914e & 2) == 2) {
            T t9 = q6.f7916g;
            if ((this.f7902e & 2) == 2 && (t8 = this.f7904g) != T.f7932w) {
                S r8 = T.r(t8);
                r8.i(t9);
                this.f7904g = r8.g();
            } else {
                this.f7904g = t9;
            }
            this.f7902e |= 2;
        }
        if ((q6.f7914e & 4) == 4) {
            int i4 = q6.f7917h;
            this.f7902e = 4 | this.f7902e;
            this.f7905h = i4;
        }
        this.f11240d = this.f11240d.h(q6.f7913d);
    }
}
