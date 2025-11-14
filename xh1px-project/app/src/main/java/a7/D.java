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
public final class D extends AbstractC0802k {

    /* renamed from: g, reason: collision with root package name */
    public int f7802g;

    /* renamed from: h, reason: collision with root package name */
    public List f7803h;

    /* renamed from: i, reason: collision with root package name */
    public List f7804i;
    public List j;
    public Z k;

    /* renamed from: l, reason: collision with root package name */
    public g0 f7805l;

    /* JADX WARN: Type inference failed for: r0v0, types: [a7.D, g7.k] */
    public static D h() {
        ?? abstractC0802k = new AbstractC0802k();
        List list = Collections.EMPTY_LIST;
        abstractC0802k.f7803h = list;
        abstractC0802k.f7804i = list;
        abstractC0802k.j = list;
        abstractC0802k.k = Z.j;
        abstractC0802k.f7805l = g0.f8097h;
        return abstractC0802k;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        E g8 = g();
        if (g8.b()) {
            return g8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        D h8 = h();
        h8.i(g());
        return h8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        E e9 = null;
        try {
            try {
                E.f7807o.getClass();
                i(new E(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                E e11 = (E) e10.f12155d;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    e9 = e11;
                    if (e9 != null) {
                        i(e9);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (e9 != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        i((E) oVar);
        return this;
    }

    public final E g() {
        E e9 = new E(this);
        int i4 = this.f7802g;
        int i8 = 1;
        if ((i4 & 1) == 1) {
            this.f7803h = Collections.unmodifiableList(this.f7803h);
            this.f7802g &= -2;
        }
        e9.f7810g = this.f7803h;
        if ((this.f7802g & 2) == 2) {
            this.f7804i = Collections.unmodifiableList(this.f7804i);
            this.f7802g &= -3;
        }
        e9.f7811h = this.f7804i;
        if ((this.f7802g & 4) == 4) {
            this.j = Collections.unmodifiableList(this.j);
            this.f7802g &= -5;
        }
        e9.f7812i = this.j;
        if ((i4 & 8) != 8) {
            i8 = 0;
        }
        e9.j = this.k;
        if ((i4 & 16) == 16) {
            i8 |= 2;
        }
        e9.k = this.f7805l;
        e9.f7809f = i8;
        return e9;
    }

    public final void i(E e9) {
        g0 g0Var;
        Z z8;
        if (e9 == E.f7806n) {
            return;
        }
        if (!e9.f7810g.isEmpty()) {
            if (this.f7803h.isEmpty()) {
                this.f7803h = e9.f7810g;
                this.f7802g &= -2;
            } else {
                if ((this.f7802g & 1) != 1) {
                    this.f7803h = new ArrayList(this.f7803h);
                    this.f7802g |= 1;
                }
                this.f7803h.addAll(e9.f7810g);
            }
        }
        if (!e9.f7811h.isEmpty()) {
            if (this.f7804i.isEmpty()) {
                this.f7804i = e9.f7811h;
                this.f7802g &= -3;
            } else {
                if ((this.f7802g & 2) != 2) {
                    this.f7804i = new ArrayList(this.f7804i);
                    this.f7802g |= 2;
                }
                this.f7804i.addAll(e9.f7811h);
            }
        }
        if (!e9.f7812i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = e9.f7812i;
                this.f7802g &= -5;
            } else {
                if ((this.f7802g & 4) != 4) {
                    this.j = new ArrayList(this.j);
                    this.f7802g |= 4;
                }
                this.j.addAll(e9.f7812i);
            }
        }
        if ((e9.f7809f & 1) == 1) {
            Z z9 = e9.j;
            if ((this.f7802g & 8) == 8 && (z8 = this.k) != Z.j) {
                C0446g i4 = Z.i(z8);
                i4.j(z9);
                this.k = i4.g();
            } else {
                this.k = z9;
            }
            this.f7802g |= 8;
        }
        if ((e9.f7809f & 2) == 2) {
            g0 g0Var2 = e9.k;
            if ((this.f7802g & 16) == 16 && (g0Var = this.f7805l) != g0.f8097h) {
                C0454o c0454o = new C0454o(2);
                c0454o.f8198g = Collections.EMPTY_LIST;
                c0454o.m(g0Var);
                c0454o.m(g0Var2);
                this.f7805l = c0454o.i();
            } else {
                this.f7805l = g0Var2;
            }
            this.f7802g |= 16;
        }
        f(e9);
        this.f11240d = this.f11240d.h(e9.f7808e);
    }
}
