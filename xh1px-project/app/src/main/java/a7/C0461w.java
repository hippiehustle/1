package a7;

import g7.AbstractC0793b;
import g7.AbstractC0801j;
import g7.C0797f;
import g7.C0799h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* renamed from: a7.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0461w extends AbstractC0801j implements g7.u {

    /* renamed from: e, reason: collision with root package name */
    public int f8237e;

    /* renamed from: f, reason: collision with root package name */
    public int f8238f;

    /* renamed from: g, reason: collision with root package name */
    public int f8239g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC0462x f8240h;

    /* renamed from: i, reason: collision with root package name */
    public T f8241i;
    public int j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public List f8242l;

    /* JADX WARN: Type inference failed for: r0v0, types: [g7.j, a7.w] */
    public static C0461w g() {
        ?? abstractC0801j = new AbstractC0801j();
        abstractC0801j.f8240h = EnumC0462x.TRUE;
        abstractC0801j.f8241i = T.f7932w;
        List list = Collections.EMPTY_LIST;
        abstractC0801j.k = list;
        abstractC0801j.f8242l = list;
        return abstractC0801j;
    }

    @Override // g7.AbstractC0801j
    public final AbstractC0793b c() {
        C0463y f8 = f();
        if (f8.b()) {
            return f8;
        }
        throw new UninitializedMessageException();
    }

    public final Object clone() {
        C0461w g8 = g();
        g8.h(f());
        return g8;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    @Override // g7.AbstractC0801j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0801j d(C0797f c0797f, C0799h c0799h) {
        C0463y c0463y = null;
        try {
            try {
                C0463y.f8249p.getClass();
                h(new C0463y(c0797f, c0799h));
                return this;
            } catch (InvalidProtocolBufferException e9) {
                C0463y c0463y2 = (C0463y) e9.f12155d;
                try {
                    throw e9;
                } catch (Throwable th) {
                    th = th;
                    c0463y = c0463y2;
                    if (c0463y != null) {
                        h(c0463y);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0463y != null) {
            }
            throw th;
        }
    }

    @Override // g7.AbstractC0801j
    public final /* bridge */ /* synthetic */ AbstractC0801j e(g7.o oVar) {
        h((C0463y) oVar);
        return this;
    }

    public final C0463y f() {
        C0463y c0463y = new C0463y(this);
        int i4 = this.f8237e;
        int i8 = 1;
        if ((i4 & 1) != 1) {
            i8 = 0;
        }
        c0463y.f8252f = this.f8238f;
        if ((i4 & 2) == 2) {
            i8 |= 2;
        }
        c0463y.f8253g = this.f8239g;
        if ((i4 & 4) == 4) {
            i8 |= 4;
        }
        c0463y.f8254h = this.f8240h;
        if ((i4 & 8) == 8) {
            i8 |= 8;
        }
        c0463y.f8255i = this.f8241i;
        if ((i4 & 16) == 16) {
            i8 |= 16;
        }
        c0463y.j = this.j;
        if ((i4 & 32) == 32) {
            this.k = Collections.unmodifiableList(this.k);
            this.f8237e &= -33;
        }
        c0463y.k = this.k;
        if ((this.f8237e & 64) == 64) {
            this.f8242l = Collections.unmodifiableList(this.f8242l);
            this.f8237e &= -65;
        }
        c0463y.f8256l = this.f8242l;
        c0463y.f8251e = i8;
        return c0463y;
    }

    public final void h(C0463y c0463y) {
        T t8;
        if (c0463y == C0463y.f8248o) {
            return;
        }
        int i4 = c0463y.f8251e;
        if ((i4 & 1) == 1) {
            int i8 = c0463y.f8252f;
            this.f8237e = 1 | this.f8237e;
            this.f8238f = i8;
        }
        if ((i4 & 2) == 2) {
            int i9 = c0463y.f8253g;
            this.f8237e = 2 | this.f8237e;
            this.f8239g = i9;
        }
        if ((i4 & 4) == 4) {
            EnumC0462x enumC0462x = c0463y.f8254h;
            enumC0462x.getClass();
            this.f8237e = 4 | this.f8237e;
            this.f8240h = enumC0462x;
        }
        if ((c0463y.f8251e & 8) == 8) {
            T t9 = c0463y.f8255i;
            if ((this.f8237e & 8) == 8 && (t8 = this.f8241i) != T.f7932w) {
                S r8 = T.r(t8);
                r8.i(t9);
                this.f8241i = r8.g();
            } else {
                this.f8241i = t9;
            }
            this.f8237e |= 8;
        }
        if ((c0463y.f8251e & 16) == 16) {
            int i10 = c0463y.j;
            this.f8237e = 16 | this.f8237e;
            this.j = i10;
        }
        if (!c0463y.k.isEmpty()) {
            if (this.k.isEmpty()) {
                this.k = c0463y.k;
                this.f8237e &= -33;
            } else {
                if ((this.f8237e & 32) != 32) {
                    this.k = new ArrayList(this.k);
                    this.f8237e |= 32;
                }
                this.k.addAll(c0463y.k);
            }
        }
        if (!c0463y.f8256l.isEmpty()) {
            if (this.f8242l.isEmpty()) {
                this.f8242l = c0463y.f8256l;
                this.f8237e &= -65;
            } else {
                if ((this.f8237e & 64) != 64) {
                    this.f8242l = new ArrayList(this.f8242l);
                    this.f8237e |= 64;
                }
                this.f8242l.addAll(c0463y.f8256l);
            }
        }
        this.f11240d = this.f11240d.h(c0463y.f8250d);
    }
}
