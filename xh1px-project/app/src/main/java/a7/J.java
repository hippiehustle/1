package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes.dex */
public final class J extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public int f7874e;

    /* renamed from: f, reason: collision with root package name */
    public int f7875f;

    /* renamed from: g, reason: collision with root package name */
    public int f7876g;

    /* renamed from: h, reason: collision with root package name */
    public K f7877h;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, a7.J] */
    public static J g() {
        ?? abstractC0801j = new AbstractC0801j();
        abstractC0801j.f7875f = -1;
        abstractC0801j.f7877h = K.PACKAGE;
        return abstractC0801j;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        L f8 = f();
        if (f8.b()) {
            return f8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        J g8 = g();
        g8.h(f());
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        L l6 = null;
        try {
            try {
                L.f7883l.getClass();
                h(new L(c0797f));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                L l8 = (L) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    l6 = l8;
                    if (l6 != null) {
                        h(l6);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (l6 != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        h((L) oVar);
        return this;
    }

    public final L f() {
        L l6 = new L(this);
        int i4 = this.f7874e;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        l6.f7886f = this.f7875f;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        l6.f7887g = this.f7876g;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        l6.f7888h = this.f7877h;
        l6.f7885e = i8;
        return l6;
    }

    public final void h(L l6) {
        if (l6 == L.k) {
            return;
        }
        int i4 = l6.f7885e;
        if ((i4 & 1) == 1) {
            int i8 = l6.f7886f;
            this.f7874e = 1 | this.f7874e;
            this.f7875f = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = l6.f7887g;
            this.f7874e = 2 | this.f7874e;
            this.f7876g = i9;
        }
        if ((i4 & 4) == 4) {
            K k = l6.f7888h;
            k.getClass();
            this.f7874e = 4 | this.f7874e;
            this.f7877h = k;
        }
        this.f11240d = this.f11240d.h(l6.f7884d);
    }
}
