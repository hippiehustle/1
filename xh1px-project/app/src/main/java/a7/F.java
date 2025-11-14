package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.AbstractC0802k;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes.dex */
public final class F extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f7815g;

    /* renamed from: h, reason: collision with root package name */
    public N f7816h;

    /* renamed from: i, reason: collision with root package name */
    public M f7817i;
    public E j;
    public List k;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.k, a7.F] */
    public static F h() {
        ?? abstractC0802k = new AbstractC0802k();
        abstractC0802k.f7816h = N.f7896h;
        abstractC0802k.f7817i = M.f7890h;
        abstractC0802k.j = E.f7806n;
        abstractC0802k.k = Collections.EMPTY_LIST;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        G g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        F h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        G g8 = null;
        try {
            try {
                G.f7819n.getClass();
                i(new G(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                G g9 = (G) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    g8 = g9;
                    if (g8 != null) {
                        i(g8);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (g8 != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((G) oVar);
        return this;
    }

    public final G g() {
        G g8 = new G(this);
        int i4 = this.f7815g;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        g8.f7822g = this.f7816h;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        g8.f7823h = this.f7817i;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        g8.f7824i = this.j;
        if ((i4 & 8) == 8) {
            this.k = Collections.unmodifiableList(this.k);
            this.f7815g &= -9;
        }
        g8.j = this.k;
        g8.f7821f = i8;
        return g8;
    }

    public final void i(G g8) {
        E e9;
        M m6;
        N n3;
        if (g8 == G.f7818m) {
            return;
        }
        if ((g8.f7821f & 1) == 1) {
            N n8 = g8.f7822g;
            if ((this.f7815g & 1) == 1 && (n3 = this.f7816h) != N.f7896h) {
                C0454o c0454o = new C0454o(3);
                c0454o.f8198g = g7.r.f11253e;
                c0454o.l(n3);
                c0454o.l(n8);
                this.f7816h = c0454o.h();
            } else {
                this.f7816h = n8;
            }
            this.f7815g |= 1;
        }
        if ((g8.f7821f & 2) == 2) {
            M m8 = g8.f7823h;
            if ((this.f7815g & 2) == 2 && (m6 = this.f7817i) != M.f7890h) {
                C0454o c0454o2 = new C0454o(1);
                c0454o2.f8198g = Collections.EMPTY_LIST;
                c0454o2.k(m6);
                c0454o2.k(m8);
                this.f7817i = c0454o2.g();
            } else {
                this.f7817i = m8;
            }
            this.f7815g |= 2;
        }
        if ((g8.f7821f & 4) == 4) {
            E e10 = g8.f7824i;
            if ((this.f7815g & 4) == 4 && (e9 = this.j) != E.f7806n) {
                D h8 = D.h();
                h8.i(e9);
                h8.i(e10);
                this.j = h8.g();
            } else {
                this.j = e10;
            }
            this.f7815g |= 4;
        }
        if (!g8.j.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = g8.j;
                this.f7815g &= -9;
            } else {
                if ((this.f7815g & 8) != 8) {
                    this.k = new ArrayList(this.k);
                    this.f7815g |= 8;
                }
                this.k.addAll(g8.j);
            }
        }
        f(g8);
        this.f11240d = this.f11240d.h(g8.f7820e);
    }
}
